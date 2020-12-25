package Assignmentw2seltes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractwithImages {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup(); // bonigarcia
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Image.html");
		//Click on this image to go home page
		WebElement firstimage= driver.findElementByXPath("//img[@src='../images/home.png']");
		firstimage.click();
		driver.navigate().back();
		//Am I Broken Image?
		//WebElement brokenimage=driver.findElementByXPath("//label[@for='position'])[1]");
		WebElement brokenimage=driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[2]/div/div/img");
		if(brokenimage.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("The Image is Broken");
			}
		
		else {
			System.out.println("The Imageis NotBroken");
		}
     //Click me using Keyboard or Mouse
    WebElement usingkeyboard= driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[3]/div/div/img");
     usingkeyboard.click();

	}

}
