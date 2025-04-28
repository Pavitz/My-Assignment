package Week1Day2HomeAssign;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
    int  n=7 ;
    boolean prime=true;
    for (int i=1; i<n; i++) {
    	
    if (n%i==0) {
     System.out.println(n + " is a  Prime Number");    
     prime = false;
     break;
    	}
    else {
    	System.out.println(n +" is not a prime number");
    	break;
    }
    }

	}

}
