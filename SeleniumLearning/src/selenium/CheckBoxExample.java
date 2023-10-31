package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("Webdriver.chrome.driver", "F:\\\\Selenium learning\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		WebElement Selbox= driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple\"]/ul"));
		Selbox.click();
		
		WebElement SelMul = driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[2]/ul/li[2]/div/div[2]"));
		SelMul.click();
		
		
		WebElement SelMul2 = driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[2]/ul/li[4]/div/div[2]"));
		SelMul2.click();
		
		WebElement Close = driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[1]/a/span"));
		Close.click();
		
		Thread.sleep(3000);
		
		WebElement Toggle = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt100\"]/div[2]"));
		Toggle.click();
		
		WebElement disablecheck = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102_input\"]"));
		boolean isDisabled1 = disablecheck.isEnabled();
		System.out.println(isDisabled1);
	}

}
