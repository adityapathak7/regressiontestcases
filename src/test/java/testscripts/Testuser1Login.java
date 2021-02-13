package testscripts;

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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObject.LoginPageObjects;
import PageObject.homepageobjects;

public class Testuser1Login
{	
	@Test(priority = 1)
	public void User1_Login_Test() throws IOException
	{		
	System.setProperty("webdriver.chrome.driver", "E:\\software\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	LoginPageObjects log = new LoginPageObjects(driver);
	homepageobjects logout=new homepageobjects(driver);
	
	driver.get("http://localhost/dolibarr-3.1.1/htdocs/index.php");	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	File file=new File("C://Users//pa//Desktop//demodata.xlsx");
	FileInputStream fis=new FileInputStream(file);
	XSSFWorkbook workbook =new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheetAt(1);
	
	int rowcount = sheet.getLastRowNum();
	for(int i = 1;i<rowcount+1;i++) //skipping 0 first row as its a header
	{	
		XSSFCell usernamecell = sheet.getRow(i).getCell(0);
		usernamecell.setCellType(CellType.STRING);
		XSSFCell passwordcell = sheet.getRow(i).getCell(1);
		passwordcell.setCellType(CellType.STRING);
		
		log.username().sendKeys(usernamecell.getStringCellValue());
		log.password().sendKeys(passwordcell.getStringCellValue());
		log.submit().click();
		logout.Logout().click();
		}
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.close();
	}
}
