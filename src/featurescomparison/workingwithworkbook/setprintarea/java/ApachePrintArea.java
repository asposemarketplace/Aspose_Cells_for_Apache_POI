package featurescomparison.workingwithworkbook.setprintarea.java;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ApachePrintArea
{
	public static void main(String[] args) throws Exception
	{
		String dataPath = "src/featurescomparison/workingwithworkbook/setprintarea/data/";
		
		Workbook wb = new HSSFWorkbook();
	    Sheet sheet = wb.createSheet("Sheet1");
		//sets the print area for the first sheet
		wb.setPrintArea(0, "$A$1:$F$20");

		//Alternatively:
	    wb.setPrintArea(
	            0, //sheet index
	            0, //start column
	            1, //end column
	            0, //start row
	            0  //end row
	    );

	    FileOutputStream fileOut = new FileOutputStream(dataPath + "ApachePrintArea_Out.xls");
	    wb.write(fileOut);
	    fileOut.close();
	    
	    System.out.println("Print Area Set successfully."); // Print Message
	}
}
