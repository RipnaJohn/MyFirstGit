package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AsserDemo {
	
WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		 driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		
		driver.manage().window().maximize();
		
		//Hard Assertion for title check
			
		String actualtitle = driver.getTitle();
		
		String expectedtitle="Practice Page";
		
		Assert.assertEquals(actualtitle, expectedtitle);
		
		
	}
	
	@Test
	public void clicktest() {
		
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
		
		checkbox1.click();
		
		boolean status = checkbox1.isSelected();
		
		Assert.assertTrue(status); // this will check whether the checkbox is selected or not
		
		driver.navigate().refresh();
		
	}
	
	
	@Test(groups = "regression",priority = -3)
	public void webtabletest() throws InterruptedException {
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[9]/td[2]")).getText();
		
		String expected = "Master Selenium Automation in simple Python Language";
		
		Assert.assertEquals(text, expected);
		// i am asserting the text in a particular webelement
		
		driver.navigate().refresh();
		
	}
	@AfterTest
	public void teardown() {
		
		driver.quit();
	}
   
   
}
