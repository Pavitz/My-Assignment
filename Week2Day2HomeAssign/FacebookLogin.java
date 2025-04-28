package Week2Day2HomeAssign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class FacebookLogin {

	public static void main(String[] args) {

		EdgeDriver driver= new EdgeDriver();
		   driver.get("https://en-gb.facebook.com/");
		   
		   driver.findElement(By.id("email")).sendKeys("Pavithra15mani@gmail.com");
		   driver.findElement(By.id("pass")).sendKeys("ABC@123");
		   	
			driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
			
		}
	}

