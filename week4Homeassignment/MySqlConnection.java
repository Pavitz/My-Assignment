package week4Homeassignment;

public abstract class MySqlConnection implements DatabaseConnection {


    public abstract void executeQuery(); //new abs method

    // Optionally provide default implementations for interface methods
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MySQL database...");
    }
}	
	

