package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FictionD extends JFrame{
	public FictionD() {
		this.setTitle("ADD Books");
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Fiction Detail");
		JButton button1 = new JButton("Fantasy Fiction");
		JButton button2 = new JButton("Science Fiction");
		JButton button3 = new JButton("Mystery Fiction");
		 
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		
		
		
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2,BorderLayout.CENTER);
		this.setVisible(true);
	}

}
