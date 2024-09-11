package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWait {

	WebDriver driver;

	@Test
	public void loginTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.bankofamerica.com/");

		// driver.get()== is fully loaded with pageLoadTimeout(Duration.ofSeconds(10));
		// so u do not have to write

		driver.navigate().to("https://www.bankofamerica.com/");

		// Implicit wait for loading page
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		// if u use driver.navigate().to();
		// make sure to write navigate method
		// because navigate method doesnot wait for page to load

		// Implicit wait for findelement method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[starts-with(@class,'cs-o')]")).sendKeys("salman58@gmail.com");
		driver.findElement(By.xpath("//input[starts-with(@class,'tl-pri')]")).sendKeys("jkYo8@");
		driver.findElement(By.xpath("//button[@id='signIn']")).click();

		// Implicit wait for Scripting
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));

	}
}
