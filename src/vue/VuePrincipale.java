package vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VuePrincipale extends JFrame {
	private JTable table;

	public static void main(String[] args) throws Exception {
		new VuePrincipale();
	}

	public VuePrincipale() {
		getContentPane().setLayout(null);



		String data[][] = { { "Vinod", "5000", "Java" },
				{ "Deepak", "14000", "developer" },
				{ "Sushil", "20000", "writter" },
				{ "Chandan", "15000", "Programmer" } };
		String col[] = { "Emp_name", "Emp_sal", "Depart" };
		
		table = new JTable(data,col);
		table.setBounds(105, 112, 1, 1);

		table.setRowHeight(40);
		table.setRowMargin(4);

		getContentPane().add(table);
		this.initialize();
	}

	public void initialize() {
		this.setVisible(true);
		//http://www.roseindia.net/java/example/java/swing/GetRowsAndCols.shtml
	}
}
