package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.BookAdder;
import gui.DefaultFrame;
import gui.MenuSelection;

public class ButtonGoBackMenu implements ActionListener {
	DefaultFrame Frame;
	public ButtonGoBackMenu(DefaultFrame Frame) {
		this.Frame = Frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		MenuSelection Ms = Frame.getMenuselection();
		Frame.setupPanel(Ms);
	}

}
