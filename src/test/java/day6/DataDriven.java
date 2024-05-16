package day6;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.HttpClient.Factory;

public class DataDriven {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		

        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        
        FileInputStream fis = new FileInputStream("C:\\Users\\joshi\\OneDrive\\Desktop\\selinium\\selinium_project\\src\\test\\resources\\Testdata\\fbdata.xlsx");
        
        Workbook book = WorkbookFactory.create(fis);
        
        
        String email = book .getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
        
        String password  = book .getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
        
        driver.findElement(By.id("email")).sendKeys(email);
		

		
		driver.findElement(By.id("pass")).sendKeys(password);
		
	
		
		
		
	
		book.close();// closing the workbook instance
	}

}
