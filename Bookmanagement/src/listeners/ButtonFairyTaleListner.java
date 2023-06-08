package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.BookAdder;
import gui.BookAdderG;
import gui.DefaultFrame;
import gui.FairyTaleD;
import gui.FictionD;
import gui.RomanceD;

public class ButtonFairyTaleListner implements ActionListener {
	DefaultFrame Frame;
	public ButtonFairyTaleListner(DefaultFrame Frame) {
		this.Frame = Frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		FairyTaleD ftd = Frame.getFd();
		Frame.setupPanel(ftd);
	}

}
