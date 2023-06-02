package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FairyTaleD extends JFrame{
	public FairyTaleD() {
		this.setTitle("ADD Books");
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("FairyTale Detail");
		JButton button1 = new JButton("FolkTale");
		JButton button2 = new JButton("Original FairyTales");
		JButton button3 = new JButton("Supernatural Thriler");
		 
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		
		
		
		
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2,BorderLayout.CENTER);
		this.setVisible(true);
	}

}
