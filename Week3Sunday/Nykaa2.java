package SundayAssignmentFeb27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.nykaa.com/");
		WebElement brand=driver.findElement(By.xpath("//a[text()='brands']"));
		
		Actions act =new Actions(driver);
		act.moveToElement(brand).perform();
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		
		driver.findElement(By.xpath("//div[@class='css-ov2o3v']/a")).click();
		String title=driver.findElement(By.xpath("//div//h1[@class='css-27y7m0']")).getText();
		System.out.println(title);
		
		driver.findElement(By.xpath("//button[@class=' css-p2rfnw']")).click(); //filter
		driver.findElement(By.xpath("//ul[@class='css-z5o5ca']//div[4]")).click(); //top reted
		driver.findElement(By.xpath("//div[@class='filter-open css-nbw8dp'][1]")).click(); //category
		driver.findElement(By.xpath("(//div[@class=' css-15dbf9i'])[1]")).click();
		//driver.findElement(By.xpath("//div[@class=' css-15dbf9i'][1]")).click();
		
	
		
		
		
		
		
		
		
		
		
		
	}
}