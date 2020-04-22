package ie.tudublin;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Task {
	
	private ArrayList <String[]> splits = new ArrayList();
	private String data; //Variable for reading the csv data
	String array[]; //For holding the csv information after i have split it 
	
	 public ArrayList <String[]> getTasks(int i) {
		 File file = new File("data/tasks.csv"); //csv file path
	     try {
			Scanner readData = new Scanner(file);
			while(readData.hasNext()) { //while not at the end of file 
				data = readData.next(); //store csv text inside data 
				System.out.println(data);
				array = data.split(","); //split the csv sttring in to seperate array elemtns after each ","
				splits.add(array);
			}
			readData.close(); //close scanner 
		 }  
	     catch (FileNotFoundException e) { //error handling incase file doesn't open
			e.printStackTrace();
		 }
		return splits;
	 }
}

