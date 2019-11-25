package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openWebsite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kirub\\TestProjectSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.findElement(By.id("hplogo")).isDisplayed());
		driver.close();

	}

}
