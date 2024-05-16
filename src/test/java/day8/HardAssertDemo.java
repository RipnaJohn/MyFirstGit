package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertDemo {
	

	// assertion for title check
	
	@Test
	public void zerodhatest() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://zerodha.com/");
		
		driver.manage().window().maximize();
		
		//Hard Assertion for title check
			
		String actualtitle = driver.getTitle();
		
		String expectedtitle="Zerodha - Online stock trading at lowest prices from India's biggest stock broker – Zerodha";
		
		Assert.assertEquals(actualtitle, expectedtitle);
		
		driver.findElement(By.linkText("Signup")).click(); // this was not executed in failure because
		// in hard assertion the test aborts if the assertion fails
		
	}
	
	@Test
	public void zerodhatest2() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://zerodha.com/");
		
		driver.manage().window().maximize();
		
		//Hard Assertion for title check
			
		String actualtitle = driver.getTitle();
		
		String expectedtitle="erodha - Online stock trading at lowest prices from India's biggest stock broker – Zerodha";
		
	
		// Soft assertion
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(actualtitle, expectedtitle);		// in Soft assertion the test will not abort if the assertion fail
		
		driver.findElement(By.linkText("Signup")).click();// this was not executed in failure because
		
		
		sa.assertAll();// only if use assertall() then only we can see the assertion failure message.
		// assertAll() is a mandatory step in Soft assert.
		
	}

}
