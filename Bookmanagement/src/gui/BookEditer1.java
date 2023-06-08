package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import listeners.ButtonEditerListner2;
import listeners.ButtonGoBackMenu;

public class BookEditer1 extends JPanel {
	DefaultFrame Frame;
	public BookEditer1(DefaultFrame frame) {
		this.Frame = frame;
		
		JPanel p = new JPanel();
		JLabel label = new JLabel("TYPE BookID :");
		JButton b1 = new JButton("Load Book");
		JButton b2 = new JButton("cancel");
		JTextField tf = new JTextField(15);
		
		p.add(label);
		p.add(tf);
		p.add(b1);
		p.add(b2);
		b1.addActionListener(new ButtonEditerListner2(Frame));
		b2.addActionListener(new ButtonGoBackMenu(Frame));
		
		this.add(p);
		
	}

}
