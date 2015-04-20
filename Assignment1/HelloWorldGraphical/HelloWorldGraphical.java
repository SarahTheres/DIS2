import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.BoxLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class HelloWorldGraphical {
	  
	public static void main(String[] args) {
		
		JButton germanButton = new JButton("Deutsch");
		JButton englishButton = new JButton("English");
		JButton frenchButton = new JButton("Frencais");

		JFrame frame = new JFrame("Hello GUI");		
		
		Container frameContents = frame.getContentPane();
		

		JPanel panel = new JPanel();
		frameContents.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		panel.add(germanButton);
		panel.add(englishButton);
		panel.add(frenchButton);


		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 300);
		frame.setLocationRelativeTo(null); // Center on screen
		// frame.pack(); // Überschreibt die Größeneinstellung mit setSize!
		frame.setVisible(true);
	}
}