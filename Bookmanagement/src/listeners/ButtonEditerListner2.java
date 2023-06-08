package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.BookAdder;
import gui.BookEditer2;
import gui.DefaultFrame;

public class ButtonEditerListner2 implements ActionListener {
	DefaultFrame Frame;
	public ButtonEditerListner2(DefaultFrame Frame) {
		this.Frame = Frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		BookEditer2 edit2 = Frame.getBe2();
		Frame.setupPanel(edit2);
	}

}
