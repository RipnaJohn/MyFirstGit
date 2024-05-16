package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	
WebDriver driver;
	
	SoftAssert sa;
	
	@BeforeTest
	public void setup() {
		
		 driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		
		driver.manage().window().maximize();
		
		//Hard Assertion for title check
		
		sa = new SoftAssert();
		
			
		String actualtitle = driver.getTitle();
		
		String expectedtitle="ractice Page";
		
		
		sa.assertEquals(actualtitle, expectedtitle);
		sa.assertAll();
	}
	
	@Test
	public void clicktest() {
		
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
		
		checkbox1.click();
		
		boolean status = checkbox1.isSelected();
		sa = new SoftAssert();
		sa.assertTrue(status);
		
		
		driver.navigate().refresh();
		sa.assertAll();
		
		
	}
	@AfterTest
	public void teardown() {
		
		driver.quit();
	}

}
