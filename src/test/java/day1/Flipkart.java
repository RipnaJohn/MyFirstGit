package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		
	    d.manage().window().maximize();
		
		d.get("https://www.flipkart.com/");
		
	}

}
