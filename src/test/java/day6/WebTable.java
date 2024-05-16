package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		
          String txt = driver.findElement(By.xpath("(//table[@id='product'])[2]/tbody/tr[3]/td[3]")).getText();
		
		  System.out.println(txt);
		
	}

}
