package Integration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderid extends ReusableCode {

	public Orderid() {
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(id="order_no")
	private WebElement orderNo;
	
	public WebElement getOrderNo() {
		return orderNo;
	}

	public void orderIdno() throws Exception {
		threadwait();
		String text = getAttribute(getOrderNo(), "Value");
		writeData("Hotel", 1, 18, text);
	}




}
