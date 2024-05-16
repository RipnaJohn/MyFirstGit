package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ParallelAssign {
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	@BeforeTest
	public void setup() {
		
		 driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.manage().window().maximize();
		
		//Hard Assertion for title check
			
		String actualtitle = driver.getTitle();
		
		String expectedtitle="The Internet";
		
		Assert.assertEquals(actualtitle, expectedtitle);
		
		
	}
	@BeforeClass
	public void reportconfig() {
		
		
		 report = new ExtentReports("C:\\Users\\joshi\\OneDrive\\Documents\\Selenium Report1\\newreport4.html");
		
		 test = report.startTest("herokuappTests"); 
		
	}
	
	@BeforeMethod(alwaysRun = true)
	public void setup1() {
		 driver = new ChromeDriver();
		
		 test.log(LogStatus.PASS, "Chrome browser opened successfully");
		 System.out.println("Browser opened successfully");
		
		driver.manage().window().maximize();
		 test.log(LogStatus.PASS, "maximised brpwser");
		
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		if(driver.getCurrentUrl().equals("https://the-internet.herokuapp.com/login")) {
			
			 test.log(LogStatus.PASS, "URL loaded successfully");
			
		}else
			
			test.log(LogStatus.FAIL, "URL loaded unsuccessful"); 
	}
	
	@Test
	public void displaytest() {
		
		WebElement userName = driver.findElement(By.id("username"));
		
		userName.sendKeys();
		
		boolean status = userName.isDisplayed();
		
		Assert.assertTrue(status); 
		
		driver.navigate().refresh();
		
	}
		
	@Test(groups = "smoke",priority = -1)
		public void sendkeystest() throws InterruptedException {
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("username")).sendKeys("Ripna");
			 test.log(LogStatus.PASS, "Text entered successfully");
			
		}
	
	@Test(groups = "smoke",priority = 1)
	public void sendkeystest1() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("Ripna2111");
		 test.log(LogStatus.PASS, "Text entered successfully");
		
	}
	
	@Test(groups = "regression",priority = 2) 
	public void linktest() {
		
		WebElement link1 = driver.findElement(By.linkText("Elemental Selenium"));
		WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(10));		
		
		
		
		wait.until(ExpectedConditions.elementToBeClickable(link1));
		
		
		//using linktext
		link1.click();
		 test.log(LogStatus.PASS, "link is working and clicked on it");// this will log the message in your report
		
	}
		
	
	@Test
	public  void chrometest() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.linkText("Elemental Selenium")).click();
		driver.close();
		
	}
	
	@Test
	public  void firefoxtest() {
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://the-internet.herokuapp.com/login");
		driver1.findElement(By.linkText("Elemental Selenium")).click();
		driver1.close();
		
	}
	
	@Test
	public  void edgetest() {
		
		WebDriver driver2 = new EdgeDriver();
		driver2.get("https://the-internet.herokuapp.com/login");
		driver2.findElement(By.linkText("Elemental Selenium")).click();
		driver2.close();
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void teardown() {
		
		driver.close();
		
	}
	
	@org.testng.annotations.AfterClass
	public void reportflush() {
		
		report.endTest(test);
		
		report.flush();
		
	}
	
	@AfterTest
	public void teardown1() {
		
		driver.quit();
	}

}
