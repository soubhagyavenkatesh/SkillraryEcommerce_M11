package generic_library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public WebDriver driver;
public PropertyFile pdata=new PropertyFile();
public WebdriverUtilities utilities= new WebdriverUtilities();


@BeforeMethod
public void OpenApp() throws Throwable
{
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	//for maximizing
	driver.manage().window().maximize();
	//implicit
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(pdata.getPropertydata("url"));
	
}
@AfterMethod
public void closeApp(ITestResult res)throws Throwable
{
int Status=res.getStatus();
String name=res.getName();
if(Status==2) {
	Photo p=new Photo();
p.getPhoto(driver, name);
}
driver.quit();

	
}
}


