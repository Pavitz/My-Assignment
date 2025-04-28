package Week2Day2HomeAssign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

		public class FacebookRegistration {
		    public static void main(String[] args) {
		    	EdgeDriver driver = new EdgeDriver();
				driver.get("https://en-gb.facebook.com/");
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

				driver.findElement(By.linkText("Create new account")).click(); //creating new account
				driver.findElement(By.name("firstname")).sendKeys("Pavithra");
				driver.findElement(By.name("lastname")).sendKeys("Pavi");
				
				WebElement fbOption= driver.findElement(By.id("day")); //For Date
				Select dropdown = new Select(fbOption);
				dropdown.selectByIndex(5);
				
				WebElement fbOption1=driver.findElement(By.id("month")); //For Month
				Select dropdown1 = new Select(fbOption1);
				dropdown1.selectByIndex(5);
				 
				WebElement optionYear = driver.findElement(By.id("year")); //For Year
				 Select dropdown2 = new Select(optionYear);
				 dropdown2.selectByIndex(20);
				 
				 
// Selecting radio button				 
				 driver.findElement(By.name("sex")).click();
				 
				 driver.findElement(By.name("reg_email__")).sendKeys("Pavithra15mani@gmail.com");
				 driver.findElement(By.id("password_step_input")).sendKeys("Pavi@123");
				 driver.findElement(By.xpath("//button[@name='websubmit']")).click();
						
				
			}

		}