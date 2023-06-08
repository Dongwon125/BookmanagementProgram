package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.BookAdder;
import gui.BookAdderG;
import gui.DefaultFrame;
import gui.FictionD;
import gui.RomanceD;

public class ButtonFictionListener implements ActionListener {
	DefaultFrame Frame;
	public ButtonFictionListener(DefaultFrame Frame) {
		this.Frame = Frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		FictionD fictiond = Frame.getFictiond();
		Frame.setupPanel(fictiond);
	}

}
