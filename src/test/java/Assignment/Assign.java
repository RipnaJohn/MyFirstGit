package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign {
	
public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ripna");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("JR");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9685743216");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Ripna21");
		
		Thread.sleep(2000);
		
		WebElement dropdown =  driver.findElement(By.id("day"));
		
		Select s = new Select (dropdown);
		
		s.selectByValue("20");
		
		Thread.sleep(2000);
		
        WebElement dropdown1 =  driver.findElement(By.id("month"));
		
		Select s1 = new Select (dropdown1);
		
		s1.selectByValue("1");
		
        WebElement dropdown2 =  driver.findElement(By.id("year"));
		
		Select s2 = new Select (dropdown2);
		
		s2.selectByValue("2002");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[.='Already have an account?']")).click();
		
	}

}
