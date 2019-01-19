package org.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class ExcelData {
	WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;
 
    @BeforeTest
 public void initialization(){
     // To set the path of the Chrome driver.
 System.setProperty("webdriver.chrome.driver","D:\\eclipse\\DataDriven\\TestNG\\driver\\chromedriver.exe");
 driver = new ChromeDriver();
      
     // To launch facebook
     driver.get("http://sc.spi-global.com/login.php");
     // To maximize the browser
     driver.manage().window().maximize();
     // implicit wait
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
   
 @Test
 public void fbLoginLogout() throws IOException{
 // Import excel sheet.
 File src=new File("C:\\Users\\005951\\Desktop\\Book1.xlsx");   
 // Load the file.
 FileInputStream fis = new FileInputStream(src);
 // Load the workbook.
 workbook = new XSSFWorkbook(fis);
 // Load the sheet in which data is stored.
 sheet= workbook.getSheetAt(0);
 for(int i=1; i<=sheet.getLastRowNum(); i++){
 /*I have added test data in the cell A2 as "testemailone@test.com" and B2 as "password"
 Cell A2 = row 1 and column 0. It reads first row as 0, second row as 1 and so on 
 and first column (A) as 0 and second column (B) as 1 and so on*/ 
 
 // Import data for Email.
 cell = sheet.getRow(i).getCell(0);
 cell.setCellType(CellType.STRING);

 driver.findElement(By.id("username")).sendKeys(cell.getStringCellValue());
 System.out.println("username");
 // Import data for password.
 cell = sheet.getRow(i).getCell(1);
 cell.setCellType(CellType.STRING);
      
 driver.findElement(By.id("password")).sendKeys(cell.getStringCellValue());
 System.out.println("password");
 // To click on Login button

 }
 }
}
