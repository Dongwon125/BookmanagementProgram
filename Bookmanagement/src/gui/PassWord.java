package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PassWord extends JFrame{
	public PassWord() {
		this.setTitle("Book Management System");
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		JLabel label = new JLabel("TYPE PASSWORD :");
		JButton b1 = new JButton("Log In");
		JTextField tf = new JTextField(15);
		
		p.add(label);
		p.add(tf);
		p.add(b1);
		
		this.setContentPane(p);
		this.setVisible(true); 
	}

}
