package pomPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class InvalidLoginTestCase extends BaseTest{

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		
     BaseTest bt = new BaseTest();
	 bt.setUp();
	 
	 Flib flib = new Flib();
	 
	 LoginPage lp = new LoginPage(driver);
	 
	 int rc = flib.getRowCount(EXCEL_PATH, "invalidcreds");
	 
	 for(int i=1; i<=rc; i++)
	 {
		 lp.invalidLoginMethod(flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0), flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1));
	 }
	}

}