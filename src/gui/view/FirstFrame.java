package gui.view;

import javax.swing.JFrame;
//dont forget to import the JFrame for the frame and the JPanel for the panel
import gui.controller.GUIController;
//dont forget to import the other files that are needed when linking multiple files

public class FirstFrame extends JFrame
{

	private GUIController appController;
	private FirstPanel appPanel;
	//gotta create data members for files that you are linking to
	
	public FirstFrame(GUIController appController)
	{
		super();
		//This is always needed when you use the extends JFrame thing at the top were the 
		//class name thing is
		this.appController = appController;
		this.appPanel = new FirstPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		//this sets up the bases for the frame
		this.setContentPane(appPanel);
		this.setSize(800, 800);
		this.setTitle("My GUI");
		this.setResizable(true);
		this.setVisible(true);
		//You must always have the setVisible to true otherwise you wont ever see your
		// actual gui
	}
}
