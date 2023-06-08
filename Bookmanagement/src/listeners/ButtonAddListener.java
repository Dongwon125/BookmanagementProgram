package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.BookAdder;
import gui.DefaultFrame;

public class ButtonAddListener implements ActionListener {
	DefaultFrame Frame;
	public ButtonAddListener(DefaultFrame Frame) {
		this.Frame = Frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		BookAdder adder = Frame.getBookAdder();
		Frame.setupPanel(adder);
	}

}
