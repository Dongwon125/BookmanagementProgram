package gui;



import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BookAdderG extends JFrame{
	public BookAdderG() {
		this.setTitle("ADD Books");
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Select Genre");
		JButton button1 = new JButton("Romance");
		JButton button2 = new JButton("Fiction");
		JButton button3 = new JButton("Thriler");
		JButton button4 = new JButton("FairyTale");
		
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2,BorderLayout.CENTER);
		this.setVisible(true);
	} 
}
	


