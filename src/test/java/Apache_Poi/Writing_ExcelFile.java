package Apache_Poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_ExcelFile {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\Test_data\\Excel.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet();
        
        Scanner sc=new Scanner(System.in);
        for(int r=0;r<=3;r++) {
        	XSSFRow currentRow=sheet.createRow(r);
        	
        	for(int c=0;c<2;c++){
        	System.out.println("Enter value:");	
        	String value=sc.next();
        	currentRow.createCell(c).setCellValue(value);
        	}
        }
       workbook.write(file);
       workbook.close();
       file.close();
       System.out.println("Writing is done!!");
	}

}
