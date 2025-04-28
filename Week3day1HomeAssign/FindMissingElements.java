package Week3day1HomeAssign;

import java.util.Arrays;
public class FindMissingElements {

	public static void main(String[] args) {
		
		        int[] arr = {1, 4, 3, 2, 8, 6, 7};  
		        Arrays.sort(arr);
		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] != i + 1) {
		                System.out.println("Missing no : " + (i + 1));
		                break;
		            }
		        }
		    }
		

	}


