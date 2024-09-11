package syncronization;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitTest extends BaseTest {

	ExplicitWait ex;
	
	
	@BeforeMethod
	public void openaPP() {
		openApplication();
	}	
	
	
	@Test
	public void Logintest() {
		ex = new ExplicitWait(driver);
		ex.Username1("ShahriarSalman39@gmail.com");
		ex.Password1("On@5#");
		ex.lbutton1();
	
		
		
	}
	
	
	
	
	
	@AfterMethod
	public void closeaPP() {
		CloseApplication();
	}
}
