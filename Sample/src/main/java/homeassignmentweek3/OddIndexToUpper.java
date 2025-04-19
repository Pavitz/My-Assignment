package homeassignmentweek3;

public class OddIndexToUpper {


		    public static void main(String[] args) {
		        String test = "changeme";
		        char[] characters = test.toCharArray();
		        
		        // from end to beginning
		        for (int i = characters.length - 1; i >= 0; i--) {
		            // Check if index is odd
		            if (i % 2 != 0) {
		             
		                characters[i] = Character.toUpperCase(characters[i]);
		            }
		        }
		        
		        // Print the modified character array
		        System.out.println(new String(characters));
		    }
	
	}


