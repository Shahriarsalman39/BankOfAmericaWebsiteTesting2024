package pomWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pf_LoginPage {

	WebDriver driver;

	
	public Pf_LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath="//input[starts-with(@class,'cs-o')]") public WebElement uName;
	@FindBy(xpath="//input[starts-with(@class,'tl-pri')]") public WebElement pasS;
	@FindBy (xpath="//button[contains(@class,'spa-circle-btn-wr')]") public WebElement Log_in;
	@FindBy (xpath="//div[contains(@class,'column small-10')]/nav/ul/li[3]") public WebElement xloop;
	@FindBy(xpath="//div[contains(@class,'column small-10')]/nav/ul/li[5]") public WebElement xloop2;
	
	
	public WebElement username1(String EnterUserName ) {
		uName.sendKeys(EnterUserName);
		return uName;
		
	}
	
	public WebElement password1(String passWord1) {
		pasS.sendKeys(passWord1);
		return pasS;
		
	}
	
	public void lButton1() {
		Log_in.click();
		
	}
	public void hedaingXpath1() {
		xloop.click();
		
	}
	public void headingXpath2() {
		xloop2.click();
	}
	
}
