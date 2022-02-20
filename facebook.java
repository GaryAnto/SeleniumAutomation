import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver fb=new ChromeDriver();
		fb.get("https://www.facebook.com/login/");
		fb.manage().window().maximize();
        fb.findElement(By.id("email")).sendKeys("shiffa.uday@gmail.com");
        fb.findElement(By.id("pass")).sendKeys("Rissupd1@");
        fb.findElement(By.id("loginbutton")).click();
        fb.findElement(By.xpath("//div[@style='border-radius:20px']")).click();
}
}