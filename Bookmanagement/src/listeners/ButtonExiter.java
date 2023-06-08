package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.BookAdder;
import gui.DefaultFrame;

public class ButtonExiter implements ActionListener {
	DefaultFrame Frame;
	public ButtonExiter(DefaultFrame Frame) {
		this.Frame = Frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		Frame.dispose();
	}

}
