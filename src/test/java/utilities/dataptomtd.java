package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataptomtd {
 @DataProvider(name="dp")
 public Object[][] datas() throws IOException
 {
	 String path=".\\testData\\datadriven.xlsx";
			 datadriven_util ddp=new datadriven_util();
	int rows= ddp.getrow(path,"sheet1");
	 int columns=ddp.getcell(path, "sheet1", 1);
	 String logindata[][]=new String[rows][columns];
	 for(int i=1;i<=rows;i++)
	 {
		 for(int j=0;i<columns;j++)
		 {
			 logindata[i-1][j]=ddp.getcelldata(path, "sheet1", 1, j);
		 }
	 }
	 return logindata;
 }
}
