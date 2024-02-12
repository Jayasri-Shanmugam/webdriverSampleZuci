package testScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class LogInTest {
	Properties tempProp;
	FileInputStream obtained;
	
    WebDriver driver;
    @BeforeMethod
	public void setUp() throws IOException 
    {
		 tempProp=new Properties();
		 String path=System.getProperty("user.dir")+"//src//main//resources//ConfigFile//Config.properties";
		obtained=new FileInputStream(path);
		tempProp.load(obtained);
		obtained.close();
		String browser=tempProp.getProperty("browser");
		String url=tempProp.getProperty("url");
		System.out.println("Browser name..."+browser);
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			driver.get(url);
	     }
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			driver.get(url);
		}
		}
    @Test(dataProvider="loginData")
    public void validLogin(String strUser,String strPwd)
    {
    	WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
		 username.sendKeys(strUser);
	      WebElement password=driver.findElement(By.xpath("//input[@name='password' and @type='password']"));
		 password.sendKeys(strPwd);
		 driver.findElement(By.tagName("button")).click();
//		 boolean isUserValid=driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
//		 Assert.assertTrue(isUserValid);
		
}   @DataProvider(name="loginData")
    
    public Object[][] getData() throws CsvValidationException, IOException
    {
    	String path=System.getProperty("user.dir")+"//src//test//resources//testData//loginData.csv";
    	CSVReader reader=new CSVReader(new FileReader(path));
    	String cols[];
    	ArrayList<Object> dataList=new ArrayList<Object>();
    	while((cols=reader.readNext())!=null)
    	{
    		Object record[]= {cols[0],cols[1]};
    		dataList.add(record);
    	}
    	reader.close();
    	return dataList.toArray(new Object[dataList.size()][]);
    }
public String readObjPath(String objName)
{
    String objPath="";
    String path=System.getProperty("user.dir")+"//src//test//resources//dataFiles/loginPage.xlsx";
    //HSSF->.xls
    //XSSF->.xlsx

FileInputStream fin;
XSSFWorkbook workbook=null;
try
{
fin=new FileInputStream(path);
workbook=new XSSFWorkbook(fin);
}
catch(FileNotFoundException e)
{
e.printStackTrace();
}
catch(IOException e)
{
e.printStackTrace();
}
XSSFSheet loginSheet=workbook.getSheet("loginPage");
int numRows=loginSheet.getLastRowNum();
for(int i=1;i<=numRows;i++)
{
XSSFRow row=loginSheet.getRow(i);
if(row.getCell(0).getStringCellValue().equalsIgnoreCase(objName))
{
objPath=row.getCell(1).getStringCellValue();
}
}
return objPath;
}
    
   
}
