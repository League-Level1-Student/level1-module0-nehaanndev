package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
		String imageURL = "https://abcbirds.org/wp-content/uploads/2019/01/BOTW-Homepage-Thumbnail_Mountain-Bluebird_Double-Brow-Imagery_Shutterstock-768x498.jpg";
		// 2. create a variable of type "Component" that will hold your image
		
		// 3. use the "createImage()" method below to initialize your Component
		Component image = createImage(imageURL);
		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("What was the main color of the bird?");
		// 7. print "CORRECT" if the user gave the right answer 
		if (answer.equalsIgnoreCase("blue")) {
			System.out.println("Correct.");
		}else {
			System.out.println("Incorrect.");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(image);

		// 10. find another image and create it (might take more than one line
		// of code)
		imageURL = "https://wildernessawareness.org/wp-content/uploads/2020/03/zh-istock-000003095919small.jpg";
		image = createImage(imageURL);
		// 11. add the second image to the quiz window
		quizWindow.add(image);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		answer = JOptionPane.showInputDialog("What type of bird is this?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (answer.equals("eagle")) {
			System.out.println("Correct.");
		}else {
			System.out.println("Incorrect.");
		}

	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
