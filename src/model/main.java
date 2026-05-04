package model;
import java.util.*;
import model.Colors;

import java.awt.Color;
import java.lang.*;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DataStore data = new DataStore();
		Colors color = new Colors();
		BookingServices seats = new BookingServices(data, color);
		
		boolean run = true;
		
		while(run) {
			System.out.println();
			System.out.println("==================================");
			System.out.println(color.getYellow()+"CINEMA BOOKING SYSTEM"+color.getReset());
			System.out.println("==================================");
			System.out.println("1. Booking ");
		    System.out.println("2. Show bookings ");
		    System.out.println("3. Cancel Booking");
		    System.out.println("4. Exit");
		    System.out.println("----------------------------------");
		    System.out.println(color.getGreen()+"Select the options:"+color.getReset());
		    int choice = sc.nextInt();
		    sc.nextLine();
		    System.out.println();
		    
		    switch(choice) {
		    
		    case 1:
		    	
		    	int select1 = 0;
		    	
		    	System.out.println("----------------------------------");
		    	System.out.println(color.getYellow()+"Available seats are shown in white"+color.getReset());
		    	System.out.println("----------------------------------");
		    	seats.show();
		    	System.out.println("----------------------------------");
		    	System.out.println("Enter seat number to select:");
		    	
		    	select1 = sc.nextInt();
		    	sc.nextLine();
		    	
		    	if(data.select.contains(select1)) {
		    		System.out.println(color.getGreen()+"Seat "+select1+" is already selected."+color.getReset());
		    	}else {
		    		data.select.add(select1);
		    		System.out.println("Seat "+select1+" selected successfully.");
		    	}
		    	
		    	break;
		    	
		    case 2:
		    	System.out.println("----------------------------------");
		        System.out.println(color.getGreen()+"You have selected this seats"+color.getReset());
		        System.out.println("----------------------------------");
		    	seats.show();   	
		    	System.out.println("----------------------------------");
		    	System.out.println(color.getGreen()+"Your seat number: "+color.getReset());
		    	System.out.println("--------------------");
		    	seats.count();
		    	System.out.println();
//		    	System.out.println("----------------------------------");
		    	break;
		    case 3:
		    	System.out.println(color.getYellow()+"Your seat numbser: "+color.getReset());
		    	System.out.println("--------------------");
		    	seats.count();
		    	System.out.println();
		    	System.out.println("----------------------------------");
		    	System.out.println(color.getGreen()+"Choose the seat to cancel:"+color.getReset());
		    	int delete1 = sc.nextInt();
		    	sc.nextLine();
		    	seats.delete(delete1);
		    	System.out.println("----------------------------------");
		    	seats.show();
		    	System.out.println("----------------------------------");
		    	System.out.println(color.getGreen()+"seat "+delete1+" cancelled successfully."+color.getReset());
		    	break;
		    	
		    case 4:
		    	run = false;
		    	System.out.println("Exiting...........");
		    	break;
		    default:
		    	System.out.println("Choose the correct options!");
		    	break;
		    }
		    
		    
		}
		
	}
		}
