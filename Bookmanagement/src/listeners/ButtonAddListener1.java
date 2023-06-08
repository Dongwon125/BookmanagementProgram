package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.BookAdder;
import gui.BookAdderG;
import gui.DefaultFrame;

public class ButtonAddListener1 implements ActionListener {
	DefaultFrame Frame;
	public ButtonAddListener1(DefaultFrame Frame) {
		this.Frame = Frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		BookAdderG adderg = Frame.getBookadderg();
		Frame.setupPanel(adderg);
	}

}
