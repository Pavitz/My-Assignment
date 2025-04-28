package Week1Day2HomeAssign;

public class CheckNumberIsPositive {
		  
		    int version = 10;
		    public void checkNumber(int number) {
		     
		        if (number > 0) {
		            System.out.println(number + " is a positive number.");
		        } else 
		      
		            System.out.println(number + " is not a positive number.");
		        }
		
		    public static void main(String[] args) {
		        CheckNumberIsPositive checker = new CheckNumberIsPositive();
		        System.out.println("Version: " + checker.version);

		        checker.checkNumber(5);   
		        checker.checkNumber(-3);  
		        checker.checkNumber(0);  
		    }	

	}


