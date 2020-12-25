package Assignmentw2seltes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingwithRadioButton {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup(); // bonigarcia
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/radio.html");
		//Are you enjoying the classes?
		WebElement enjoy=driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[1]/div/div/label");
		driver.findElementByClassName("myradio").click();
		//Find default selected radio button
		WebElement unchecked=driver.findElementByXPath("//html/body/div/div/div[3]/section/div[2]/div/div/label[2]");
		WebElement checked=driver.findElementByXPath("//html/body/div/div/div[3]/section/div[2]/div/div/label[3]/input");
		boolean status1=unchecked.isSelected();
		boolean status2=checked.isSelected();
		System.out.println(status2);
		System.out.println(status1);
		//Select your age group (Only if choice wasn't selected)
		WebElement group=driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[3]/div/div/label");
		driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[1]").click();

	}
///html/body/div/div/div[3]/section/div[2]/div/div/label[2]
}
