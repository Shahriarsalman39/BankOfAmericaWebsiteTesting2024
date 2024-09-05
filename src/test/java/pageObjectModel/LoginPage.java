package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {

	public WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}



	public WebElement username(String UName ) {
		WebElement userName1  =driver.findElement(By.id("onlineId1"));
		userName1.sendKeys(UName);
		return userName1;
	}
	
	
	
	public WebElement password(String passw) {
		WebElement passWord2= driver.findElement(By.name("passcode1"));
		passWord2.sendKeys(passw);
		return passWord2;
		
		
	}
	
	public void login() {
		WebElement login2= driver.findElement(By.id("signIn"));
		login2.click();
		
	}
	
	public void forgotpass() {
		driver.findElement(By.xpath("//a[@id='forgot-oid-pwd']")).click();
		
	}
	
	public String getText() {
		String gettext1= driver.findElement(By.xpath("//div[contains(@class,'overlay-')]/p[2]")).getText();
		System.out.println(gettext1);
		String ExpectedText = "Watch your security meter rise as you take action against fraud. See it in the Security Center in Mobile and Online Banking.";
	String actualTest = gettext1;
	Assert.assertEquals(ExpectedText, actualTest);
	return gettext1;
	}
}
