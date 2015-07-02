package featurescomparison.workingwithdata.newlineincells.java;

import com.aspose.cells.Cells;
import com.aspose.cells.Style;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;

public class AsposeNewLineinCell
{
	public static void main(String[] args) throws Exception
	{
		String dataPath = "src/featurescomparison/workingwithdata/newlineincells/data/";
		
		//Create Workbook Object
		Workbook wb = new Workbook();

		//Open first Worksheet in the workbook
		Worksheet ws = wb.getWorksheets().get(0);

		//Get Worksheet Cells Collection
		Cells cell = ws.getCells();

		//Increase the width of First Column Width
		cell.setColumnWidth(0, 35);

		//Increase the height of first row
		cell.setRowHeight(0, 65);

		// Add Text to the First Cell with Explicit Line Breaks
		cell.get(0, 0).setValue("I am using \nthe latest version of \nAspose.Cells \nto test this functionality");

		//Get Cell's Style
		Style style = cell.get(0, 0).getStyle();

		//Set Text Wrap property to true
		style.setTextWrapped(true);

		//Set Cell's Style
		cell.get(0, 0).setStyle(style);

		//Save Excel File
		wb.save(dataPath + "Aspose-WrappingText.xls");
		System.out.println("Done...");
	}
}