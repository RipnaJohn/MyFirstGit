package Assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignday6q3 {

public static void main(String[] args) throws EncryptedDocumentException, IOException {
		

        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.instagram.com/accounts/login/?hl=en");
        
        FileInputStream fis = new FileInputStream("C:\\Users\\joshi\\OneDrive\\Desktop\\selinium\\selinium_project\\src\\test\\resources\\Testdata\\fbdata.xlsx");
        
        Workbook book = WorkbookFactory.create(fis);
        
        
        String email = book .getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
        
        String password  = book .getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
        
        
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(email);
		

		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		book.close();
}
}