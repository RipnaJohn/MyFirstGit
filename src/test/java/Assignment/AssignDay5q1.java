package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignDay5q1 {
	
	 public static void main(String[] args) throws InterruptedException {
			
			
			WebDriver driver = new ChromeDriver();

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.ebay.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Shoes");
			
			driver.findElement(By.id("gh-btn")).click();
			
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("window.scrollBy(0,900)");
			
			Thread.sleep(2000);
			
			WebElement searchback = driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']"));
			
			js.executeScript("arguments[0].scrollIntoView();",searchback);
			
			 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			 
			 wait.until(ExpectedConditions.alertIsPresent());
			 
			WebElement searchinput = driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']"));
			
			Actions act = new Actions(driver);
			
			Thread.sleep(2000);
			
			for(int i=0;i<5;i++){
				
				
				act.keyDown(searchinput,Keys.BACK_SPACE).keyUp(searchinput,Keys.BACK_SPACE).build().perform();
		}
	 }

}
