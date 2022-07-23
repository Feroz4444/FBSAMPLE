package testNGsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sampletest {

	WebDriver driver;

	@BeforeClass
	private void beforeClass() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	}

	@Parameters({"username","password"})
	@Test
	private void fb(String s, String s1) {
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys(s);

		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys(s1);
	}

}