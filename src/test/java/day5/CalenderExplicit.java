package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderExplicit {

	
	public static void main(String[] args) {
		
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	
	driver.findElement(By.id("datepicker")).click();
	
	
	WebDriverWait s1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	

	s1.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ui-datepicker-div"))));//explicit for particular element
	
	String actualMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
	
	String actualYear =  driver.findElement(By.className("ui-datepicker-year")).getText();
	
	while (!(actualMonth.equals("May")&&actualYear.equals("1998"))) {
		
		driver.findElement(By.xpath("//a[@data-handler='prev']")).click();
		
		actualMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		actualYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		
	}
	
	driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[.='2']")).click();
}
}