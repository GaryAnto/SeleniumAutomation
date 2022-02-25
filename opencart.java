package project4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class opencart {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver cart=new ChromeDriver();
		cart.get("https://www.opencart.com/index.php?route=account/register");
		cart.manage().window().maximize();
		cart.findElement(By.xpath("//input[@name='username']")).sendKeys("GaryAnto");
		cart.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Gary");
		cart.findElement(By.xpath("//input[@name='lastname']")).sendKeys("A");
	cart.findElement(By.name("email")).sendKeys("mr.garyanto@gmail.com");
	cart.findElement(By.name("password")).sendKeys("doyouthang");
WebElement country = cart.findElement(By.id("input-country"));
	
	Select name=new Select(country);
	name.selectByVisibleText("India");
	}

}
