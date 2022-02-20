package project4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leaftappLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver lead=new ChromeDriver();
		lead.get("http://leaftaps.com/opentaps/control/login");
		lead.manage().window().maximize();
		lead.findElement(By.id("username")).sendKeys("demosalesmanager");
		lead.findElement(By.id("password")).sendKeys("crmsfa");
		lead.findElement(By.className("decorativeSubmit")).click();
		lead.findElement(By.linkText("CRM/SFA")).click();
		lead.findElement(By.linkText("Leads")).click();
		lead.findElement(By.linkText("Create Lead")).click();
		lead.findElement(By.className("inputBox")).sendKeys("Testleaf");
		lead.findElement(By.id("createLeadForm_firstName")).sendKeys("Gary");
		lead.findElement(By.id("createLeadForm_lastName")).sendKeys("Anto");
		
		WebElement findElement = lead.findElement(By.id("createLeadForm_dataSourceId"));
		Select a=new Select(findElement);
		a.selectByVisibleText("Employee");
		
		WebElement findElement2 = lead.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select b=new Select(findElement2);
		b.selectByVisibleText("Automobile");
		
		WebElement findElement3 = lead.findElement(By.id("createLeadForm_industryEnumId"));
		Select c=new Select(findElement3);
		c.selectByVisibleText("Computer Hardware");
		
		WebElement findElement4 = lead.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select d=new Select(findElement4);
		d.selectByVisibleText("Corporation");
		
		WebElement findElement5 = lead.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select e=new Select(findElement5);
		e.selectByVisibleText("Tamilnadu");
		
		WebElement findElement6 = lead.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select f=new Select(findElement6);
		f.selectByVisibleText("India");
		
		lead.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600126");
		lead.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		lead.findElement(By.xpath("//input[@class='smallSubmit']")).click();		
		lead.close();
		
		
	}

}
