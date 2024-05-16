package day5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotfull {
	
	static WebDriver d; 
	
	public static void capture(int number) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)d;
		
		File file1 =ts.getScreenshotAs(OutputType.FILE);
		
		File file2 = new File("C:\\Users\\joshi\\OneDrive\\Documents\\Screenshot selenium1\\"+number+".png");
		 
		 FileUtils.copyFile(file1, file2);
		 
	}
	
	public static void main(String[]args)throws InterruptedException,IOException {
		
		d = new ChromeDriver();
		 
	     d.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	     
	     d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
	     d.manage().window().maximize();
	     
	     capture(1);
	     
	     JavascriptExecutor js = (JavascriptExecutor)d;
	     

			js.executeScript("document.getElementById('checkBoxOption1').click();");
			
			js.executeScript("document.getElementById('autocomplete').value='Hi Good Morning'");
			
			 capture(2);
			
			js.executeScript("window.scrollBy(0,900)");
			
			capture(3);
			
			d.close();
	     
	}

}
