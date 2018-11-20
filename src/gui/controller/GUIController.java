package gui.controller;
import gui.model.Duck;
import gui.view.FirstFrame;
import gui.view.*;
public class GUIController
{

	private Duck myDuck;
	private FirstFrame appFrame;
	private FirstPanel appLayout;
	public GUIController()
	{
		myDuck = new Duck();
		appFrame = new FirstFrame(this);
		appLayout = new FirstPanel(this);
	}
	
	public void start()
	{
		
	}
}
