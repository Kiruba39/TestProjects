package testCase1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class thirdTest {
	String driverPath= "C:\\Users\\kirub\\libs\\chromedriver.exe";
	 public WebDriver driver;
	
@BeforeMethod
	
	public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver",driverPath);
	
	driver=new ChromeDriver();
}

@Test
public void verifyPageTitle1() {
	driver.get("https://www.gmail.com");
	Assert.assertEquals("Gmail",driver.getTitle());
}
@Test
public void verifyPageTitle2() {
	driver.get("https://www.yahoo.com");
	Assert.assertEquals("Yahoo",driver.getTitle());
}

@AfterMethod
public void closeBrowser() {
	driver.close();
}

}