package testNGsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Priority {

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
	@Parameters({})	
	@Test
	public void searchHotels(String location, String hotels, String roomType,
			String noofRooms, String checkIndate, String checkOutdate, 
			String adultsPerRoom, String ChildrenPerRoom ) {



	}	
}

//	
//
//	@Test(priority=-2)
//	private void Test1() {
//		System.out.println("Method 1");
//
//	}
//
//	@Test(priority=1)
//	private void Test2() {
//		System.out.println("Method 2");
//
//	}
//
//	@Test(priority=-4)
//	private void Test3() {
//		System.out.println("Method 3");
//
//	}
//
//	@Test(priority=3)
//	private void Test4() {
//		System.out.println("Method 3");
//	
//
//}
//	@Test
//	private void Test5() {
//		System.out.println("Method 3");
//	
//	}
//}	
//	
