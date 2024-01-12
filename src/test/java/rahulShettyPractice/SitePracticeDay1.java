package rahulShettyPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SitePracticeDay1 {
	

 @Test
 public void test1() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("se");
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.keyDown(Keys.ARROW_DOWN).build().perform();
		action.keyUp(Keys.ARROW_DOWN).build().perform();
		action.keyDown(Keys.ARROW_DOWN).build().perform();
		action.keyUp(Keys.ARROW_DOWN).build().perform();
		action.keyDown(Keys.ARROW_DOWN).build().perform();
		action.keyUp(Keys.ARROW_DOWN).build().perform();
		action.keyDown(Keys.ENTER).build().perform();
		action.keyUp(Keys.ENTER).build().perform();
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select select = new Select(dropdown);
		select.selectByIndex(1);
		WebElement checkbox =  driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		System.out.println(checkbox.isSelected());
		checkbox.click();
		System.out.println(checkbox.isSelected());
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Set<String> windows = driver.getWindowHandles();
		for(String s: windows) {
			driver.switchTo().window(s);
		}

		driver.findElement(By.xpath("//a[contains(.,'Access all')]")).click();
		driver.close();
		
		
		
		
		
	 
	 
	 Thread.sleep(5000);
	 driver.quit();
 }
}
