package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.BookAdder;
import gui.BookEditer1;
import gui.DefaultFrame;

public class ButtonEditListener implements ActionListener {
	DefaultFrame Frame;
	public ButtonEditListener(DefaultFrame Frame) {
		this.Frame = Frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		BookEditer1 editer = Frame.getBe1();
		Frame.setupPanel(editer);
	}

}
