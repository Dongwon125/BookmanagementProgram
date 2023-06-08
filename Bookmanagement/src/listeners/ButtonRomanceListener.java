package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.BookAdder;
import gui.BookAdderG;
import gui.DefaultFrame;
import gui.RomanceD;

public class ButtonRomanceListener implements ActionListener {
	DefaultFrame Frame;
	public ButtonRomanceListener(DefaultFrame Frame) {
		this.Frame = Frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		RomanceD romanced = Frame.getRomanced();
		Frame.setupPanel(romanced);
	}

}
