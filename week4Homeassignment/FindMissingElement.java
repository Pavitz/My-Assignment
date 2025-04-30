package week4Homeassignment;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class FindMissingElement {

	public static void main(String[] args) {
		
		 int[] numbers = {1, 2, 3, 4, 10, 6, 8};

	        List<Integer> numList = new ArrayList<>(); //element to list
	        for (int num : numbers) {
	            numList.add(num);
	        }

	        Collections.sort(numList); //sorting
	        System.out.println("Sorted List: " + numList);

	        System.out.print("Missing numbers: "); //find and printing
	        for (int i = 0; i < numList.size() - 1; i++) {
	            int current = numList.get(i);
	            int next = numList.get(i + 1);
	            for (int missing = current + 1; missing < next; missing++) {
	                System.out.print(missing + " ");
	            }
	        }
	    }
	}
