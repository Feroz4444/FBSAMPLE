package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mavenday1 {
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/login.php/");
	
	driver.manage().window().maximize();
	
	WebElement Txtcreate = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
	Txtcreate.click();
	}

}
