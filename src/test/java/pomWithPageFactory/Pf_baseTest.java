package pomWithPageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pf_baseTest {

	public WebDriver driver;

	String Browser = "Chrome";

	public void openApplication() {
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
		driver.get("https://www.bankofamerica.com/");

	}

	public void CloseApplication() {
		driver.quit();

	}

}
