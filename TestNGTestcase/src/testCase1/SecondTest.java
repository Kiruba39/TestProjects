package testCase1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondTest {
public String baseUrl = "https://www.google.com";
String driverPath= "C:\\Users\\kirub\\libs\\chromedriver.exe";

 public WebDriver driver;

@Test

public void verifyTitle(){
 System.setProperty("webdriver.chrome.driver",driverPath);
 driver=new ChromeDriver();
driver.get(baseUrl);	
String pageTitle = driver.getTitle();
Assert.assertEquals(pageTitle,"Google");
driver.close();

}

@Test
public void testA() {
	Assert.assertEquals("Gmail","Gmail");
}
@Test
public void testC() {
	Assert.assertEquals("Yahoo","Yahoo");
}
@Test
public void testB() {
	Assert.assertEquals("Google","Google");
}

@Test (priority=3)
public void testD() {
	Assert.assertEquals("Gmail","Gmail");
}
@Test (priority=1)
public void testE() {
	Assert.assertEquals("Yahoo","Yahoo");
}
@Test (priority=2)
public void testF() {
	Assert.assertEquals("Google","Google");
}
@Test
public void login() {
	System.out.println("Login Successful");
}
@Test(dependsOnMethods = {"login"})
public void search () {
	System.out.println("Search Successful");
}
@Test(dependsOnMethods = {"search"})
	public void advancesearch () {
		System.out.println("Advance Search Successful");
}

@Test(dependsOnMethods = {"advancesearch"})
public void logout () {
	System.out.println("Logout Successful");
}



}

