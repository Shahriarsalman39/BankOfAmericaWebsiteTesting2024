package dynamicCoding;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjectModel.BaseTest;

public class DynamicLoginTestPractice extends BaseTest {

	
	@BeforeMethod
	public void openBankOfAmerica() {
		openApplication();
		
	}
	
	//Helper Method
	public void loginTest(String Usename, String Password  ) {
		driver.findElement(By.id("onlineId1")).sendKeys("Usename");
		driver.findElement(By.name("passcode1")).sendKeys("Password");
		driver.findElement(By.id("signIn")).click();
		
		
	}
	
	@Test
	public void validUsernameTest() {
		loginTest("Shahriarsalman19", "iOpkl58*@");
		
	}
	
	@Test
	public void InvalidUsernameTest() {
		loginTest("jhyia,", "fks9eij*@");
		
	}
	@Test
	public void validpassTest() {
		loginTest("Shahriarsalman19", "58976*@");
		
	}
	
	@Test
	public void invalidpassTest() {
		loginTest("Ahmed@gmail.com", "iOpkl58*@");
		
	}
	@AfterMethod
	public void closeBankOfAmerica() {
		CloseApplication();
	}
}
