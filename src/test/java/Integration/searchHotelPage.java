package Integration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchHotelPage extends ReusableCode {

	public searchHotelPage() {
		PageFactory.initElements(driver, this);	
	}

	@FindBy(id="location")
	private WebElement dDnLocation;

	@FindBy(id="hotels")
	private WebElement dDnHotels;

	@FindBy(id="room_type")
	private WebElement dDnRoomType;

	@FindBy(id="room_nos")
	private WebElement dDnRoomNo;

	@FindBy(id="datepick_in")
	private WebElement txtCheckInDate;

	@FindBy(id="datepick_out")
	private WebElement txtCheckOutDate;

	@FindBy(id="adult_room")
	private WebElement dDnAdultsPerRoom;

	@FindBy(id="child_room")
	private WebElement dDnChildrenPerRoom;

	@FindBy(id="Submit")
	private WebElement BtnSearch;

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;

	}

	public WebElement getdDnRoomNo() {
		return dDnRoomNo;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getdDnAdultsPerRoom() {
		return dDnAdultsPerRoom;
	}

	public WebElement getdDnChildrenPerRoom() {
		return dDnChildrenPerRoom;
	}

	public WebElement getBtnSearch() {
		return BtnSearch;
	}


	public void searchHotels(String location, String hotels, String roomType,
			String noofRooms, String checkIndate, String checkOutdate, 
			String adultsPerRoom, String ChildrenPerRoom ) {

		SelectOptionByText(getdDnLocation(), location);
		SelectOptionByText(getdDnHotels(), hotels);
		SelectOptionByText(getdDnRoomType(), roomType);
		SelectOptionByText(getdDnRoomNo(), noofRooms);
		type(getTxtCheckInDate(), checkIndate);
		type(getTxtCheckOutDate(), checkOutdate);
		SelectOptionByText(getdDnAdultsPerRoom(), adultsPerRoom);
		SelectOptionByText(getdDnChildrenPerRoom(), ChildrenPerRoom);
		Click(getBtnSearch());

	}

}


