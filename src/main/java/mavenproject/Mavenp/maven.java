package mavenproject.Mavenp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class maven
{
	WebDriver driver;


	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GS-1684\\eclipse-workspace\\Mavenp\\Resource\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php?");
		driver.manage().window().maximize();
	}


	@Test
	public void login()
	{
		WebElement userName = driver.findElement(By.id("user_login"));
		userName.sendKeys("admin");
		WebElement password = driver.findElement(By.id("user_pass"));
		password.sendKeys("demo");
		WebElement loginBtn = driver.findElement(By.id("wp-submit"));
		loginBtn.click();
	}


	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
