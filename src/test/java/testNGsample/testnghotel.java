package testNGsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Integration.ReusableCode;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testnghotel extends ReusableCode {


	WebDriver driver;

	@BeforeClass
	private void beforeClass() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		Thread.sleep(2000);
	}

	@Parameters({"username","password"})
	@Test
	private void fb(String s, String s1) {
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys(s);

		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys(s1);
		
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
	}
	@Parameters({"location","hotels", "roomType", "noofRooms", "checkIndate",
				"checkOutdate", "adultsPerRoom", "ChildrenPerRoom"})	
	@Test
	public void searchHotels(String location, String hotels, String roomType,
			String noofRooms, String checkIndate, String checkOutdate, 
			String adultsPerRoom, String ChildrenPerRoom ) {

WebElement Location = driver.findElement(By.id("location"));
Select s = new Select(Location);
s.selectByVisibleText(location);


WebElement Hotels = driver.findElement(By.id("hotels"));
Select s1 = new Select(Hotels);
s1.selectByVisibleText(hotels);


WebElement Roomtype = driver.findElement(By.id("room_type"));
Select s2 = new Select(Roomtype);
s2.selectByVisibleText(roomType);

WebElement RoomNo = driver.findElement(By.id("room_nos"));
Select s21 = new Select(RoomNo);
s21.selectByVisibleText(noofRooms);

WebElement Checkindate = driver.findElement(By.id("datepick_in"));
Checkindate.sendKeys(checkIndate);

WebElement CheckOutdate = driver.findElement(By.id("datepick_out"));
CheckOutdate.sendKeys(checkOutdate);

WebElement AdultRoom = driver.findElement(By.id("adult_room"));
Select s211 = new Select(AdultRoom);
s211.selectByVisibleText(adultsPerRoom);

WebElement ChildRoom = driver.findElement(By.id("child_room"));
Select s2111 = new Select(ChildRoom);
s2111.selectByVisibleText(ChildrenPerRoom);

WebElement btnsearch = driver.findElement(By.id("Submit"));
btnsearch.click();

WebElement btnselect = driver.findElement(By.id("radiobutton_0"));
btnselect.click();
	
WebElement btnContinue = driver.findElement(By.id("continue"));
btnContinue.click();
}
@Parameters({"FirstName","LastName", "BillingAddress", "CreditcardNo"})
@Test
public void BookHotels(String FirstName, String LastName, String BillingAddress,
String CreditcardNo ) {

	
	}

}
