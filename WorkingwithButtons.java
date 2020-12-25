package Assignmentw2seltes;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingwithButtons {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup(); // bonigarcia
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		// find the button color
				WebElement colorButton = driver.findElement(By.id("color"));
				String color= colorButton.getCssValue("background-color");
				System.out.println("Button color is"+color);
				
				// to get the posititon
				WebElement getPositionButton = driver.findElement(By.id("position"));
				Point xypoint=getPositionButton.getLocation();
				int xvalue= xypoint.getX();
				int yvalue=xypoint.getY();
				System.out.println("x value is "+xvalue+"y value is"+yvalue);
				
				
				
				
				//height & width//size
				
				WebElement sizeButton= driver.findElement(By.id("size"));
				int height = sizeButton.getSize().getHeight();
				int width  = sizeButton.getSize().getWidth();
				System.out.println("Height is "+ height+ "width is"+width);
				
				//go to homepage
				
				WebElement homeButton = driver.findElement(By.id("home"));
				homeButton.click();
				

	}

}
