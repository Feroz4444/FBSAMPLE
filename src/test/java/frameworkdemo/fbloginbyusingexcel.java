package frameworkdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fbloginbyusingexcel {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement btnClick = driver.findElement(By.name("login"));

		File file = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Framework\\Excel\\FB feroz.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("FB");

		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		email.sendKeys(data);

		Row row1 = sheet.getRow(1);
		Cell cell1 = row1.getCell(1);
		String data1 = cell.getStringCellValue();
		password.sendKeys(data1);

		btnClick.click();

	}
}


/*CellType cellType = cell.getCellType();


switch (cellType) {

case STRING:
res = cell.getStringCellValue();

break;

case NUMERIC:
if (DateUtil.isCellDateFormatted(cell)) {
	Date dateCellValue = cell.getDateCellValue();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	res = dateFormat.format(dateCellValue);
}
else {
	double numericCellValue = cell.getNumericCellValue();
	BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
	res = valueOf.toString();
}
break;
default:
break;
}*/


/*	baseclass.getdriver();
baseclass.loadUrl("https://www.facebook.com/");
baseclass.maximize();

Thread.sleep(2000);
WebElement txtUserName = baseclass.findELementById("email");
String name = baseclass.getData("FB", 1, 0);
baseclass.type(txtUserName, name);

WebElement txtPassword = baseclass.findELementById("pass");
String pass = baseclass.getData("FB", 1, 1);
baseclass.type(txtPassword, pass);

WebElement btnlogin = baseclass.findELementByName("login");
baseclass.Click(btnlogin);*/



