package homeassignmentweek3;

public class ReverseOddString {

	public static void main(String[] args) {
		String test = "I am a software Tester"; // this is the input given in pgm
		
		String [] words = test.split(" ");// convert sentence into words or splitting a string into array of words
		
		//** creates a new StringBuilder object called result.
       //final output — word by word, character by character
		StringBuilder result= new StringBuilder();
		
        for (int i = 0; i < words.length; i++) { // for loop for goes each words , I -index
        	
            if (i % 2 == 1) {  //check index is odd array use 0 based indexing
            	
                char[] charArray = words[i].toCharArray(); // to reverse words which is in string easy loop
                
                for (int j = charArray.length - 1; j >= 0; j--) { //reverse loop	
                    result.append(charArray[j]);
                }
            } else {
            	 result.append(words[i]);
            }

            // Add a space after each word
            result.append(" ");
        }

        // Print the final result (remove trailing space)
        System.out.println(result.toString().trim());
    }

	

	}

