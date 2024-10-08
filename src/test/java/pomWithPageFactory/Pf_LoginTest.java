package pomWithPageFactory;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import keyWordFrameWork.Test_Reader;

public class Pf_LoginTest extends Pf_baseTest{

	Pf_LoginPage pfpl;
	Test_Reader tr;
	
	@BeforeMethod
	public void openApp() {
		openApplication();
		
	}
	
	@Test
	public void loginTest() {
	    pfpl = new Pf_LoginPage(driver);
	    tr=new Test_Reader();
	    pfpl.username2(tr.readUsername());
	    pfpl.password2(tr.readPassword());
		//pfpl.username1("salman19");
		//pfpl.username2("Salman5879");
		//pfpl.password1("jk5");
		//pfpl.password2("2578ui");
		pfpl.lButton1();
	}
	
	@Test
	public void XpathLoop() {
		 pfpl = new Pf_LoginPage(driver);
		//pfpl.hedaingXpath1();
		pfpl.headingXpath2();
	}
	
	
	@AfterMethod
	public void closeApp() {
		CloseApplication();
		
	}
	
}
