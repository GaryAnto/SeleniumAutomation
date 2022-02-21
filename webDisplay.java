package project4;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webDisplay {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver system=new ChromeDriver();
		system.get("https://acme-test.uipath.com/login");
		system.manage().window().maximize();
		system.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		system.findElement(By.id("password")).sendKeys("leaf@12");
		system.findElement(By.xpath("//button[@type='submit']")).click();
		String name="ACME System 1 - Dashboard";
		String name2=system.getTitle();
		          if(name.equals(name2)) {
			           System.out.println("Webpage is displayed in the console");
		                   }else {
			           System.out.println("Webpage is not displayed in the console");
		            }
		                       system.findElement(By.linkText("Log Out")).click();
	}
}