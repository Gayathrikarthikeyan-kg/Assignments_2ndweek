package Assignmentw2seltes;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://leaftaps.com/opentaps/control/main");
		dr.findElementById("username").sendKeys("demosalesmanager");
		dr.findElementById("password").sendKeys("crmsfa");
		dr.findElementByClassName("decorativeSubmit").click();
		dr.findElementByLinkText("CRM/SFA").click();
		dr.findElementByLinkText("Leads").click();
		dr.findElementByLinkText("Find Leads").click();
		//Click on Email
		dr.findElementByLinkText("Email").click();
		//Enter Email
		dr.findElementByName("emailAddress").sendKeys("babu@testleaf.com");
		//Click find leads button
		dr.findElementByXPath("//button[text()='Find Leads']").click();	
		//Capture name of First Resulting lead
		String capture=dr.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").getText();
		System.out.println("capture leadId is "+capture);
		Thread.sleep(2000);
		//Click First Resulting lead
		dr.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").click();
		Thread.sleep(2000);
		//Click Duplicate Lead
		dr.findElementByLinkText("Duplicate Lead").click();
		//Click Create Lead
		dr.findElementByXPath("//input[@value='Create Lead']").click();
		//Confirm the duplicated lead name is same as captured name
		
		
	}

}
