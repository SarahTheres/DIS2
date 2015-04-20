import java.io.IOException;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class HelloWorldGraphical extends JFrame implements ActionListener{

	//global variables for buttons
	JButton germanButton;
	JButton englishButton;
	JButton frenchButton;
	JButton quitButton;

	//global variable which saves text label
	JLabel greetingLabel;

	public HelloWorldGraphical()
	{
		//generating the frame and panel
		this.setTitle("Hello GUI");
		this.setSize(400,400);
		JPanel languageSelectionPanel = new JPanel();
		languageSelectionPanel.setLayout(new BoxLayout(languageSelectionPanel, BoxLayout.PAGE_AXIS));

		// Generating the buttons and adding them to the first panel
		germanButton = new JButton("Deutsch");
		germanButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		languageSelectionPanel.add(Box.createRigidArea(new Dimension(0, 30)));
		languageSelectionPanel.add(germanButton);
		germanButton.addActionListener(this);

		englishButton = new JButton("English");
		englishButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		languageSelectionPanel.add(Box.createRigidArea(new Dimension(0, 30)));
		languageSelectionPanel.add(englishButton);
		englishButton.addActionListener(this);		

		frenchButton = new JButton("Francais");
		frenchButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		languageSelectionPanel.add(Box.createRigidArea(new Dimension(0, 30)));
		languageSelectionPanel.add(frenchButton);
		frenchButton.addActionListener(this);		

		// The greeting label and extra panel
		JPanel greetingPanel = new JPanel();
		greetingPanel.setLayout(new BoxLayout(greetingPanel, BoxLayout.LINE_AXIS));
		greetingLabel = new JLabel("");
		greetingLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		greetingPanel.add(Box.createRigidArea(new Dimension(40, 0)));
		greetingPanel.add(greetingLabel);
		
		JPanel quitPanel = new JPanel();
		quitPanel.setLayout(new BoxLayout(quitPanel, BoxLayout.PAGE_AXIS));
		quitButton = new JButton("Beenden");
		quitButton.setAlignmentX(Component.RIGHT_ALIGNMENT);
		quitPanel.add(quitButton);
		quitPanel.add(Box.createRigidArea(new Dimension(20,20)));
		quitButton.addActionListener(this);

		//adding the panels to the frame
		this.add(languageSelectionPanel, BorderLayout.NORTH);
		this.add(greetingPanel, BorderLayout.CENTER);
		this.add(quitPanel, BorderLayout.PAGE_END);
	}

	//method finds out which button is pressed and corresponds to result
	public void actionPerformed (ActionEvent ae)
	{
		if (ae.getSource() == this.germanButton)
			greetingLabel.setText("Guten Tag!");
		else if (ae.getSource() == this.englishButton)
			greetingLabel.setText("Hello!");
		else if (ae.getSource() == this.frenchButton)
			greetingLabel.setText("Bonjour!");
		else if (ae.getSource() == this.quitButton)
		{
			greetingLabel.setText("Terminating Program...");
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