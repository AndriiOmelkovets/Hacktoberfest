/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocrtest;

/**
 *
 * @author Vlad
 */
import java.io.File;
import net.sourceforge.tess4j.*;

public class OcrTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String BasePathFiles = "";
        File imageFile = new File(BasePathFile+ "370_2017-08-05.pdf");
        ITesseract instance = new Tesseract();  // JNA Interface Mapping
        ITesseract instance1 = new Tesseract1(); // JNA Direct Mapping

        try {
            String result = instance.doOCR(imageFile);
            String result1 = instance1.doOCR(imageFile);
            System.out.println(result);
             System.out.println(result1);
             System.out.println(result.matches("\No\.\d*")); //
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
    
}
