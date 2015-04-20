//import Exceptions
import java.io.IOException;
//import Java Swing
import javax.swing.*;
//import Event Listeners
import java.awt.event.*;

import java.awt.Component;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class HelloWorldGraphical extends JFrame implements ActionListener{

	//global variable which saves text label
	JLabel label;
	//global variables for buttons
	JButton deutschButton;
	JButton englishButton;
	JButton francaisButton;
	JButton quitButton;

	//constructor for UI-App
	public HelloWorldGraphical()
	{
		//generating the frame and panel
		this.setTitle("Hello GUI");
		this.setSize(400,400);
		

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

		//generating the buttons
		deutschButton = new JButton("Deutsch");
		deutschButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(Box.createRigidArea(new Dimension(0, 30)));
		panel.add(deutschButton);

		englishButton = new JButton("English");
		englishButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(Box.createRigidArea(new Dimension(0, 30)));
		panel.add(englishButton);

		francaisButton = new JButton("Francais");
		francaisButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(Box.createRigidArea(new Dimension(0, 30)));
		panel.add(francaisButton);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.LINE_AXIS));
		label = new JLabel("XXXXXXXXX");
		label.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel2.add(Box.createRigidArea(new Dimension(40, 0)));
		panel2.add(label);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.PAGE_AXIS));
		quitButton = new JButton("Beenden");
		quitButton.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel3.add(quitButton);
		panel3.add(Box.createRigidArea(new Dimension(20,20)));

		//add listener to buttons
		deutschButton.addActionListener(this);		
		englishButton.addActionListener(this);		
		francaisButton.addActionListener(this);		
		quitButton.addActionListener(this);
		
		//adding panel to frame
		this.add(panel, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		this.add(panel3, BorderLayout.PAGE_END);
	}

	//method finds out which button is pressed and corresponds to result
	public void actionPerformed (ActionEvent ae)
	{
		if (ae.getSource() == this.deutschButton)
			label.setText("Guten Tag!");
		else if (ae.getSource() == this.englishButton)
			label.setText("Hello!");
		else if (ae.getSource() == this.francaisButton)
			label.setText("Bonjour!");
		else if (ae.getSource() == this.quitButton)
		{
			label.setText("Beenden...");
			System.exit(0);
		}
	}

	public static void main (String [] args)
	{
		//generate new application and set it visible
		HelloWorldGraphical app = new HelloWorldGraphical();
		app.setVisible(true);
	}
}