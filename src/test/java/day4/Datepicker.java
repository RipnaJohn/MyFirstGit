package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
	
  public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		
		String actualmonth =driver.findElement(By.className("ui-datepicker-month")).getText();

		String actualyear =driver.findElement (By.className("ui-datepicker-year")).getText();
		
		while(!(actualmonth.equals("October")&&actualyear.equals("2025"))){
			
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			
			actualmonth =driver.findElement(By.className("ui-datepicker-month")).getText();
			
			actualyear =driver.findElement (By.className("ui-datepicker-year")).getText();
		
			
		}
		driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[.='2']")).click();
		
		
}
}