package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLink {
	
	public static void main(String[] args) {
		 
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("total links in flipkart.com is"+ links.size());
		
		for(WebElement link : links) {
			
			String hrefval = link.getAttribute("href");
			
			System.out.println(hrefval);
		}
	}

}

