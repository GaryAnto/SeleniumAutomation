	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.Point;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {
     public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver leaf=new ChromeDriver();
			leaf.get("http://www.leafground.com/pages/Button.html");
			leaf.manage().window().maximize();
			leaf.findElement(By.id("home")).click();
			Point location = leaf.findElement(By.id("position")).getLocation();
			int a = location.getX();
			System.out.println(a);
			int b = location.getY();
			System.out.println(b);
			
			String c = leaf.findElement(By.id("color")).getCssValue("background-color");
			System.out.println(c);
			
			Dimension d = leaf.findElement(By.id("size")).getSize();
			int height = d.height;
			System.out.println(height);
			int width = d.width;
			System.out.println(width);
		}
	}


