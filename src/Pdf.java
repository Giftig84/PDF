import com.siebel.data.SiebelPropertySet;
import com.siebel.eai.SiebelBusinessService;
import com.siebel.eai.SiebelBusinessServiceException;
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import java.io.File;
/**
 * Created by DMANUKHIN on 18.11.2017.
 */

public class Pdf extends SiebelBusinessService
{
    public void doInvokeMethod(String methodName, SiebelPropertySet input, SiebelPropertySet output) throws SiebelBusinessServiceException
    {
        String files = input.getProperty("Files");
        String folder = input.getProperty("FS Path");
        String name = input.getProperty("Document Name");
        String[] parts = files.split(";");
        if(parts != null && folder != null && name !=null) {
            try {
                PDFMergerUtility mergePdf = new PDFMergerUtility();
                for (String filePath : parts) {
                    File file = new File(filePath);
                    mergePdf.addSource(file);
                }
                folder += "\\" + name;
                mergePdf.setDestinationFileName(folder);
                mergePdf.mergeDocuments();

            } catch (Exception e) {

            }
        } else {
            throw new SiebelBusinessServiceException("NO_PAR", "Missing paramameters");
        }
    }
}