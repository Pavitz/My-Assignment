package week4Homeassignment;

public class APIClient {
	
		public void sendRequest ( String a ) {
			System.out.println("Version 1 = String for the endpoint ");
			System.out.println(a);
			
		}
		public void sendRequest  (String  a , String  b, String c) {
			System.out.println("Version = 2 ,4");
			System.out.println(a+" " +b+" " +c);
			
		}
		
		public static void main(String[] args) {
			
			APIClient endPoint = new APIClient();
			endPoint.sendRequest( "a");
			endPoint.sendRequest("a","b","c");
			
		}

		}
		

