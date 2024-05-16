package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign6q2 {
	
    public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		
		driver.findElement(By.id("input-4")).sendKeys("C:\\Users\\joshi\\OneDrive\\Documents\\Screenshot selenium1\\3.png");
		
		driver.findElement(By.xpath("//span[.='Upload']")).click();
		
		driver.findElement(By.id("submitbutton")).click();
		
	
	}
}
