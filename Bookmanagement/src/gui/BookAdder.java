package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listeners.ButtonAddListener;
import listeners.ButtonGoBackMenu;



public class BookAdder extends JPanel {
	DefaultFrame Frame;
	public BookAdder(DefaultFrame frame) {
		this.Frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		JLabel Add = new JLabel("Add Book");
		
		JLabel labelTitle = new JLabel("Book's Title :", JLabel.TRAILING);
		JTextField fieldTitle = new JTextField(20);
		labelTitle.setLabelFor(fieldTitle);
		panel.add(labelTitle);
		panel.add(fieldTitle);
		
		JLabel labelauthor = new JLabel("Book's Author :", JLabel.TRAILING);
		JTextField fieldauthor = new JTextField(20);
		labelTitle.setLabelFor(fieldauthor);
		panel.add(labelauthor);
		panel.add(fieldauthor);
		
		JLabel labelpublisher = new JLabel("Book's Publisher :", JLabel.TRAILING);
		JTextField fieldpublisher = new JTextField(20);
		labelTitle.setLabelFor(fieldpublisher);
		panel.add(labelpublisher);
		panel.add(fieldpublisher);
		
		JLabel labelId = new JLabel("Book's ID :", JLabel.TRAILING);
		JTextField fieldId = new JTextField(20);
		labelTitle.setLabelFor(fieldId);
		panel.add(labelId);
		panel.add(fieldId);
		JButton b1 = new JButton("Add");
		JButton b2 = new JButton("Cancel");
		panel.add(b1);
		panel.add(b2);
		
		b1.addActionListener(new ButtonGoBackMenu(Frame));
		b2.addActionListener(new ButtonGoBackMenu(Frame));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		
		this.add(panel);
		
		
		
	}
}
