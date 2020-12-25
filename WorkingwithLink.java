package Assignmentw2seltes;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingwithLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup(); // bonigarcia
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Link.html");

		//Go to Home Page
		WebElement homepagelink=driver.findElementByLinkText("Go to Home Page");
		homepagelink.click();
		driver.navigate().back();


		//Find where am supposed to go without clicking me?(href)
		WebElement wheretogo=driver.findElementByPartialLinkText("Find where am supposed");
		String where=wheretogo.getAttribute("href");
		System.out.println("The Link is going to "+ where);
		
		//verify am I broken
		WebElement broken=driver.findElementByLinkText("Verify am I broken?");
		broken.click();
		String title=driver.getTitle();
		if(title.contains("404"))
		{
			System.out.println("Link is Broken");
		}
		driver.navigate().back();
		
		
		//Go to Home Page (Interact with same link name)
		WebElement homepagelink1=driver.findElementByLinkText("Go to Home Page");
		homepagelink1.click();
		driver.navigate().back();
		//How many links are available in this page?
        List<WebElement> totallinks=  driver.findElementsByTagName("a");//findelements to find onr or more
        int linkcount=totallinks.size();
        System.out.println("Total Links is"+linkcount);
        
        
      
		
		}
		
	
		


	}


