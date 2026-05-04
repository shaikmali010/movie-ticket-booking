package model;
import java.util.*;

public class Practice {
	public static void main(String[] args) {

	int[][]  arr = new int[5][10];
	int max = 1;
	ArrayList<Integer> select = new ArrayList<>();
	HashMap<Integer, Integer> total = new HashMap<>();
	int num = 1;
	int count = 0;
	int select1 = 33;
	select.add(22);
	select.add(21);
	select.add(50);
	select.add(select1);
	
	String RED = "\u001B[31m";
	String RESET = "\u001B[0m";
	
	for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++) {
			
			arr[i][j] = max;
			
			if(select.contains(arr[i][j])) {
				System.out.printf(RED + "%02d " + RESET, arr[i][j]);
				total.put(arr[i][j], num);
			}else {
				System.out.printf("%02d ", arr[i][j]);
				
			}
			
			if(max % 5 == 0) {
				System.out.print("  ");
			}
			
			max++;
		}
		System.out.println();
	}
	
	System.out.println("Selected seats! ");
	for( Map.Entry<Integer, Integer> entry : total.entrySet()) {
		System.out.print(entry.getKey()+ "  ");
		
		count = count + entry.getValue();
        		
	}
	System.out.println();
	System.out.println("Number of seats ");
	System.out.println(count);
	
//	for(int i = )
}
}