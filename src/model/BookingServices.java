package model;
import java.util.*;


public class BookingServices {
	
		private DataStore data;
		private Colors color;
		private int customPrice = 150;
	
//		Constructor
		public BookingServices(DataStore data, Colors color) {
			this.data = data;
			this.color = color;
		}
		
//		showing tickets
		public void show() {
			
			int max = 1;
	    	for(int i = 0; i < data.arr.length; i++) {
	    		for(int j = 0; j < data.arr[i].length; j++) {
	    			
	    			data.arr[i][j] = max;
	    			
	    			if(data.select.contains(data.arr[i][j])) {
	    				System.out.printf(color.getRed() + "%02d " + color.getReset(), data.arr[i][j]);
	    				data.total.put(data.arr[i][j], data.num);
	    			}else {
	    				System.out.printf("%02d ", data.arr[i][j]);
	    			}
	    			
	    			if(max % 5 == 0) {
	    				System.out.print("  ");
	    			}
	    			
	    			max++;
	    		}
	    		System.out.println();
	    	}
	}
		
//		Counting Tickets
		public void count() {
			int count = 0;
			int price = 0;
			for(Map.Entry<Integer, Integer> entry : data.total.entrySet()) {
    			System.out.print(color.getRed()+entry.getKey()+color.getReset()+" ");
    			count++;
    			price = price + customPrice;
    		}
			System.out.println();
			System.out.println(color.getGreen()+"Total number of Tickets: "+color.getReset()+count);
			System.out.println(color.getGreen()+"Total Amount: "+color.getReset()+""+color.getRed()+price+color.getReset()+color.getGreen()+" Rupees"+color.getReset());
		}
		
		
//		Cancel the seats
		public void delete(int seatToRemove) {
			
			if(!data.select.contains(seatToRemove)) {
				System.out.println("Seat not found,");
				return;
			}
			
			data.select.remove(Integer.valueOf(seatToRemove));
			data.total.remove(seatToRemove);
			
			
		}
}
