package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.ButtonAddListener;

public class ThrilerD extends JPanel{
	DefaultFrame Frame;
	public ThrilerD(DefaultFrame Frame) {
		this.Frame = Frame;
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Thriler Detail");
		JButton button1 = new JButton("Psychology Thriler");
		JButton button2 = new JButton("Crime Thriler");
		JButton button3 = new JButton("Supernatural Thriler");
		 
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		
		button1.addActionListener(new ButtonAddListener(Frame));
		button2.addActionListener(new ButtonAddListener(Frame));
		button3.addActionListener(new ButtonAddListener(Frame));
		
		
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2,BorderLayout.CENTER);
		
	}

}
