package asposefeatures.workingwithworksheets.addwordartwatermarktoworksheet.java;

import com.aspose.cells.Color;
import com.aspose.cells.MsoFillFormat;
import com.aspose.cells.MsoLineFormat;
import com.aspose.cells.MsoPresetTextEffect;
import com.aspose.cells.Shape;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;

public class AddWatermarkToWorksheet
{
    public static void main(String[] args) throws Exception
    {
	String dataPath = "src/asposefeatures/workingwithworksheets/addwordartwatermarktoworksheet/data/";

	Workbook workbook = new Workbook();

	// Get the first default sheet
	Worksheet sheet = workbook.getWorksheets().get(0);

	// Add Watermark
	Shape wordart = sheet.getShapes().addTextEffect(MsoPresetTextEffect.TEXT_EFFECT_1,
		"CONFIDENTIAL", "Arial Black", 50, false, true, 18, 8, 1, 1, 130, 800);

	// Get the fill format of the word art
	MsoFillFormat wordArtFormat = wordart.getFillFormat();

	// Set the color
	wordArtFormat.setForeColor(Color.getRed());

	// Set the transparency
	wordArtFormat.setTransparency(0.9);

	// Make the line invisible
	MsoLineFormat lineFormat = wordart.getLineFormat();
	lineFormat.setVisible(false);

	// Save the file
	workbook.save(dataPath + "AsposeWatermark_Out.xls");

	System.out.println("Worksheet is watermarked now.");
    }
}
