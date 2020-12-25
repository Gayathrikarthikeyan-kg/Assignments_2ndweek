package Assignmentw2seltes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingwithEdit {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup(); // bonigarcia
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");

		//enter your email address
		WebElement emailBox= driver.findElement(By.id("email"));
		emailBox.sendKeys("gayathri@gmail.com");

		//Append a text and press keyboard tab
		WebElement appendBox= driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/div/div/input");
		appendBox.sendKeys("text",Keys.TAB);

		//Get default text entered
		 
		 WebElement getTextBox= driver.findElement(By.name("username"));
		 String value =getTextBox.getAttribute("value");
		 System.out.println(value);


		//Clear the text

		WebElement clearBox= driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[4]/div/div/input");
		clearBox.clear();

		//Confirm that edit field is disabled 

		WebElement disableBox=driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[5]/div/div/input");
		boolean enabled = disableBox.isEnabled();

		System.out.println("enabled");





	}

}
