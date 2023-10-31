package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","F:\\\\Selenium learning\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0ssfawwk377d5164g05e0zmxhi422220.node0");
		
		WebElement alertBox = driver.findElement(By.id("j_idt88:j_idt91"));
		alertBox.click();
		
		Alert Alert = driver.switchTo().alert();
		Alert.accept();
		
		WebElement alertConfirm = driver.findElement(By.id("j_idt88:j_idt93"));
		alertConfirm.click();
		
		Alert ConfirmationAlert = driver.switchTo().alert();
		ConfirmationAlert.dismiss();
		
		WebElement PromptBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]"));
		PromptBox.click();
		
		Alert PromptAlert = driver.switchTo().alert();
		PromptAlert.sendKeys("Potter");
		PromptAlert.accept();
		

	}

}
