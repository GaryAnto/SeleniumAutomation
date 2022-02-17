
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class selenium1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver google=new ChromeDriver();
		google.get("http://leaftaps.com/opentaps/control/main");
		google.manage().window().maximize();
		google.findElement(By.id("username")).sendKeys("Demosalesmanager");
		google.findElement(By.id("password")).sendKeys("crmsfa");
		google.findElement(By.name("decorativeSubmit")).click();
		google.findElement(By.linkText("CRM/SFA")).click();	
		String title = google.getTitle();
		System.out.println(title);
		google.findElement(By.linkText("Leads")).click();
		google.findElement(By.linkText("Create Lead")).click();
		google.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		google.close();
		
}
}

	