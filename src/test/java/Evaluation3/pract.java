package Evaluation3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pract {

	
	public static void main(String[] args) {
		
		

	        WebDriver driver = new ChromeDriver(); 

	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
			
			driver.manage().window().maximize();
			
			
			driver.findElement(By.id("datepicker")).click();	
			
			String actualmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			
			String actualyear = driver.findElement(By.className("ui-datepicker-year")).getText();
			


			while(!(actualmonth.equals("october")&&actualyear.equals("2024"))) {


				driver.findElement(By.xpath("//a[@data-handler='next']")).click();
				actualmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
				actualyear = driver.findElement(By.className("ui-datepicker-year")).getText();
				
			}
			

			driver.findElement(By.xpath("//td[@data-handle='selectDay']/a[.='2')")).click();
		

		}

	}
	

