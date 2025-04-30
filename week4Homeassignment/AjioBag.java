package week4Homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class AjioBag {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        
        WebDriver driver = new ChromeDriver();
        
        try {
            driver.get("https://www.aijo.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            
            WebElement searchBox = driver.findElement(By.name("q")); 
            searchBox.sendKeys("bags");
            searchBox.submit();
            
            WebElement menFilter = driver.findElement(By.xpath("//div[contains(@class, 'gender-filter')]//label[contains(text(), 'Men')]"));
            menFilter.click();
            
            WebElement fashionBagsFilter = driver.findElement(By.xpath("//div[contains(@class, 'category-filter')]//label[contains(text(), 'Fashion Bags')]"));
            fashionBagsFilter.click();
            
            Thread.sleep(3000);
            
            List<WebElement> productItems = driver.findElements(By.xpath("//div[contains(@class, 'product-item')]"));
            System.out.println("Number of items found: " + productItems.size());
            
            List<WebElement> brandElements = driver.findElements(By.xpath("//div[contains(@class, 'product-brand')]"));
            List<String> brands = brandElements.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
            System.out.println("\nList of Brands:");
            brands.forEach(System.out::println);
            
            List<WebElement> nameElements = driver.findElements(By.xpath("//div[contains(@class, 'product-name')]"));
            List<String> productNames = nameElements.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
            System.out.println("\nList of Product Names:");
            productNames.forEach(System.out::println);
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

	}


