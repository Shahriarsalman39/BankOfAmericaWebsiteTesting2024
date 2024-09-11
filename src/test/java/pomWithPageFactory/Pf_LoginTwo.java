package pomWithPageFactory;

import org.openqa.selenium.WebDriver;

public class Pf_LoginTwo  {

	WebDriver driver;

	public Pf_LoginTwo(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
	
	

public void userNameThree() {
	Pf_LoginPage lp=new Pf_LoginPage(driver);
	lp.uName.sendKeys("Salman");
	
	
}
}
