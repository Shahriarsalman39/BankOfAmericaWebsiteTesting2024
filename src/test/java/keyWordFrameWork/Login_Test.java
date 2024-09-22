package keyWordFrameWork;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_Test extends Base_Test{

	Login_page pfpl;
	
	@BeforeMethod
	public void openApp() {
		openApplication();
		
	}
	
	@Test
	public void loginTest() {
	    pfpl = new Login_page(driver);
		//pfpl.username1("salman19");
		pfpl.username2("Salman5879");
		//pfpl.password1("jk5");
		pfpl.password2("2578ui");
		pfpl.lButton1();
	}
	
	@Test
	public void XpathLoop() {
		 pfpl = new Login_page(driver);
		//pfpl.hedaingXpath1();
		pfpl.headingXpath2();
	}
	
	
	@AfterMethod
	public void closeApp() {
		CloseApplication();
		
	}
	
}
