package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Bookmanagement1.BookManagement;
import listeners.ButtonAddListener;
import listeners.ButtonPasswordCheck;

public class PassWord extends JPanel{
	DefaultFrame Frame;
	BookManagement bookManagement;
	public PassWord(DefaultFrame Frame,BookManagement bookManagement) {
		this.Frame = Frame;
		this.bookManagement = bookManagement;
		JPanel p = new JPanel();
		JLabel label = new JLabel("TYPE PASSWORD :");
		JButton b1 = new JButton("Log In");
		JTextField tf = new JTextField(15);
		
		p.add(label);
		p.add(tf);
		p.add(b1);
		b1.addActionListener(new ButtonPasswordCheck(Frame));
		
		this.add(p);
		 
	}

}
