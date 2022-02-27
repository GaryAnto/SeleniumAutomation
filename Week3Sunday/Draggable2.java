package Week3Sunday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver drag=new ChromeDriver();
		drag.get("https://jqueryui.com/draggable/");
		drag.manage().window().maximize();
		drag.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
         
		WebElement a = drag.findElement(By.id("draggable"));
		Actions bind=new Actions(drag);
		bind.dragAndDropBy(a,100,50).build().perform();
		
	}
	

}
