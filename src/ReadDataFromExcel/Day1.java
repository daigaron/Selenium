package ReadDataFromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class Day1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("C:\\Users\\gorak\\OneDrive\\Desktop\\persondetaildemo.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
//		Row r=sh.getRow(0);
//		
//		String str=r.getCell(1).toString();
//		System.out.println(str);
//		ArrayList<String> l=new ArrayList<String>();
//		
//		for(int i=0;i<sh.getPhysicalNumberOfRows();i++) {
//		for(int j=0;j<sh.getRow(i).getPhysicalNumberOfCells();j++) {
//				l.add(sh.getRow(i).getCell(j).toString());
//		//	System.out.println(sh.getRow(i).getCell(j));
//		}
//		
//			
//	}
//		System.out.println(l);
		
		String [] arr= {"abhi","hello"};
		String s=arr.toString();
		System.out.println(s);
		
	}
}
