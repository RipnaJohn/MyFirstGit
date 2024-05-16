package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign2 {
	
    public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		
		String actualmonth =driver.findElement(By.className("ui-datepicker-month")).getText();
		
		String actualyear =driver.findElement (By.className("ui-datepicker-year")).getText();
		
		while(!(actualmonth.equals("January")&&actualyear.equals("2025"))){
			
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			
			actualmonth =driver.findElement(By.className("ui-datepicker-month")).getText();
			
			actualyear =driver.findElement (By.className("ui-datepicker-year")).getText();
		}
		
		driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[.='11']")).click();
		
		
		
    }
}