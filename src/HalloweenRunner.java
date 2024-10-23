//Daniel Wolf , 9/28/2024 , COP3330, Assignment 3: Method Overloading,Comparable, and File I/O
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.util.Collections;
import java.io.FileWriter;
import java.io.IOException;

public class HalloweenRunner {

	public static void main(String[] args) throws IOException {
	
	
	Scanner askfile = new Scanner(System.in);
	String inputfilename = askfile.next();
	File costumefile = new File(inputfilename);
	String outputfilename;

	HalloweenCostumes costume = new HalloweenCostumes();
	
	ArrayList<HalloweenCostumes> costumeslist = new ArrayList<HalloweenCostumes>();
	String costumeName;
	double costumeCost;
	int WantScore;
	try {
	askfile = new Scanner(costumefile); 
	int numtimes = askfile.nextInt();
	for(int i = 0; i < numtimes; i++) {
		
		costumeName = askfile.next(); costumeCost = askfile.nextDouble(); WantScore = askfile.nextInt();
		//System.out.println(costumeName + costumeCost + WantScore);
		
		 if(costumeName.length() <= 2 && costumeCost == -1 && WantScore == -1) {
			costume = new HalloweenCostumes();
		}
		
		 else if(WantScore == -1 && costumeCost == -1) {
			costume = new HalloweenCostumes(costumeName);
				
		}
		 
		 else if(costumeName.length() <= 2 && WantScore == -1) {
			 costume = new HalloweenCostumes(costumeCost);
		 }
		 
		 else if(costumeName.length()<=2 && costumeCost == -1) {
			 costume = new HalloweenCostumes(WantScore);
		 }
		
		else if(WantScore == -1) {
			costume = new HalloweenCostumes(costumeName,costumeCost);
			
		}
		
		else if(costumeCost == -1) {
			costume = new HalloweenCostumes(costumeName, WantScore);
			
		}
		
		
		
		else if (costumeName.length() <=2) {
			costume = new HalloweenCostumes(costumeCost, WantScore);
			
		}
		
		else {
		
		costume = new HalloweenCostumes(costumeName, costumeCost, WantScore);
		
		}
			
		
		costumeslist.add(costume);
		}
	


	for(HalloweenCostumes e: costumeslist) {
		
		e.CalcCoolness();
	
		
	}	Collections.sort(costumeslist);
	
	askfile = new Scanner(System.in);
	outputfilename = askfile.next();
	FileWriter filewriter = new FileWriter(outputfilename);
	
	for(HalloweenCostumes i: costumeslist) {
		//System.out.println(i.getName() +  " " + i.getCoolness() + " " + i.getCost() + " " + i.getWant());
		filewriter.write(i.getName() +  " " + i.getCoolness() + " " + i.getCost() + " " + i.getWant() + "\n");
	}  //this part to write into new output file
	
	filewriter.close();
	
	
	}	catch(FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
	}
		catch(NoSuchElementException u) {
			
			u.printStackTrace();
		}


	
	
	
		     
	}	
}		   
	


