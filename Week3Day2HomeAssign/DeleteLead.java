package Week3Day2HomeAssign;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {
	 public static void main(String[] args) throws InterruptedException {
	        
	        EdgeDriver driver = new EdgeDriver();
	        
	        
	        driver.get("http://leaftaps.com/opentaps/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	        driver.findElement(By.id("username")).sendKeys("Demosalesmanager"); //User name & pwd
	        driver.findElement(By.id("password")).sendKeys("crmsfa");
	        driver.findElement(By.className("decorativeSubmit")).click();
	        
	        driver.findElement(By.linkText("CRM/SFA")).click();
	        
	        driver.findElement(By.linkText("Leads")).click(); //Click leads
	        
	        driver.findElement(By.linkText("Find Leads")).click(); //finding leads   
	        
	        driver.findElement(By.xpath("//span[text()='Phone']")).click();
	        
	        driver.findElement(By.name("phoneNumber")).sendKeys("99"); // phone no
	        
	        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	        
	        Thread.sleep(2000); 
	        
	        String leadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
	        System.out.println("Captured Lead ID: " + leadID);
	        
	        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
	        
	        driver.findElement(By.linkText("Delete")).click();
	        
	        driver.findElement(By.linkText("Find Leads")).click();
	        
	        driver.findElement(By.name("id")).sendKeys(leadID);
	        
	        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	        
	        Thread.sleep(2000);
	        
	        String message = driver.findElement(By.className("x-paging-info")).getText();
	        if (message.equals("No records to display")) {
	            System.out.println("Lead successfully deleted");
	        } else {
	            System.out.println("Lead NOT deleted");
	        }
	        
	        driver.close();
	    }
	}
