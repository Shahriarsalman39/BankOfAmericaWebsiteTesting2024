package pomWithPageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import keyWordFrameWork.Test_Reader;

public class Pf_baseTest {

	public WebDriver driver;

	//String Browser = "Chrome";
	Test_Reader tr;
	public void openApplication() {
		tr=new Test_Reader();
		String Browser=tr.readBrowser();
		
		if (Browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();

		}

		else if (Browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();

		}

		else if (Browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();

		}

		else {
			System.out.println("We do not support this browser :");

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String QaeUrl=tr.readurl();
		driver.get(QaeUrl);

	}

	public void CloseApplication() {
		driver.quit();

	}

}
