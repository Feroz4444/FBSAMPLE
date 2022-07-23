package Integration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdactinPageFactory extends ReusableCode{

	@BeforeClass
	public static void beforeClass() throws Exception {
		getdriver();
		loadUrl("https://adactinhotelapp.com/");
		maximize();
		Thread.sleep(1000);

	}

	//	@AfterClass
	//	public static void afterclass() {
	//		driver.quit();
	//	}

	@Test
	public  void login() throws Exception {
		//login
		LoginPage loginpage = new LoginPage();
		loginpage.login(getData("Hotel", 1, 0), getData("Hotel", 1, 1));
				
		//SearchHotel
		searchHotelPage searchHotel = new searchHotelPage();
		searchHotel.searchHotels(getData("Hotel", 1, 2),getData("Hotel", 1, 3),getData("Hotel", 1, 4),
				getData("Hotel", 1, 5),getData("Hotel", 1, 8),getData("Hotel", 1, 9),
				getData("Hotel", 1, 6),getData("Hotel", 1, 7));
		
		//SelectHotel
		SelectHotelPage selectHotel = new SelectHotelPage();
		selectHotel.select();
		
		//BookHotel
		BookHotel book = new BookHotel();
		book.bookHotel(getData("Hotel", 1, 10),getData("Hotel", 1, 11),getData("Hotel", 1, 12),
				getData("Hotel", 1, 13),getData("Hotel", 1, 14),getData("Hotel", 1, 15),
				getData("Hotel", 1, 16),getData("Hotel", 1, 17));
	
		//Booking confirmation
		Orderid id = new Orderid();
		threadwait();
		id.orderIdno();
		
		
		CancelBooking cancel = new CancelBooking();
		threadwait();
		cancel.cancelBook(getData("Hotel", 1, 18));
		
		
	}	

	}
