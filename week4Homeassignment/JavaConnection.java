package week4Homeassignment;

public class JavaConnection implements DatabaseConnection {
		
	public void connect() {    //override
		System.out.println("Database has Connected");
		
	}

	public void disconnect() {   //override
		System.out.println("Database has Disconnected");
		
		
	}

	public void executeUpdate() {  //Override
		System.out.println("Database has executeUpdate");
		
	}
	
	public static void main(String[] args) {
     
		JavaConnection connect1 = new JavaConnection();
		connect1.connect();
		connect1.disconnect();
		connect1.executeUpdate();
		
	}

}
