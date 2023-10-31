package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogle {

	public static void main(String[] args) throws IOException {
		
		//1.Fileinputstream
		//2.Properties class/obj creation
		//3.load properties
		//4.get properties
		//5.if case to select browser properties
		
		WebDriver driver = null;
		
		FileInputStream stream = new FileInputStream("config.properties");
		
		Properties properties = new Properties();
		properties.load(stream);
		
		String browser = properties.getProperty("browser");
		String driverLocation = properties.getProperty("Driverlocation");
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",driverLocation);
			 driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",driverLocation);
			 driver = new FirefoxDriver();
		}
		
		
		
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		
		

	}

}
