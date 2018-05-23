package carparkentities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import package1.Car;
import package1.Vehicles;

public class WestminsterCarParkManager implements CarParkManager{
	static List<Vehicles> list= new ArrayList <Vehicles>();

	
	
	public static void main (String[] args){
	
		String input;	
	do{
		
	
		
		System.out.println("Add Vehicle= A");
		System.out.println("Delete Vehicle= D");
		System.out.println("Print Vehicle= P");
		System.out.println("Exit= E");
	Scanner options=new Scanner(System.in);
	System.out.println("Please Enter an option  :");
	input = options.nextLine();
	System.out.println("YOU ENTERED: "+input);
	
	
	switch(input){
	case "A":
		System.out.println("you selected the add option");
		
		
		System.out.println("Please Enter the Type of the Vehicle: ");
		Scanner sc= new Scanner(System.in);
		String type =sc.nextLine();
		if (type.equalsIgnoreCase("Car")) {
			Car c =new Car();
			c.setno("WP123");
			list.add(c);
			
		}
		
		break;
		
	
	case "D":
		System.out.println("you selected the delete option");
		break;
		
	case "P":
		System.out.println("you selected the paste option");
		break;
		
	
	default: System.out.println("Please Enter a Valid Option :");
	}
	}
	while(!input.equalsIgnoreCase("E"));
	
	System.out.println("Programe ended");
	
}
}
