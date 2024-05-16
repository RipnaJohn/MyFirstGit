package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSdemo {
	
	public static void main(String[] args) {
		
        WebDriver d=new ChromeDriver(); // whaterever implementation class in chrome driver respect to Js we can exeecute that(in 17 line) 
        
        d.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		d.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		
		js.executeScript("document.getElementById('checkBoxOption1').click();");
		
		
		js.executeScript("document.getElementById('autocomplete').value='Hi Good Morning'");
		
		js.executeScript("window.scrollBy(0,900)");
		
		WebElement brokenlink = d.findElement(By.linkText("Broken Link"));
		
		js.executeScript("arguments[0].scrollIntoView();",brokenlink);
		
		js.executeScript("arguments[0].scrollIntoView();",d.findElement(By.name("radioButton")));
		
		
		
		
	}

}
// this program will send keys and scroll down the page