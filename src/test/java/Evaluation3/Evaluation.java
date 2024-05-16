package Evaluation3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Evaluation {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ilaindia.co.in/registration");
		
		WebElement dropdown = driver .findElement(By.id("jform_title"));
		
		Select s = new Select(dropdown);
		
		Thread.sleep(2000);
		
		s.selectByValue("mrs");
		
		
		driver.findElement(By.id("jform_first_name")).sendKeys("Ripna");
		
		driver.findElement(By.id("jform_last_name")).sendKeys("JR");
		
		driver.findElement(By.id("jform_address_r")).sendKeys("21A,Shiva Nagar, Ambattur,Chennai-600011");
		
        WebElement dropdown1 = driver .findElement(By.id("jform_country_r"));
        
        
		
		Select se = new Select(dropdown1);
		
		Thread.sleep(2000);
		
		se.selectByValue("99");
		
		 WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='jform_state_r']"));
	        
	        
			
			Select sel = new Select(dropdown2);
			
			Thread.sleep(2000);
			
			sel.selectByVisibleText("Tamil Nadu");
			
			
		
		
        
		
		
		
		driver.findElement(By.id("jform_zipcode_r")).sendKeys("600011");
		
		driver.findElement(By.id("jform_mobile")).sendKeys("9685741236");
		
		driver.findElement(By.id("jform_email")).sendKeys("ripnajohn27@gmail.com");
		
		driver.findElement(By.id("jform_password1")).sendKeys("Ripna2111");
		
		driver.findElement(By.id("jform_password2")).sendKeys("Ripna2111");
		
        WebElement dropdown3 = driver .findElement(By.id("jform_plan_id"));
		
		Select sele = new Select(dropdown3);
		
		sele.selectByValue("1");
		
        WebElement dropdown4 = driver .findElement(By.id("jform_zone_id"));
		
		Select selec = new Select(dropdown4);
		
		selec.selectByValue("1");
		
        WebElement dropdown5 = driver .findElement(By.id("jform_payment_method"));
		
		Select select = new Select(dropdown5);
		
		select.selectByValue("payumoney");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		
		
		
	}

}
