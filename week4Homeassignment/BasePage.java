package week4Homeassignment;

public class BasePage {

	public void findElement(String locator) {
		System.out.println("finding element with locator:" + locator);
	}
	public void clickElement(String locator) {
		System.out.println("click element with locator:" + locator);
	}
	public void enterText(String locator, String text ) {
        System.out.println("Entering text '" + text + " ' into element: " + locator);
	}
	public void performCommonTasks() {
		System.out.println("Performing common task in BasePage");
		   findElement("//div[@class='container']");
	        clickElement("//button[@id='menu']");
	    }
		
public static void main(String[] args) {
    BasePage base = new BasePage();
    LoginPage login = new LoginPage();

    System.out.println("BasePage Methods:");
    base.findElement("//input[@id='username']");
    base.clickElement("//button[@id='submit']"	);
    base.enterText("//input[@id='username']", "admin");
    base.performCommonTasks();

    System.out.println("\nLoginPage Methods:");
    login.findElement("//input[@id='username']");
    login.clickElement("//button[@id='submit']");
    login.enterText("//input[@id='username']", "admin");
    login.performCommonTasks(); // Override
}
}
	