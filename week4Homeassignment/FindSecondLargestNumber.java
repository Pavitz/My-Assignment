package week4Homeassignment;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {
	

	public static void main(String[] args) {

		 int[] arr = {3, 2, 11, 4, 6, 7};

	        List<Integer> numberList = new ArrayList<>();  //Adding element to the list
	        for (int num : arr) {
	            numberList.add(num);
	        }
	        
	        Collections.sort(numberList); //sort in ascending

	        System.out.println("Sorted List: " + numberList);

	        int secondLargest = numberList.get(numberList.size() - 2); //get the 2nd largest
	        System.out.println("Second Largest Number: " + secondLargest);
	    }
	
	}


