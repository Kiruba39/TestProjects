package testingJanbask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class homPpagecheck {
WebDriver driver;
	

@BeforeMethod
	public void setup(){
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\kirub\\libs\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.janbasktraining.com");
}

@Test
 public void verifyPageTitleTest() {
	
	String title = driver.getTitle();
	Assert.assertEquals(title,"JanBask Training | Online Training & Certification with Professional");
	
}

@Test
	public void verifyLogoTest () {
	boolean flag = driver.findElement(By.xpath("//a[@class='logo']")).isDisplayed();
	Assert.assertTrue(flag);

}



@AfterMethod

public void tearDown() {

driver.quit();



}
}