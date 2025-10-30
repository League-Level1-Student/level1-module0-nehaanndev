package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
		JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "Follow you dreams.");
		}
		else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You will reach success through hardwork.");
		}
		else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "It is okay to take time for yourself.");
		}
		else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "Surround yourself with those who care.");
		}
		else if (rand == 4) {
			JOptionPane.showMessageDialog(null, "Sleep is important, just like you.");
		} else {
			JOptionPane.showMessageDialog(null, "A error occured.");
		}
	}
}

