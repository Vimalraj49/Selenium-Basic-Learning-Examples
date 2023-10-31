package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "F:\\\\Selenium learning\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		
		WebElement defaultselect = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2:2\"]"));
		boolean status1 = defaultselect.isSelected();
		
		/* WebElement label = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/label"));
		System.out.println(label.getText()); */
		
		WebElement Unselected = driver.findElement(By.id("j_idt87:console1:0"));
		boolean status2 = Unselected.isSelected();
		
		System.out.println(status1);
		System.out.println(status2);
		

	}

}
