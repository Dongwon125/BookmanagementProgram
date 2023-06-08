package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.BookAdder;
import gui.BookViewer;
import gui.DefaultFrame;

public class ButtonViewListener implements ActionListener {
	DefaultFrame Frame;
	public ButtonViewListener(DefaultFrame Frame) {
		this.Frame = Frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		BookViewer viewer = Frame.getBookviewer();
		Frame.setupPanel(viewer);
	}

}
