package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepicker3 {
	
	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Datepicker.html");
			

			driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
			
			String actualmonth1 =driver.findElement(By.xpath("//div[@class='datepick-month-header']")).getText();
			
	        WebElement dropdown = driver.findElement(By.xpath("//select[@class='datepick-month-year' and @title='Change the month']"));
			
			Select s = new Select(dropdown);
			
			s.selectByVisibleText("August");
			//
			
	        WebElement dropdown2 = driver.findElement(By.xpath("//select[@title='Change the year']"));

			
			Select s1 = new Select(dropdown2);
			
			s1.selectByVisibleText("2013");
			
	
			

			driver.findElement(By.linkText("15")).click();

			
	}

}
