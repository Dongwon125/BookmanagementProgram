package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import listeners.ButtonGoBackMenu;

public class BookDeleter extends JPanel{
	DefaultFrame Frame;
	public BookDeleter(DefaultFrame frame) {
		this.Frame = frame;
		
		JPanel p = new JPanel();
		JLabel label = new JLabel("TYPE BookID :");
		JButton b1 = new JButton("DELETE");
		JButton b2 = new JButton("cancel");
		JTextField tf = new JTextField(15);
		
		p.add(label);
		p.add(tf);
		p.add(b1);
		p.add(b2);
		b1.addActionListener(new ButtonGoBackMenu(Frame));
		b2.addActionListener(new ButtonGoBackMenu(Frame));
		
		this.add(p);
		
	}

}
