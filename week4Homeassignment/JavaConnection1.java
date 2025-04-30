package week4Homeassignment;

public class JavaConnection1 extends MySqlConnection {

    @Override
    public void executeUpdate() {
        System.out.println("Executing update on MySQL database...");
    }

    @Override
    public void executeQuery() {
        System.out.println("Executing query on MySQL database...");
    }

    public static void main(String[] args) {
        JavaConnection1 connect2 = new JavaConnection1();
        connect2.connect();
        connect2.executeQuery();
        connect2.executeUpdate();
        connect2.disconnect();
    }


}
