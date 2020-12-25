package Assignmentw2seltes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoadUrl {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup(); // bonigarcia
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Loading URL  ........");
		
		//to get url
		driver.get("https://acme-test.uipath.com/login");
		
		//username
		WebElement email =driver.findElementById("email");
		email.sendKeys("kumar.testleaf@gmail.com");
		
		//paswrd
		driver.findElementById("password").sendKeys("leaf@12");
		
		//login
		driver.findElementByXPath("//button[@class='btn btn-primary']").click();
		Thread.sleep(2000);
		
		
		//title
		driver.getTitle();
		System.out.println("Current title is : " + driver.getTitle());
		System.out.println("Going back....");
		
		//logout
		driver.findElementById("logout-form");
		 driver.close();

	}

}
