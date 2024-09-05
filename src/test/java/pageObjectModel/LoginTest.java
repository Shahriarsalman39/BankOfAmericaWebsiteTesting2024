package pageObjectModel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	
	@BeforeMethod
	public void openBankOfAmerica() {
		openApplication();
		
	}
	
	@Test
	public void validLoginTest() {
		System.out.println("Hellojava");
		LoginPage lp = new LoginPage(driver);
		lp.getText();
		lp.username("Shahrairsalman10");
		lp.password("salman");
		//lp.login();
		lp.forgotpass();
	}
	
	
	@AfterMethod
	public void closeBankOfAmerica() {
		CloseApplication();
	}
}
