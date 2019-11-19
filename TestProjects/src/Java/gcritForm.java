package Java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class gcritForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kirub\\TestProjectSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.gcrit.com/build3/create_account.php?osCsid=qqc7e80j1cjm01od9t0g7pmbj5");
		
		WebElement maleGenderEl = driver.findElement(By.xpath("//td[contains(text(),'Gender:')]/following-sibling::td/input[1]"));
		 
		maleGenderEl.click();
		
		System.out.println(maleGenderEl.isSelected());
		
		driver.findElement(By.xpath("//input[@name ='firstname']")).sendKeys("Kiruba");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Venkataramanan");
		driver.findElement(By.name("dob")).sendKeys("07/10/1980");
		driver.findElement(By.name("email_address")).sendKeys("kiruba_manickam@yahoo.co.in");
		driver.findElement(By.xpath("(//input[@name='company'])")).sendKeys("Bestica");
		driver.findElement(By.name("street_address")).sendKeys("2583 Waterbery ln");
		driver.findElement(By.name("postcode")).sendKeys("60089");
		driver.findElement(By.name("city")).sendKeys("Buffalo Grove");
		driver.findElement(By.xpath("(//input[@name= 'state'])")).sendKeys("Illinois");
		
		Select countryNames = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		countryNames.selectByVisibleText("United States");
		
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("210-863-1656");
		driver.findElement(By.name("password")).sendKeys("Shankari123");
		driver.findElement(By.name("confirmation")).sendKeys("Shankari123");
		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
		//submitButton.click();
		//System.out.println(submitButton.isSelected());
		
		

	}



	}


