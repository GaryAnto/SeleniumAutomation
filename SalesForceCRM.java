package project4;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceCRM {
	     public static void main(String[] args) {
			  WebDriverManager.chromedriver().setup();
			  ChromeDriver sales = new ChromeDriver();
			  sales.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
			  sales.manage().window().maximize();
			  sales.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			  sales.findElement(By.name("UserFirstName")).sendKeys("Gary");
			  sales.findElement(By.name("UserLastName")).sendKeys("Anto");
			  sales.findElement(By.name("UserEmail")).sendKeys("mr.garyanto@gmail.com");
			  sales.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
			  sales.findElement(By.name("UserPhone")).sendKeys("6369390277");
			
		      WebElement UserTitle= sales.findElement(By.name("UserTitle"));
		      Select a=new Select(UserTitle);
		      a.selectByVisibleText("others");
		    
		      WebElement CompanyEmployees=sales.findElement(By.name("CompanyEmployees"));
		      Select b=new Select(CompanyEmployees);
		      b.selectByIndex(1);
		    
		      sales.findElement(By.name("CompanyCountry")).sendKeys("India");
		      sales.findElement(By.name("CompanyState")).sendKeys("Tamil Nadu");
		      sales.findElement(By.xpath("//button[@type='submit']")).click();
		      }
	     }

