package Assignmentw2seltes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadpsuedo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup(); // bonigarcia
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//load application
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//username
		WebElement username =driver.findElementById("username");
		username.sendKeys("demosalesmanager");
		//password
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		//driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByPartialLinkText("SFA").click();
		//create lead
		driver.findElementByLinkText("Create Lead").click();
		// Enter CompanyName
		driver.findElementById("createLeadForm_companyName").sendKeys("Capg");
		// Enter FirstName 
		driver.findElementById("createLeadForm_firstName").sendKeys("Gayathri");
		//Enter LastName
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Bala");
		//Select value as Employee in Source Using SelectbyVisible text
		WebElement createLeadForm_dataSourceIddd = driver.findElementById("createLeadForm_dataSourceId");
		Select dd= new Select (createLeadForm_dataSourceIddd);
		dd.selectByVisibleText("Employee");

		// Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue
		WebElement marketing= driver.findElementByName("marketingCampaignId");
		Select mc= new Select(marketing);
		mc.selectByVisibleText("Pay Per Click Advertising");
		// Select value as Corporation in OwnerShip field Using SelectbyIndex
		WebElement owner=driver.findElementById("createLeadForm_ownershipEnumId");
		Select oc= new Select(owner);
		oc.selectByIndex(4);

		//Select value as India in Country Field Using SelectbyVisibletext
		WebElement createLeadForm_generalCountryGeoIddd3 = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dd3=new Select(createLeadForm_generalCountryGeoIddd3);
		dd3.selectByVisibleText("India");
		//Click on create Lead Button Using name Locator
		driver.findElementByName("Create Lead");
		//Title
		String  title= driver.getTitle();
		System.out.println("The Title of page is "+title);
		//submit
		driver.findElementByName("submitButton").click();


	}}

