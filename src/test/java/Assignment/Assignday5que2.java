package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignday5que2 {
	
	 public static void main(String[] args) throws InterruptedException {
			
			
			WebDriver driver = new ChromeDriver();

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.snapdeal.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("document.getElementById('inputValEnter').value='Shoes'");
			
			
			js.executeScript("document.getElementsByClassName('searchformButton col-xs-4 rippleGrey').click();");
			
            WebDriverWait s1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			

			s1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"))));//explicit for particular element
			
			
	 }

}
