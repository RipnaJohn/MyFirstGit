package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign6q1 {
	
static WebDriver d; 
	
	public static void capture(int number) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)d;
		
		File file1 =ts.getScreenshotAs(OutputType.FILE);
		
		File file2 = new File("C:\\Users\\joshi\\OneDrive\\Documents\\Screenshot selenium1\\screenshot\\"+number+".png");
		 
		 FileUtils.copyFile(file1, file2);
		 
	}
	
	public static void main(String[]args)throws InterruptedException,IOException {
		
		d = new ChromeDriver();
		 
		d.get("https://v1.training-support.net/selenium/drag-drop");
	     
	     d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
	     d.manage().window().maximize();
	     
	     capture(1);
	     
	     JavascriptExecutor js = (JavascriptExecutor)d;
	
			
	    WebElement ball=d.findElement(By.id("draggable"));
	    WebElement area=d.findElement(By.id("droppable"));
				
				
		Actions act = new Actions(d);
				
	   act.dragAndDrop(ball, area).build().perform();
	   
	   WebElement ball1=d.findElement(By.id("draggable"));
	    WebElement area1=d.findElement(By.id("dropzone2"));
	   
		
	     act.dragAndDrop(ball1, area1).build().perform();
	     
	     capture(2);
			
			js.executeScript("window.scrollBy(0,900)");
			
			
			d.close();
				
				
				
			
		}
		
	}


