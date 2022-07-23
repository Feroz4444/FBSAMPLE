package Integration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends ReusableCode {
	
	public BookHotel() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id="first_name")
	private WebElement txtFirstname;
	
	@FindBy(id="last_name")
	private WebElement txtLasttname;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtcreditCardNo;
	
	@FindBy(id="cc_type")
	private WebElement dDnccType;
	
	@FindBy(id="cc_exp_month")
	private WebElement dDnccExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement dDnccExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCVV;
	
	@FindBy(id="book_now")
	private WebElement btnBook;

	public WebElement getTxtFirstname() {
		return txtFirstname;
	}

	public WebElement getTxtLasttname() {
		return txtLasttname;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtcreditCardNo() {
		return txtcreditCardNo;
	}

	public WebElement getdDnccType() {
		return dDnccType;
	}

	public WebElement getdDnccExpMonth() {
		return dDnccExpMonth;
	}

	public WebElement getdDnccExpYear() {
		return dDnccExpYear;
	}

	public WebElement getTxtCVV() {
		return txtCVV;
	}
	public WebElement getBtnBook() {
		return btnBook;
	}

	public void bookHotel(String firstname,String lastname, String billingAddress, String creditCardNo, String creditCardType, String expiryMonth, String expiryYear, String cVVNumber ) {
	
		type(getTxtFirstname(), firstname);
		type(getTxtLasttname(), lastname);
		type(getTxtAddress(), billingAddress);
		type(getTxtcreditCardNo(), creditCardNo);
		SelectOptionByText(getdDnccType(), creditCardType);
		SelectOptionByText(getdDnccExpMonth(), expiryMonth);
		SelectOptionByText(getdDnccExpYear(), expiryYear);
		type(getTxtCVV(), cVVNumber);
		Click(btnBook);
		
			
		
		
	}
}
