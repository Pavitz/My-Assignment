package Week3day1HomeAssign;

public class CompareArrayIntersection {

	public static void main(String[] args) {
		int[] a = {3, 2, 11, 4, 6, 7};
        int[] b = {1, 2, 8, 4, 9, 7};

        // Loop through first array
        for (int i = 0; i < a.length; i++) {
            // Loop through second array
            for (int j = 0; j < b.length; j++) {
                // Compare elements
                if (a[i] == b[j]) {
                    System.out.println("Matching element: " + a[i]);
                }
            }
        }
    }

	}


