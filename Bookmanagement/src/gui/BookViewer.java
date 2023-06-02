package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BookViewer extends JFrame{
	public BookViewer() {
		this.setTitle("VIEW Books");
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Title");
		model.addColumn("Author");
		model.addColumn("Publisher");
		model.addColumn("Genre");
		model.addColumn("ID");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300, 300); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
