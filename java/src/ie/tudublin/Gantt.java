package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;

public class Gantt extends PApplet
{	
	ArrayList <String[]> phases = new ArrayList();
	ArrayList <String[]> start = new ArrayList();
	ArrayList <String[]> end = new ArrayList();
	
	public void settings()
	{
		size(800, 600);
	}

	public void loadTasks()
	{
		Task load = new Task();
		phases = load.getTasks(0); //take the first element (phases) from each array and put them in the phases array
		start = load.getTasks(1); //same as 
		end = load.getTasks(2); //same as
	}

	public void printTasks()
	{
		System.out.println(phases);
		System.out.println(start);
		System.out.println(end);
	}
	
	public void mousePressed()
	{
		println("Mouse pressed");	
	}

	public void mouseDragged()
	{
		println("Mouse dragged");
	}

	
	
	public void setup() 
	{
	}
	
	public void draw()
	{			
		background(0);
	}
}
