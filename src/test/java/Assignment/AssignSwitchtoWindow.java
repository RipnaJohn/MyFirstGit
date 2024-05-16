package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignSwitchtoWindow {
	
    public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
		
		 driver.get("https://the-internet.herokuapp.com/login");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//a[.='Elemental Selenium']")).click(); 
		 
         String parentHandle =driver.getWindowHandle();
		 
		 Set<String> allhandles = driver.getWindowHandles();
		 
		 for (String singlehandle : allhandles) {
			 
			 driver.switchTo().window(singlehandle);
			 
			 if (driver.getTitle().equals("Home | Elemental Selenium")) {
				 break;
			 }
			 }
			 
		 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ripnajohn8@gmail.com");
		 
		 WebElement dropdown = driver.findElement(By.id("options"));
			
			Select s = new Select(dropdown);
			
			s.selectByValue("python");
			
			Thread.sleep(2000);
			
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
		 driver.switchTo().window(parentHandle);
		 
		 driver.findElement(By.id("username")).sendKeys("Ripna John");
		 
		 driver.findElement(By.id("password")).sendKeys("Ripna123");
		 
		 driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
			
		 

}
}
