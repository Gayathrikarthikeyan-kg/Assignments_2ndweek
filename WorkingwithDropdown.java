package Assignmentw2seltes;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingwithDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup(); // bonigarcia
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://leafground.com/pages/Dropdown.html");
		
		//select training using index
		
				WebElement dropDown1=driver.findElementById("dropdown1");
				Select  select = new Select(dropDown1);
				//to get the count of all option-->index
				select.selectByIndex(4);
				Thread.sleep(2000);
				
				//select training using Text
				select.selectByVisibleText("Selenium");
				Thread.sleep(2000);
				//select training using value
				
				select.selectByValue("3");
				Thread.sleep(2000);
				//get the number of  dropdown options
				select.getOptions();
				List<WebElement> listofoptions = select.getOptions();
				int size =listofoptions.size();
				System.out.println("The Number of Options is "+size);
				//using sednkeys
			WebElement sendtext=driver.findElementByXPath("//*[@id='contentblock']/section/div[5]/select");
			sendtext.sendKeys("Appium");
			//select your prgms
			
			WebElement multipleoptions=driver.findElementByXPath("//*[@id='contentblock']/section/div[6]/select");
			Select multiselectbox= new Select(multipleoptions);
			multiselectbox.selectByIndex(1);
			multiselectbox.selectByIndex(3);
			
				
		
		

	}

}
