package Week1Day2HomeAssign;
import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a no: ");
	        
	        int input = scanner.nextInt();
	        int original = input; 
	        int output = 0;

	        for (int i = input; i > 0; i = i / 10) {
	            int rem = i % 10;
	            output = (output * 10) + rem;
	        }

	        if (original == output) {
	            System.out.println("It is a Palindrome.");
	        } else {
	            System.out.println("It is not a Palindrome.");
	        }

	        scanner.close();
	    }
	}

