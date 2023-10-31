package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium learning\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		
		WebElement InputName = driver.findElement(By.id("j_idt88:name"));
		InputName.sendKeys("VIMALRAJ");
		
		WebElement InputAppend = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
		InputAppend.sendKeys(" India");
		
		WebElement DisabledTextBox = driver.findElement(By.name("j_idt88:j_idt93"));
		boolean Enabled =  DisabledTextBox.isEnabled();
		System.out.println(Enabled);
		
		WebElement Cleartext = driver.findElement(By.id("j_idt88:j_idt95"));
		Cleartext.clear();
		
		WebElement RetrieveText = driver.findElement(By.id("j_idt88:j_idt97"));
		String value = RetrieveText.getAttribute("value");
		System.out.println(value);
		
		WebElement EmailBoxTab = driver.findElement(By.name("j_idt88:j_idt99"));
		EmailBoxTab.sendKeys("testmail@gmail.com",Keys.TAB);
		
		WebElement ErrorBoxIdentify = driver.findElement(By.id("j_idt106:thisform:age"));
		ErrorBoxIdentify.sendKeys(Keys.ENTER);
		WebElement ErrorMessage = driver.findElement(By.className("ui-message-error-detail"));
		String Message = ErrorMessage.getText();
		System.out.println("The Error message is: " + Message);//But the whole page refresh and previous entries are lost 
		
		}

}
