package selenium;

import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Selenium learning\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement SelectAutomation = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		Select Tool = new Select(SelectAutomation);
		Tool.selectByVisibleText("Selenium");
		Thread.sleep(4000);
		Tool.selectByVisibleText("Cypress");
		
		//NewTab creation 
		
        ((JavascriptExecutor) driver).executeScript("window.open('', '_blank');");

        // Switch to the new tab
        Set<String> windowHandles = driver.getWindowHandles();
        String mainTabHandle = driver.getWindowHandle();
        String newTabHandle = null;

        for (String handle : windowHandles) {
            if (!handle.equals(mainTabHandle)) {
                newTabHandle = handle;
                break;
            }
        }
        driver.switchTo().window(newTabHandle);
		 
		//Let code exercise----------------------------------->
        
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		
		WebElement SelectFruits = driver.findElement(By.id("fruits"));//fruits
		Select fruits = new Select(SelectFruits);
		fruits.selectByIndex(1);
		Thread.sleep(2000);
		fruits.selectByValue("3");
		
		WebElement Firstselectedoption = fruits.getFirstSelectedOption();
		System.out.println("First selected option: "+Firstselectedoption.getText());
		
		//-------------------------
		
		WebElement SelectSuperHeros = driver.findElement(By.id("superheros"));//super heroes
		Select heroes = new Select(SelectSuperHeros);
		heroes.selectByValue("aq");
		Thread.sleep(1000);
		heroes.selectByValue("bt");
		
		System.out.println("Selected options:");
		
		List<WebElement> AllSelectedOptions = heroes.getAllSelectedOptions();
		for (WebElement webelement : AllSelectedOptions)
		{
			System.out.println(webelement.getText());
		}
		//------------------------------
		WebElement ProgLang = driver.findElement(By.id("lang"));
		Select Lang = new Select(ProgLang);
		Lang.selectByIndex(4);
		
		System.out.println("Language options:");
		
		List<WebElement> AllOptions =Lang.getOptions();
		for (WebElement option : AllOptions)
		{
			System.out.println(option.getText());
		}
		//-----------------------------------
		
		WebElement FindCountry = driver.findElement(By.id("country"));
		Select country = new Select(FindCountry);
		country.selectByValue("India");
		System.out.println("The selected value is: " +country.getFirstSelectedOption().getText());

	}

}
