package Integration;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class hotelbookingformat {
	
	//task 18.06.22 hotel app login

	public static void main(String[] args) throws IOException, InterruptedException {

		ReusableCode baseclass = new ReusableCode();
		baseclass.getdriver();
		baseclass.loadUrl("https://adactinhotelapp.com/");
		baseclass.maximize();

		
		WebElement txtUserName = baseclass.findELementById("username");
		String name = baseclass.getData("Hotel", 1, 0);
		baseclass.type(txtUserName, name);

		WebElement txtPassword = baseclass.findELementById("password");
		String pass = baseclass.getData("Hotel", 1, 1);
		baseclass.type(txtPassword, pass);

		WebElement btnlogin = baseclass.findELementById("login");
		baseclass.Click(btnlogin);

		WebElement place = baseclass.findELementById("location");
		baseclass.SelectOptionByText(place, "Los Angeles");

		WebElement hotel = baseclass.findELementById("hotels");
		baseclass.SelectOptionByText(hotel, "Hotel Hervey");

		WebElement room = baseclass.findELementById("room_type");
		baseclass.SelectOptionByText(room, "Super Deluxe");

		WebElement roomNum = baseclass.findELementById("room_nos");
		baseclass.SelectOptionByText(roomNum, "2 - Two");

		WebElement checkIn = baseclass.findELementById("datepick_in");
		baseclass.txtClear(checkIn);
		//String dateInformat = baseclass.getData("Data", 1, 2);
		baseclass.type(checkIn, "19/06/2022");

		WebElement checkOut = baseclass.findELementById("datepick_out");
		baseclass.txtClear(checkOut);
		//String dataOutFormat = baseclass.getData("Data", 1, 3);
		baseclass.type(checkOut, "21/06/2022");

		WebElement adultRoom = baseclass.findELementById("adult_room");
		baseclass.SelectOptionByIndex(adultRoom, 2);

		WebElement childRoom = baseclass.findELementByName("child_room");
		baseclass.SelectOptionByIndex(childRoom, 3);

		WebElement btnSearch = baseclass.findELementById("Submit");		
		btnSearch.click();

		WebElement btnRadioButton = baseclass.findELementById("radiobutton_0");
		btnRadioButton.click();

		WebElement btnContinue = baseclass.findELementById("continue");
		btnContinue.click();
		
		Thread.sleep(3000);

		WebElement txtFirstName = baseclass.findELementById("first_name");
		String enterFirstName = baseclass.getData("hotel", 1, 4);
		baseclass.type(txtFirstName, enterFirstName);

		WebElement txtLastName = baseclass.findELementById("last_name");
		String enterLastName = baseclass.getData("hotel", 1, 5);
		baseclass.type(txtLastName, enterLastName);

		WebElement addAddress = baseclass.findELementById("address");
		String enterAddress = baseclass.getData("hotel", 1, 6);
		baseclass.type(addAddress, enterAddress);

		WebElement ccNum = baseclass.findELementById("cc_num");
		String enterCCNum = baseclass.getData("hotel", 1, 7);
		baseclass.type(ccNum, enterCCNum);

		WebElement ccType = baseclass.findELementByName("cc_type");
		baseclass.SelectOptionByText(ccType, "VISA");

		WebElement selExpiry = baseclass.findELementById("cc_exp_month");
		baseclass.SelectOptionByText(selExpiry, "May");

		WebElement selExpiryyr = baseclass.findELementById("cc_exp_year");
		baseclass.SelectOptionByText(selExpiryyr, "2013");

		WebElement cvvNum = baseclass.findELementById("cc_cvv");
		String enterCVV = baseclass.getData("hotel", 1, 8);
		baseclass.type(cvvNum, enterCVV);

		WebElement btnBook = baseclass.findELementById("book_now");
		baseclass.Click(btnBook);

		Thread.sleep(5000);
		WebElement orderID = baseclass.findELementById("order_no");
		String attribute = orderID.getAttribute("value");
		baseclass.writeData("hotel", 1, 9, attribute );

	
	}

}















