package Activity4_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	
	public static void main(String[] args) throws IOException {

		String filepath = "src/Activity4_3/myexcel.xlsx";
//		File f = new File(filepath);
//		if(f.createNewFile()) {
//			System.out.println("File created");
//		}
//		else
//		{
//			System.out.println("File not created");
//		}
//		
		XSSFWorkbook workbook = new XSSFWorkbook(filepath);
		XSSFSheet sheet = workbook.createSheet("Sample Demo I say");

		Object[][] datatypes = { { "Datatype", "Type", "Size(In Bytes)" }, { "int", "Prim", "2" },
				{ "float", "Prim", "4" }, { "double", "Prim", "8" }, { "char", "Prim", "1" },
				{ "String", "Non-Prim", "No Fixed Size" } };

		int rowNum = 0;
		System.out.println("Creating excel");
		

		for (Object[] datatype : datatypes) {
			Row row = sheet.createRow(rowNum++);
			int colNum = 0;
			for (Object field : datatype) {
				Cell cell = row.createCell(colNum++);
				if (field instanceof String) {
					cell.setCellValue((String) field);
				} else if (field instanceof Integer) {
					cell.setCellValue((Integer) field);
				}
			}
		}

		
		  try {
	            FileOutputStream outputStream = new FileOutputStream(filepath);
	            workbook.write(outputStream);
	            workbook.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Done");

	}

}
