package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.BookAdder;
import gui.BookAdderG;
import gui.DefaultFrame;
import gui.FictionD;
import gui.RomanceD;
import gui.ThrilerD;

public class ButtonThrilerListener implements ActionListener {
	DefaultFrame Frame;
	public ButtonThrilerListener(DefaultFrame Frame) {
		this.Frame = Frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		ThrilerD thrilerd = Frame.getTd();
		Frame.setupPanel(thrilerd);
	}

}
