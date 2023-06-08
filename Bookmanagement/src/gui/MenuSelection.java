package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.ButtonAddListener;
import listeners.ButtonAddListener1;
import listeners.ButtonDeleteListener;
import listeners.ButtonEditListener;
import listeners.ButtonExiter;
import listeners.ButtonViewListener;

public class MenuSelection extends JPanel{
	DefaultFrame Frame;
	public MenuSelection(DefaultFrame frame) {
		this.Frame = frame;
		this.setLayout(new BorderLayout());
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		JButton button1 = new JButton("Add Books");
		JButton button2 = new JButton("Delete Books");
		JButton button3 = new JButton("Edit Books");
		JButton button4 = new JButton("View Books");
		JButton button5 = new JButton("EXIT");
		
		button1.addActionListener(new ButtonAddListener1(Frame));
		button2.addActionListener(new ButtonDeleteListener(Frame));
		button3.addActionListener(new ButtonEditListener(Frame));
		button4.addActionListener(new ButtonViewListener(Frame));
		button5.addActionListener(new ButtonExiter(Frame));
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		
	} 
}
