package _04_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.*;

public class CutenessTV implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	JButton duckB = new JButton();
	JButton unicornB = new JButton();
	JButton frogB = new JButton();
	
	public void run() {
		frame.setSize(400,400);
		
		duckB.addActionListener(this);
		frogB.addActionListener(this);
		unicornB.addActionListener(this);
		
		duckB.setText("Click For a Duck Video");
		frogB.setText("Click For a Frog Video");
		unicornB.setText("Click For a Unicorn Video");

		
		panel.add(frogB);
		panel.add(unicornB);
		panel.add(duckB);
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=Eu4YjNuD4AA");
	}

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
	     //work on some Linux implementations
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		// TODO Auto-generated method stub
		if (buttonPressed == duckB) {
			showDucks();
		} else if (buttonPressed == frogB) {
			showFrog();
		} else if (buttonPressed == unicornB) {
			showFluffyUnicorns();
		}else {
			System.out.print("Error Occured... Could not play the video");
			JOptionPane.showMessageDialog(null, "Error Occured... ");
		}
		
	}
}
