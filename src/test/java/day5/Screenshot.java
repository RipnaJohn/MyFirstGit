package day5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main(String[] args) throws IOException {
		
		 WebDriver d=new ChromeDriver(); 
		 
	     d.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			
	     d.manage().window().maximize();
	     
	     // before scrolling take screenshot
	     
	     TakesScreenshot ts = (TakesScreenshot)d;
	     File file1 =ts.getScreenshotAs(OutputType.FILE);// temporary file
	     //storing file var in file class used to store files.
	     // now we are taking screen shot and storing as file
	     
	     File file2 = new File("C:\\Users\\joshi\\OneDrive\\Documents\\Screenshot selenium1\\screenshot1.png");//location where i have to store screen shot
	     // we will provide file path and file name
	     // i want to store in permanent file for that i will copy file1 to file2
	     
	     FileUtils.copyDirectory(file1, file2); //this class
	     
	     JavascriptExecutor js = (JavascriptExecutor)d;
			
			js.executeScript("document.getElementById('checkBoxOption1').click();");
			
			
			js.executeScript("document.getElementById('autocomplete').value='Hi Good Morning'");
			
			js.executeScript("window.scrollBy(0,900)");
			
			
		 // after scrolling taking screen shot
			
	}

}
