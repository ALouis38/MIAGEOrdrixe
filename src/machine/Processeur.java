package machine;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import systeme.Processus;
import instructions.Operande;
import instructions.operations.*;

public class Processeur {

	Memoire memoire;
	Instruction registreInstruction;
	protected int compteurOrdinal;
	int e1, e2; // les adresses effeectives

	public Processeur(Memoire memoire) {
		this.memoire = memoire;
		compteurOrdinal = 1;
		registreInstruction = memoire.instruction(compteurOrdinal);

	}

	/**
	 * execute l'instruction stockée en mémoire à l'adresse courante
	 * 
	 * @param adresseCourante
	 */
	public void execute(Processus processusCourant) {
		Object obj = memoire.instruction(processusCourant.adresseCourante());
		// recup du nom de l'instruction
		String name = obj.getClass().getName();
		name = name.replace("instructions.operations.","");
		String packageExec = "machine.";
		String className = packageExec + name;		
		Class<?> clazz;
		try {
			System.out.println("----------EXECUTION PROCESSUS "+);
			clazz = Class.forName(className);
			Constructor<?> ctor;
			ctor = clazz.getConstructor(Processeur.class);
			// instanciation de la meme instruction dans le package machine 
			Object object = ctor.newInstance(new Object[] { this });
			// appel de la methode execute de cette instruction
			((Instruct) object).execute(processusCourant);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}

	public abstract class Instruct {
		public void execute(Processus processusCourant) {
			compteurOrdinal = processusCourant.adresseCourante();
			registreInstruction = memoire.instruction(compteurOrdinal);
			
			e1 = adresseEffective(registreInstruction.op1());
			e2 = adresseEffective(registreInstruction.op2());
			operer();
			// incrémentation du compteur ordinal du procesus courant
			processusCourant.adresseSuivante(compteurOrdinal++);
		}

		protected abstract void operer();

		protected Memoire memoire() {
			return memoire;
		}

		protected int e1() {
			return e1;
		}

		protected int e2() {
			return e2;
		}

		protected int compteurOrdinal() {
			return compteurOrdinal;
		}

		protected void compteurOrdinal(int pc) {
			compteurOrdinal = pc;
		}

		protected Instruction registreInstruction() {
			return registreInstruction;
		}
	}

	/**
	 * retourne l'adresse effective de l'opérande selon son type d'adressage
	 * 
	 * @param op
	 * @return
	 */
	private int adresseEffective(Operande op) {
		
		if(op!= null){
		/*	System.out.println("op " + op);
			System.out.println("symbole" + op.adressage().symbole());
			System.out.println("op1 | adressage : " + op.adressage().symbole()
					+ ", valeur : " + op.valeur());*/

			// adressage relatif
			if (op.adressage().symbole().equals("$")
					|| op.adressage().symbole().equals(""))
				return compteurOrdinal + op.valeur();
			// adressage immediat
			else if (op.adressage().symbole().equals("#")) {
				return compteurOrdinal;
			}
			// adressage relatif indirect
			else if (op.adressage().symbole().equals("@")) {
				return compteurOrdinal
						+ memoire.instruction(compteurOrdinal + op.valeur())
								.op2().valeur();
			}
		}

		return 0;
	}
}