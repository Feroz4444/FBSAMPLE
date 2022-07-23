package Integration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingConfirmation extends ReusableCode {

	@FindBy(id="order_no")
	private WebElement orderID;

	public WebElement getOrderID() {
		return orderID;

	}

	public void orderConfirmation(String orderID) {
		getText(getOrderID());
	}


}
