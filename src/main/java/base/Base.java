package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	public static WebDriver driver = null;

	
	public Base() {
		
		 initiateDriver();
	}
	
	private void initiateDriver() {
		if(driver==null) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			driver.manage().window().maximize(); 
			 
		}
	}
	
	public void waitExplicit(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
	}
	
	public void enterText(String xpath,String value) {
		waitExplicit(xpath);
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
	
	public void click(String xpath) {
		waitExplicit(xpath);
		driver.findElement(By.xpath(xpath)).click();
	}
	

}
