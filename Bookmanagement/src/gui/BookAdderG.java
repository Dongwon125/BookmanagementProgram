package gui;



import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Bookmanagement1.BookManagement;
import Books.BookInput;
import listeners.ButtonAddListener;
import listeners.ButtonAddListener1;
import listeners.ButtonFairyTaleListner;
import listeners.ButtonFictionListener;
import listeners.ButtonRomanceListener;

public class BookAdderG extends JPanel{
	DefaultFrame Frame;
	BookManagement bookManagement;
	public BookAdderG(DefaultFrame Frame,BookManagement bookManagement) {
		this.Frame = Frame;
		this.bookManagement = bookManagement;
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Select Genre");
		JButton button1 = new JButton("Romance");
		JButton button2 = new JButton("Fiction");
		JButton button3 = new JButton("Thriler");
		JButton button4 = new JButton("FairyTale");
		
		
		
		button1.addActionListener(new ButtonRomanceListener(Frame));
		button2.addActionListener(new ButtonFictionListener(Frame));
		button3.addActionListener(new ButtonFictionListener(Frame));
		button4.addActionListener(new ButtonFairyTaleListner(Frame));
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2,BorderLayout.CENTER);
		
	} 
}
	


