package Week3Sunday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Droppable2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver drag=new ChromeDriver();
		drag.get("https://jqueryui.com/droppable");
		drag.manage().window().maximize();
		drag.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         
		WebElement a = drag.findElement(By.id("draggable"));
		WebElement b = drag.findElement(By.id("droppable"));
		
	    Actions act=new Actions(drag);
	    act.clickAndHold(a).moveToElement(b).perform();
}
}
