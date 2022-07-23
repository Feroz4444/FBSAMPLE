package Integration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBooking extends ReusableCode {
	public CancelBooking() {
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement clickBook;
	
	@FindBy(id="order_id_text")
	private WebElement searchOrderID;
	
	@FindBy(id="search_hotel_id")
	private WebElement clickGo;
	
	@FindBy(id="check_all")
	private WebElement clickCheckBox;
	
	@FindBy(xpath="//input[@name='cancelall']")
	private WebElement clickCancel;
	
	public WebElement getclickbook() {
		return clickBook;
		
	}

	public WebElement getSearchOrderID() {
		return searchOrderID;
	}

	public WebElement getClickGo() {
		return clickGo;
	}

	public WebElement getClickCheckBox() {
		return clickCheckBox;
	}

	public WebElement getClickCancel() {
		return clickCancel;
	}
	
	public void cancelBook(String searchID) throws Exception {
		Click(clickBook);
		type(searchOrderID, searchID);
		Click(clickGo);
		Thread.sleep(3000);
		Click(clickCheckBox);
		Click(clickCancel);
		acceptAlert();
		
				
		
	}

	}
	
	
