package Assignmentw2seltes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractwithCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup(); // bonigarcia
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");

		//Select the languages that you know?
		WebElement selectTheLang = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input");
		selectTheLang.click();
		//Confirm Selenium is checked
		WebElement selenium = driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/div");
		selenium.isSelected();
		boolean seleniumselected=selenium.isSelected();
		System.out.println("The selenium is Selected");
		//Deselect
		
			List <WebElement> deselect= driver.findElementsByXPath("//*[@id='contentblock']/section/div[3]//child::input");
			for(WebElement obj:deselect) {
				if(obj.isSelected()==true)
					obj.click();
			}
		
		
		//Select all below checkboxes 
		
	
		  List<WebElement> selectall=driver.findElementsByXPath("//*[@id=\'contentblock\']/section/div[4]//child::input");
		  for(WebElement obj: selectall) {
			  obj.click();
		  }
		
		
	}

}
