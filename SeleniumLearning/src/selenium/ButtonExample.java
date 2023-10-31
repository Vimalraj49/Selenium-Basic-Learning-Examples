package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\\\Selenium learning\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/button.xhtml");
		
		//Button position
		WebElement SubmitPosition = driver.findElement(By.id("j_idt88:j_idt94"));
		Point XYPoint = SubmitPosition.getLocation();
		int x = XYPoint.getX();
		int y = XYPoint.getY();
		System.out.println("The X value is "+ x + " The Y value is "+ y);
		
		//Button color
		WebElement Buttoncolor = driver.findElement(By.id("j_idt88:j_idt96"));
		String color = Buttoncolor.getCssValue("background-color");
		System.out.println("Background color is: "+color);
		
		//Button size
		WebElement ButtonSize = driver.findElement(By.id("j_idt88:j_idt94"));
		int height = ButtonSize.getSize().getHeight();
		int width = ButtonSize.getSize().getWidth();
		System.out.println("The height of the button is: "+height +" The width of the button is: "+width);
			
	}

}
