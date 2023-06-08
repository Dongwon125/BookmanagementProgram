package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.BookAdder;
import gui.DefaultFrame;
import gui.MenuSelection;

public class ButtonPasswordCheck implements ActionListener {
	DefaultFrame Frame;
	public ButtonPasswordCheck(DefaultFrame Frame) {
		this.Frame = Frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		MenuSelection m = Frame.getMenuselection();
		Frame.setupPanel(m);
	}

}
