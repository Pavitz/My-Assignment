
package week4Homeassignment;

public class FindIntersection {

	    public static void main(String[] args) {

	        int[] num = {3, 2, 11, 4, 6, 7};
	        int[] num2 = {1, 2, 8, 4, 9, 7};

	        System.out.println("Intersection values:");

	        for (int i = 0; i < num.length; i++) {
	            for (int j = 0; j < num2.length; j++) {
	                if (num[i] == num2[j]) {
	                    System.out.println(num[i]);
	                }
	            }
	        }
	    }
	}



	