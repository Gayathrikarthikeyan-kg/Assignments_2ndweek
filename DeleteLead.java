package Assignmentw2seltes;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

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
		//click on phone
	   dr.findElementByLinkText("Phone").click();
	 //Enter  phone number 99
	  dr.findElementByXPath("((//label[text()='Phone Number:'])[4]/following::input)[3]").sendKeys("9");
		//Click find leads button
		dr.findElementByXPath("//button[text()='Find Leads']").click();	
		Thread.sleep(2000);
		//Capture lead ID of First Resulting lead
		String capture=dr.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]").getText();
		System.out.println("capture leadId is "+capture);
		//Click First Resulting lead
		dr.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		Thread.sleep(2000);
		//Click Delete
		dr.findElementByClassName("subMenuButtonDangerous").click();
		//click find lead
		dr.findElementByLinkText("Find Leads").click();
		 dr.findElementByLinkText("Phone").click();
		  dr.findElementByXPath("((//label[text()='Phone Number:'])[4]/following::input)[3]").sendKeys(capture);
			dr.findElementByXPath("//button[text()='Find Leads']").click();	
	
		
		
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
			String text = dr.findElementByClassName("x-paging-info").getText();
			System.out.println("text is : "+text);
			if (text.equals("No records to display")) {
				System.out.println("Text matched");
			} else {
				System.out.println("Text not matched");
			}
			System.out.println("Test Method Ended");
	}	
		
		
		
	}
	

