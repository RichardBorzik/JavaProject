package sk.tmconsulting.príklady;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PDFMain
{
    public static void main(String[] args)
    {
        Document document = new Document();
        try
        {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
            document.open();

            // novy format nastaveny

            BaseFont baseFont = BaseFont.createFont("resources/fonts/FreeSans.otf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font font = new Font (baseFont, 12, Font.NORMAL);

            document.add(new Paragraph("A Hello World PDF document." , font));
            document.add(new Paragraph("ľščťžôáé", font));
            document.close();
            writer.close();

        } catch (DocumentException | IOException e)
        {
            e.printStackTrace();
        }
    }
}
