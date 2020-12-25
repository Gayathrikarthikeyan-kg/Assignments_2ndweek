package Assignmentw2seltes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editgopi {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver el = new ChromeDriver();
		el.manage().window().maximize();
		el.get("http://leaftaps.com/opentaps/control/login");		
				
		el.findElementById("username").sendKeys("demosalesmanager");
		el.findElementById("password").sendKeys("crmsfa");
		el.findElementByClassName("decorativeSubmit").click();
		
		el.findElementByLinkText("CRM/SFA").click();
		el.findElementByLinkText("Leads").click();
		el.findElementByLinkText("Find Leads").click();
		
		el.findElementByXPath("//input[@class='x-form-text x-form-field'or@id='ext-gen248']").sendKeys("Gopi");
		Thread.sleep(2000);
		
		el.findElementByXPath("//button[@class='Find Leads'or@id='ext-gen334']").click();
		Thread.sleep(2000);
		el.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	
		String actualTitle = el.getTitle();
		System.out.println("Title :"+ actualTitle);
		el.findElementByLinkText("Edit").click();
		
		WebElement company = el.findElementById("updateLeadForm_companyName");
		company.clear();
		company.sendKeys("TestLeafgopi");
		
		el.findElementByClassName("smallSubmit").click();
		
		el.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		el.close();
	}


}

