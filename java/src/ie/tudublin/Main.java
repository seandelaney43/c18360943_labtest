package ie.tudublin;

import java.util.ArrayList;

public class Main
{
	 public static void main(String[] args) 
	 {
	     //Main main = new Main();
	     //main.gant();  
	     
	     Task test = new Task();
	     test.getTasks(0);
	     
	     
	     Gantt load = new Gantt();
	     load.loadTasks();
	     
	 }
	 
    public void gant()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Gantt());
    }
    
}