import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class FBRegisteration {
	
	      public static void main(String[] args) {
	    	  WebDriverManager.chromedriver().setup();
	  		
	  		ChromeDriver driver=new ChromeDriver();
	  		driver.get("https://www.facebook.com/");
	  		driver.manage().window().maximize();
	  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  		driver.findElement(By.linkText("Create New Account")).click();
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Michael");
			driver.findElement(By.name("lastname")).sendKeys("A");
			driver.findElement(By.name("reg_email__")).sendKeys("novelshadow7@gmail.com");
			driver.findElement(By.name("reg_email_confirmation__")).sendKeys("novelshadow7@gmail.com");
			driver.findElement(By.id("password_step_input")).sendKeys("doyouthang");
			
			WebElement birthday_day = driver.findElement(By.name("birthday_day"));
			Select index = new Select(birthday_day);
			index.selectByIndex(27);
			WebElement birthday_month = driver.findElement(By.name("birthday_month"));
			Select index1 = new Select(birthday_month);
			index1.selectByIndex(3);
			
			driver.findElement(By.id("year")).sendKeys("2000");
			driver.findElement(By.xpath("//input[@value='2']")).click();
			driver.findElement(By.name("websubmit")).click();
		}
	}