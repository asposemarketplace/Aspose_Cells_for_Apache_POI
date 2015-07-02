package asposefeatures.workingwithcharts.addwordartwatermarktochart.java;

import com.aspose.cells.MsoPresetTextEffect;
import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;

public class AddWordArtWatermarkToChart
{
    public static void main(String[] args) throws Exception
    {
	String dataPath = "src/asposefeatures/workingwithcharts/addwordartwatermarktochart/data/";

	// Instantiate a new workbook.
	// Open the existing excel file.
	Workbook workbook = new Workbook(dataPath + "AsposeChart.xls");

	// Get the chart in the first worksheet.
	com.aspose.cells.Chart chart = workbook.getWorksheets().get(0).getCharts().get(0);

	// Add a WordArt watermark (shape) to the chart's plot area.
	com.aspose.cells.Shape wordart = chart.getShapes().addTextEffectInChart(
		MsoPresetTextEffect.TEXT_EFFECT_2, "CONFIDENTIAL", "Arial Black", 66, false, false,
		1200, 500, 2000, 3000);

	// Get the shape's fill format.
	com.aspose.cells.MsoFillFormat wordArtFormat = wordart.getFillFormat();

	// Set the transparency.
	wordArtFormat.setTransparency(0.9);

	// Get the line format and make it invisible.
	com.aspose.cells.MsoLineFormat lineFormat = wordart.getLineFormat();
	lineFormat.setVisible(false);

	// Save the excel file.
	workbook.save(dataPath + "AsposeChartWatermarked_Out.xls", SaveFormat.EXCEL_97_TO_2003);

	System.out.println("Chart is watermarked now.");
    }
}
