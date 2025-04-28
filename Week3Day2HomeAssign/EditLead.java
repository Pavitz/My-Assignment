package Week3Day2HomeAssign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {

EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Pavithra");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Mani");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT Department");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is an Test lead");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pavithra123@gmail.com");


		WebElement leadOptions =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown = new Select(leadOptions);
		dropdown.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("ymnz");
		driver.findElement(By.className("smallSubmit")).click();
		driver.getTitle();
		driver.close();
	}
	}


