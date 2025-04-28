package Week3day1HomeAssign;

public class ReverseOddString {

	public static void main(String[] args) {
		String test = "I am a software Tester"; 
		
		String [] words = test.split(" ");
		
	
		StringBuilder result= new StringBuilder();
		
        for (int i = 0; i < words.length; i++) { 
        	
            if (i % 2 == 1) {  
            	
                char[] charArray = words[i].toCharArray(); // to reverse wordsin string loop
                
                for (int j = charArray.length - 1; j >= 0; j--) { 	
                    result.append(charArray[j]);
                }
            } else {
            	 result.append(words[i]);
            }

            result.append(" ");
        }

        System.out.println(result.toString().trim());
    }

	

	}

