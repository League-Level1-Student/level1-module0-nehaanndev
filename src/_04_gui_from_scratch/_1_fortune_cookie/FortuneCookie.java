package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
	 public void showButton() {
		 JFrame frame = new JFrame();
		 frame.setVisible(true); 
		 JButton button = new JButton();
		 frame.add(button);
		 frame.pack();
		 button.addActionListener(this);

		 System.out.println("Button clicked");
         
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

