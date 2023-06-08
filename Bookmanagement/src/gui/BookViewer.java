package gui;

import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Bookmanagement1.BookManagement;
import Books.BookInput;
import listeners.ButtonGoBackMenu;

public class BookViewer extends JPanel{
	DefaultFrame Frame;
	BookManagement bookManagement;
	
	public BookViewer(DefaultFrame frame,BookManagement bookManagement) {
		this.Frame = frame;
		this.bookManagement = bookManagement;
		
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Title");
		model.addColumn("Author");
		model.addColumn("Publisher");
		model.addColumn("Genre");
		model.addColumn("Detail");
		model.addColumn("ID");
		JButton b1 = new JButton("Done");
		for(int i = 0; i< bookManagement.size();i++) {
			Vector row = new Vector();
			BookInput bi = bookManagement.get(i);
			row.add(bi.getTitle());
			row.add(bi.getAuthor());
			row.add(bi.getPublisher());
			row.add(bi.getKindString());
			row.add(bi.getUserInput(bi.));
			row.add(bi.getBookId());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.add(b1);
		b1.addActionListener(new ButtonGoBackMenu(Frame));
		
	}
}
