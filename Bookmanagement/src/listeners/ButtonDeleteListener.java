package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.BookAdder;
import gui.BookDeleter;
import gui.DefaultFrame;

public class ButtonDeleteListener implements ActionListener {
	DefaultFrame Frame;
	public ButtonDeleteListener(DefaultFrame Frame) {
		this.Frame = Frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		BookDeleter deleter = Frame.getD();
		Frame.setupPanel(deleter);
	}

}
