package Week3Sunday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver drag=new ChromeDriver();
		drag.get("https://jqueryui.com/selectable");
		drag.manage().window().maximize();
		drag.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement c = drag.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee'][1]"));
		WebElement d = drag.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee'][6]"));
		
		Actions select=new Actions(drag);
	    select.clickAndHold(c).moveToElement(d).release().perform(); 
		
		
	}

}
