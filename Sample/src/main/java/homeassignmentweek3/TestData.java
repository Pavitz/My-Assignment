package homeassignmentweek3;

public class TestData {
    public void enterCredentials() {
        System.out.println("Entering credentials from TestData class");
    }
    
    public void navigateToHomePage() {
        System.out.println("Navigating to home page from TestData class");
    }
}

class LoginTestData extends TestData {
    public void enterUsername() {
        System.out.println("Entering username from LoginTestData class");
    }
    
    public void enterPassword() {
        System.out.println("Entering password from LoginTestData class");
    }

    public class InheritanceDemo {
    	
       
    }	

	
    public static void main(String[] args) {
    	System.out.println("testdata");
        
        TestData testData = new TestData();
        System.out.println("Calling TestData methods:");
        testData.enterCredentials();
        testData.navigateToHomePage();

   
        LoginTestData loginTestData = new LoginTestData();
        System.out.println("\nCalling LoginTestData methods:");
        loginTestData.enterCredentials();
        loginTestData.navigateToHomePage();
        loginTestData.enterUsername();
        loginTestData.enterPassword();
    }
}