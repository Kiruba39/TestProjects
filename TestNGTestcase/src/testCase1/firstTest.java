package testCase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class firstTest {
	public WebDriver driver;
	
	
	
  @Test(enabled =true, priority=0)
  public void launchbrowserValidate() {
	  driver = new ChromeDriver();
	  driver.get("http://www.gcrit.com/build3/login.php");  
	  Assert.assertTrue(driver!=null);
  
  }
  
  
	  
  @Test(enabled =true, priority=1)  
  public void validateLogin() {
	  String username = "admin";
	  String password = "admin@123";
	  WebElement uName= driver.findElement(By.xpath("//input[@name='username'"));
	  WebElement pass= driver.findElement(By.xpath("//input[@name='password'"));
	  uName.sendKeys(username);
	  pass.sendKeys(password);
  WebElement login = driver.findElement(By.cssSelector("button#tbd1"));
  login.click();
  
  WebElement titlewebPage= driver.findElement(By.xpath("//title='GCR Shop Admin'"));
  Assert.assertTrue(titlewebPage.isDisplayed());
  
  }
  
  @AfterSuite
  public void closeDriver() {
	  driver.close();
  }
}
