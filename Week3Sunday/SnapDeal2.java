package SundayAssignmentFeb27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver snap= new ChromeDriver();
		snap.get("https://www.snapdeal.com/");
		snap.manage().window().maximize();
		snap.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions a = new Actions(snap);
		WebElement b = snap.findElement(By.linkText("Men's Fashion"));
		a.moveToElement(b).perform();
		snap.findElement(By.linkText("Sports Shoes")).click();

		String count=snap.findElement(By.xpath("(//div[@class='child-cat-count '])[2]")).getText();
		System.out.println(count);
		
	    snap.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
	    snap.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
	    snap.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
	    snap.findElement(By.name("fromVal")).clear();
	    snap.findElement(By.name("fromVal")).sendKeys("900");
	    snap.findElement(By.name("toVal")).clear();
	    snap.findElement(By.name("toVal")).sendKeys("1200");
        
	    snap.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
       	    
//	    snap.findElement(By.xpath("(//img[@class='product-image wooble'])[1]")).click();
//	    WebElement c = snap.findElement(By.linkText("QUICK VIEW"));
//	    a.moveToElement(c).perform();
		
	}

}
