package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextLink {
	
	
	public static void main(String[] args) throws InterruptedException{
		
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        //step1- create  object of webdriverwait class
        
        WebElement link1 = driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material"));
        
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        
        //step2 - use until() and ExpectedConditions
        
        wait.until(ExpectedConditions.elementToBeClickable(link1));
        
        //using linktext
        
        link1.click();
        
	}

}
//Explicit- if it is clicable means it goes next line otherwise it will wait for 10 seconds then also not clikable then show the TimeOut Exception.

//if the condition is satisfied it will not show anything