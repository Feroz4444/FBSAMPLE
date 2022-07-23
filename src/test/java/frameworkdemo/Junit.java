package frameworkdemo;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {

	static WebDriver driver;

	@BeforeClass

	public static void beforeclass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@AfterClass

	public static void afterclass() {

		driver.quit();
	}

	@Before
	public void beforeMethod() {
		long time = System.currentTimeMillis();
		System.out.println(time);
	}

	@After
	public void AfterMethod() {
		long time = System.currentTimeMillis();
		System.out.println(time);
	}

	@Test
	public void login() {
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys("FerozKhan");

		WebElement txtPassword = driver.findElement(By.id("password"));
		txtUsername.sendKeys("feroz@4444");

		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
	}

}
