package week2.day2w;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
			
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
       driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
       driver.findElement(By.id("password")).sendKeys("crmsfa");
       driver.findElement(By.className("decorativeSubmit")).click();
       driver.findElement(By.linkText("CRM/SFA")).click();
       driver.findElement(By.linkText("Leads")).click();
       
       driver.findElement(By.linkText("Create Lead")).click();
       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pavithra");
       driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mani");
       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCLTech");
       
       WebElement leadOption=driver.findElement(By.id("CreateLeadForm-dataSourceId"));
       Select dropdown = new Select (leadOption);
       dropdown.selectByIndex(5);
       driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Analyst");
   driver.findElement(By.xpath("//input[@name='submitButton']")).clear();
   driver.close();

	}

}
