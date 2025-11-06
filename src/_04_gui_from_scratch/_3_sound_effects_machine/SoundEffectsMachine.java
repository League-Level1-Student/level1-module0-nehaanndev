package _04_gui_from_scratch._3_sound_effects_machine;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class SoundEffectsMachine implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	JButton dogB = new JButton();
	JButton church = new JButton();
	JButton fire = new JButton();
	JButton grenade = new JButton();
	JButton light = new JButton();
	
	public void run() {
		
		frame.setSize(500, 500);	
		
		
		dogB.addActionListener(this);
		dogB.setText("Press for a Dog Sound!");
		panel.add(dogB);
		 
		church.addActionListener(this);
		church.setText("Press for a Church Bell Sound!");
		panel.add(church);
		
		fire.addActionListener(this);
		fire.setText("Press for a Firetruck Sound!");
		panel.add(fire);
		
		grenade.addActionListener(this);
		grenade.setText("Press for a grenade lancher sound!");
		panel.add(grenade);
		
		light.addActionListener(this);
		light.setText("Press for a Light Switch Sound!");
		panel.add(light);
	
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed == dogB) {
			playSound("free-dog-barking-sounds-427411.mp3");
		} else if (buttonPressed == church) {
			playSound("church-bell-273815.mp3");
		}  else if (buttonPressed == fire) {
			playSound("firetruck-w-horns-0415-70775.mp3");
		} else if (buttonPressed == grenade) {
			playSound("grenade_fire_eplosion_05-96471.mp3");
		} else if (buttonPressed == light) {
			playSound("light-switch-382712.mp3");
		} else {
			JOptionPane.showMessageDialog(null, "Error...");
		}
		
		
	}
	private void playSound(String soundFile) {
		String path = "src/_04_gui_from_scratch/_3_sound_effects_machine/";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		
	}
}
