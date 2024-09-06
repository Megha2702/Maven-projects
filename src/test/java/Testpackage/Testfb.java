package Testpackage;

import org.testng.annotations.Test;

import Baseclasspackage.Baseclassfb;
import Pagepackage.Pagefb;
import Utilitypackage.Excelutilities;

public class Testfb extends Baseclassfb{
@Test

public void verifyLogin() throws InterruptedException {
	Pagefb fbpage = new Pagefb(driver);
	
	String xl = "D:\\Software_testing\\datadriven.xlsx";
	String Sheet = "Sheet1";
	
	int row = Excelutilities.getRowCount(xl, Sheet);
	
	for(int i = 1; i <= row; i++) {
		
		String userName = Excelutilities.getCellValue(xl, Sheet, i, 0);
		System.out.println("Username :"+userName);
		
		String password = Excelutilities.getCellValue(xl, Sheet, i, 1);
		System.out.println("Password: "+password);
		
		fbpage.setValues(userName, password);
		fbpage.loginClick();
		Thread.sleep(3000);
	}
}
}
