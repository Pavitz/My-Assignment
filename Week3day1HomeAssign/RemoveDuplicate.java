package Week3day1HomeAssign;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
        int count = 0;
        
        // Spliting into words
        String[] words = text.split(" ");
        
     
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                // case is insensitive
                if (words[i].equalsIgnoreCase(words[j])) {
                   
                    words[j] = "";
                    count++;
                }
            }
        }
        
     
        if (count > 1) {
            for (String word : words) {
                System.out.print(word + " ");
            }
        }
    }


	}

