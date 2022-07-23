package Employee;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class empolyee {
	
public static void main(String[] args) throws IOException {
		
		//mention the path of the excel
		
		File file = new File ("C:\\Users\\Lenovo\\eclipse-workspace\\Framework\\Excel\\11111.xlsx");
		
		//get the objects/bytes from file
		
		FileInputStream stream = new FileInputStream(file);
		
		//create workbook
		Workbook workbook = new XSSFWorkbook(stream);
		
		//mention the sheet name
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		// Iterate row
				 
		
		for (int i=0; i<sheet.getPhysicalNumberOfRows(); i++)  {
					
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
				//System.out.println(cell);
				
				CellType cellType = cell.getCellType();
				
				switch (cellType) {
				case STRING:
					
					String value = cell.getStringCellValue();
					System.out.println(value);
					
					break;

				case NUMERIC:
					
					if (DateUtil.isCellDateFormatted(cell)) {
						
						Date dateCellValue = cell.getDateCellValue();
								
					SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yy");
					
					String format = dateformat.format(dateCellValue);
					
					System.out.println(format);
					
					}
					else {
					double d = cell.getNumericCellValue();
					BigDecimal b = BigDecimal.valueOf(d);
					String s = b.toString();
					System.out.println(s);
					
					}
						
				default:
					break;
				}
				
			}
				
			}
		
}

}
