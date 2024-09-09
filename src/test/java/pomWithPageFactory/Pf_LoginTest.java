package pomWithPageFactory;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pf_LoginTest extends Pf_baseTest{

	Pf_LoginPage pfpl;
	
	@BeforeMethod
	public void openApp() {
		openApplication();
		
	}
	
	@Test
	public void loginTest() {
	    pfpl = new Pf_LoginPage(driver);
		pfpl.username1("salman19");
		pfpl.password1("jk5");
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
