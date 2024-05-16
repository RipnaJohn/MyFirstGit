package day7;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class JunitDemo {
	
	WebDriver driver ;


	@BeforeTest
	public void setup() {
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		
	}
	
	@Test
	public void sendkeystest() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("autocomplete")).sendKeys("This batch is Awesome!");
		
	}
	
	@Test
	public void webtabletest() throws InterruptedException {
		String num = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[7]/td[3]")).getText();
		
		System.out.println(num);	
		
		Thread.sleep(2000);
		
	}
	
	// in @aftertest i write my all post conditions
	@AfterTest
	public void teardown() {
		
		driver.close();
		
	}
}
