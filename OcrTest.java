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
        
        File imageFile = new File("370_2017-08-01.pdf");
        ITesseract instance = new Tesseract();  // JNA Interface Mapping
        //ITesseract instance = new Tesseract1(); // JNA Direct Mapping

        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
    
}
