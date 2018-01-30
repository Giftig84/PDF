/**
 * Created by DMANUKHIN on 18.11.2017.
 */
public class JavaPdf {

    public static void main(String args[]) {

        String files = "C:\\Transfer\\Справка о наличии задолженности с выпиской_ДЕМИН_1-XKNCE5_03.11.2017.PDF;C:\\Transfer\\1811\\Заявление_1100000144.pdf";
        String path = "C:\\testPDF";
        String Name = "Merged.pdf";
        String[] parts = files.split(";");
        String folder = "C:\\testPDF";

        try {
           /* PDFMergerUtility mergePdf = new PDFMergerUtility();
            for (String filePath : parts) {
                File file = new File(filePath);
                mergePdf.addSource(file);
            }
            folder += "\\"+Name;
            mergePdf.setDestinationFileName(folder);
            mergePdf.mergeDocuments();*/

        } catch (Exception e) {

        }

    }
}
