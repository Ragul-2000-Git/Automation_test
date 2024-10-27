package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class datadriven_util {
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public  int getrow(String path,String sname) throws IOException
	{
		fi=new FileInputStream(path);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(sname);
	int b=sh.getLastRowNum();
		return b;
	}
	public  int getcell(String path,String sname,int a) throws IOException
	{
		fi=new FileInputStream(path);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(sname);
	row=sh.getRow(a);
	int cc=row.getLastCellNum();
	return cc;
	}
	public  String getcelldata(String path,String sname,int a,int c) throws IOException
	{
		fi=new FileInputStream(path);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(sname);
	row=sh.getRow(a);
 cell= row.getCell(c);
 String yes=cell.toString();
 return yes;
	}
	
}
