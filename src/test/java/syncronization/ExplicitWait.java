package syncronization;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	WebDriver driver;
	WebDriverWait wait;

	public ExplicitWait(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[starts-with(@class,'cs-o')]")	public WebElement uName1;
    @FindBy(xpath="//input[starts-with(@class,'tl-pri')]") public WebElement paSS;
    @FindBy(xpath="//*[text()='Log In']") public WebElement Login;
	public WebElement Username1(String enterUsername) {
		wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(uName1));
		uName1.sendKeys(enterUsername);
		return uName1;
		
	}
	
	public WebElement Password1(String enterpassword) {
		wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(paSS));
		paSS.sendKeys(enterpassword);
		return paSS;
		
		
	}
	
	public void lbutton1() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(18));
		wait.until(ExpectedConditions.elementToBeClickable(Login));
		Login.click();
		
	}
	
	

}
