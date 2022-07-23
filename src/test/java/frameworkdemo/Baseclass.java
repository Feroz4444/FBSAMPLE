package frameworkdemo;

import java.io.File;
import java.io.IOException;

import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Baseclass {

	WebDriver driver;

	Actions actions = new Actions(driver);

	public void getDriver() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();		

	}
	//1.find Locator by using name
	public WebElement findElementByname(String attributevalue) {

		WebElement element = driver.findElement(By.name("attritube value"));
		return element;

	}


	//2.find Locator by using Classname
	public WebElement findElementByClassname(String attributevalue) {

		WebElement element = driver.findElement(By.className("attritube value"));
		return element;
	}


	//3.find Locator by using Xpath
	public WebElement findElementByXpath(String Xpath) {

		WebElement element = driver.findElement(By.xpath("xpathExpression"));
		return element;
	}

	//4.find Locator by using Id

	public WebElement findElementById(String attributevalue) {

		WebElement element = driver.findElement(By.id("attritube value"));
		return element;

	}


	//5.get Url
	public void loadUrl(String Url) {
		driver.get(Url);

	}

	//6.maximize
	public void maximize() {
		driver.manage().window().maximize();
	}


	//7.sendkeys
	public void insertText(WebElement element, String text) {
		element.sendKeys(text);

	}

	//8.click

	public void btnClick(WebElement element) {
		element.click();

	}

	//9.get Title---type1
	public String getTitle() {
		String title = driver.getTitle();
		return title;

	}

	//10.get Title---type2
	public void switchToWindowByTitle() {
		String title = driver.getTitle();
		driver.switchTo().window(title);
	}

	//11.get Text
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	//12.get Attribute Name
	public String getAttribute(WebElement element, String attributeName) {
		String attribute = element.getAttribute(attributeName);
		return attribute;

	}

	//13.get Attribute value
	public String getAttribute(WebElement element) {
		String attribute = element.getAttribute("Value");
		return attribute;
	}

	//14.selectoption by Attributevalue

	public void SelectOptionByAttribute(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	//15.selectoption by Text

	public void SelectOptionByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);

	}	

	//16.selectoption by Index

	public void SelectOptionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	//17.JS executor

	public void typeJS(String data, WebElement element ) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].SetAttribute('value','"+data+"')", element);
	}


	//18. Navigate Url

	public void launchUrlBynavigate(String url) {
		driver.navigate().to(url);
	}
	//19. Navigate Refresh 

	public void navigation(String s) {

		driver.navigate().refresh();

	}

	//20.Navigate Backward

	public void pageBackward() {
		driver.navigate().back();


	}
	//21.Navigate Forward
	public void pageForward() {
		driver.navigate().forward();


	}
	//22. Mouse Hover Action
	public void mouseHoverAction(WebElement element) {
		actions.moveToElement(element).perform();

	}

	//23. dragDrop 

	public void dragDrop(WebElement s, WebElement d) {
		actions.dragAndDrop(s, d).perform();
	}

	//24. To perform Right click

	public void rightClick(WebElement element) {
		actions.contextClick(element).perform();
	}

	//25. To perform Double click

	public void clickDoublk(WebElement element) {

		actions.doubleClick(element).perform();
	}

	//26. To perform key down

	public void keysOn(WebElement element, Keys k) {
		actions.keyDown(k).perform();

	}

	//27. To perform key up

	public void keysOff(WebElement element, Keys k) {
		actions.keyUp(k).perform();

	}

	//28. To insert Text

	public void insertTextKeyonAndOff(WebElement element, String text, Keys k, Keys k1) {

		actions.keyDown(k).sendKeys(text).keyDown(k1).perform();
	}


	//29. switchToAlert

	public Alert switchToAlert() {
		Alert alert = driver.switchTo().alert();
		return alert;

	}

	//30. Accept Alert

	public void clickOk(Alert alert) {
		alert.accept();

	}

	//31. Dismiss Alert

	public void clickCancel(Alert alert) {
		alert.dismiss();
	}


	//32. Get Text in Alert

	public String alertText(Alert alert) {

		return alert.getText();
	}

	//33. To takeSreenShot & Save

	public void takeSreenShot(String storeLocation) throws IOException {
		TakesScreenshot screenshot = null;
		File temp = screenshot.getScreenshotAs(OutputType.FILE);
		File location = new File(storeLocation);
		FileUtils.copyFile(temp, location);

	}

	//34.  Deselect All

	public void deSelectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();

	}

	//35. SwitchToFrameByIndex

	public void switchToFrameByIndex(int index) {
		driver.switchTo().frame(index);

	}

	//36. swithToFrameByIdOrName

	public void swithToFrameByIdOrName(String nameOrId) {
		driver.switchTo().frame(nameOrId);

	}

	//37.SwitchToFrameByElement

	public void switchToFrameByElement(WebElement element) {
		driver.switchTo().frame(element);

	}

	//38. SwitchToWindowByTitle

	public void switchToWindowByTitle1() {
		String title = driver.getTitle();
		driver.switchTo().window(title);

	}

	//39. SwitchToWindowByUrl

	public void switchtoWindowByUrl() {
		String currentUrl = driver.getCurrentUrl();
		driver.switchTo().window(currentUrl);

	}

	//40. To get Parent Window

	public void getParentWindowId() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}


	//41. CLear the Text

	public void txtClear(WebElement element) {
		element.clear();

	}


	//42. Close the Window

	public void closeWindow() {
		driver.close();
	}

	//43. Quit the Window

	public  void closeAllWindow() {
		driver.quit();
	}

	//44. To set file location









}
