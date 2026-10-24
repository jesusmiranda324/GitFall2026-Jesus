import java.io.FileOutputStream;
import java.io.IOException;
//import com.itextpdf.text series are used to create a PDF report of the deck
//To download the iText library, go to https://itextpdf.com/en/resources/downloads and download the latest version of the library.
//Then, add the iText jar file to your project's build path.
//I will not include the iText jar file in this project
//but you can download it and add it to your project to use the PDF generation functionality.
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.DocumentException;

public class CreateReport {
    void createReport(int deckID) {
        String filePath = "SpireDeck_" + String.valueOf(deckID) + ".pdf";

        // Create a new PDF document(included in the iText library)
        Document document = new Document();

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            // Create a PDF writer instance to write the document
            PdfWriter.getInstance(document, fos);
            document.open();
            document.add(new Paragraph("Slay the Spire Deck Report:"));
            document.add(new Paragraph("Deck ID: " + deckID));
            document.close();

            System.out.println("Report created successfully at: " + filePath);
        } catch (IOException | DocumentException e) {
            System.err.println("Error creating report: " + e.getMessage());
        }
    }
}