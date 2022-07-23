package Integration;

import java.io.IOException; 

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;


public class junitt extends ReusableCode {

	@BeforeClass
	public static void beforeClass() throws InterruptedException {
		getdriver();
		loadUrl("https://adactinhotelapp.com/");
		maximize();
		staticWait(5000);
	}

	@AfterClass
	public static void afterClass() {
		driver.quit();
	}

	@Test
	public void login () throws IOException, InterruptedException {

		WebElement txtUserName = findELementById("username");
		String name = getData("Hotel", 1, 0);
		type(txtUserName, name);

		WebElement txtPassword = findELementById("password");
		String pass = getData("Hotel", 1, 1);
		type(txtPassword, pass);

		WebElement btnlogin = findELementById("login");
		Click(btnlogin);

		WebElement Hellotxt = findELementById("username_show");
		String txt = Hellotxt.getAttribute("value");
		System.out.println(txt);
		Assert.assertEquals("Verify text", "Hello Ferozkhan!", txt);
		boolean b = txt.contains("Hello Ferozkhan!");
		Assert.assertTrue("Verify text", b);
		System.out.println(b);


		WebElement place = findELementById("location");
		String Location = getData("Hotel1", 1, 2);
		SelectOptionByText(place, Location);

		WebElement hotel = findELementById("hotels");
		String hotels = getData("Hotel1", 1, 3);
		SelectOptionByText(hotel, hotels);

		WebElement room = findELementById("room_type");
		String roomtype = getData("Hotel1", 1, 4);
		SelectOptionByText(room, roomtype);

		WebElement roomNum = findELementById("room_nos");
		String roomno = getData("Hotel1", 1, 5);
		SelectOptionByText(roomNum, roomno);

		WebElement checkIn = findELementById("datepick_in");
		txtClear(checkIn);

		String dateInformat = getData("Hotel", 1, 2);
		type(checkIn, dateInformat);

		WebElement checkOut = findELementById("datepick_out");
		txtClear(checkOut);

		String dataOutFormat = getData("Hotel", 1, 3);
		type(checkOut, dataOutFormat);

		WebElement adultRoom =findELementById("adult_room");
		String Adroom = getData("Hotel1", 1, 6);
		SelectOptionByText(adultRoom, Adroom);

		WebElement childRoom =findELementByName("child_room");
		String CHroom = getData("Hotel1", 1, 7);
		SelectOptionByText
		(childRoom, CHroom);

		WebElement btnSearch = findELementById("Submit");		
		btnSearch.click();

		WebElement selectHotel = findElementByXpath("//td[@class='login_title']");
		String sel = getText(selectHotel);
		System.out.println(sel);
		Assert.assertEquals("Verify Hotel", "Select Hotel", sel);
		boolean c = sel.contains("Select Hotel");
		Assert.assertTrue("Verify hotel",c);
		System.out.println(c);

		WebElement btnRadioButton = findELementById("radiobutton_0");
		btnRadioButton.click();

		WebElement btnContinue = findELementById("continue");
		btnContinue.click();

		WebElement bookHotel =findElementByXpath("//td[text()='Book A Hotel ']");
		String book = bookHotel.getText();
		System.out.println(book);
		Assert.assertEquals("Verify booking", "Book A Hotel", book);
		boolean d = book.contains("Book A Hotel");
		Assert.assertTrue("Verify book", d);
		System.out.println(d);

		Thread.sleep(3000);

		WebElement txtFirstName = findELementById("first_name");
		String enterFirstName = getData("hotel", 1, 4);
		type(txtFirstName, enterFirstName);

		WebElement txtLastName = findELementById("last_name");
		String enterLastName = getData("hotel", 1, 5);
		type(txtLastName, enterLastName);

		WebElement addAddress = findELementById("address");
		String enterAddress =getData("hotel", 1, 6);
		type(addAddress, enterAddress);

		WebElement ccNum = findELementById("cc_num");
		String enterCCNum = getData("hotel", 1, 7);
		type(ccNum, enterCCNum);

		WebElement ccType = findELementByName("cc_type");
		String enterCCtype = getData("Hotel1", 1, 14);
		SelectOptionByText(ccType, enterCCtype);

		WebElement selExpiry = findELementById("cc_exp_month");
		String enterCCexpmonth = getData("Hotel1", 1, 15);
		SelectOptionByText(selExpiry, enterCCexpmonth);

		WebElement selExpiryyr = findELementById("cc_exp_year");
		String enterCCexpyear = getData("Hotel1", 1, 16);
		SelectOptionByText(selExpiryyr, enterCCexpyear);

		WebElement cvvNum = findELementById("cc_cvv");
		String enterCVV = getData("hotel", 1, 8);
		type(cvvNum, enterCVV);

		WebElement btnBook = findELementById("book_now");
		Click(btnBook);
		
		Thread.sleep(5000);
		
		WebElement bookconfirm =findElementByXpath("//td[@class='login_title']");
		String confirmation = bookconfirm.getText();
		System.out.println(confirmation);
		Assert.assertEquals("Verify confirmationn", "Booking Confirmation", confirmation);
		boolean e = confirmation.contains("Booking Confirmation");
		Assert.assertTrue("Verify confirmationn", e);
		System.out.println(d);
		

		WebElement orderID = findELementById("order_no");
		String attribute = orderID.getAttribute("value");
		System.out.println(attribute);
		writeData("hotel", 1, 9, attribute );

	}
}
