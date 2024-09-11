package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjectModel.BaseTest;

public class Xpath extends BaseTest {

	@BeforeMethod
	public void openBankOfAmerica() {
		openApplication();

	}

	@Test
	public void LoginXpath() {
		// driver.findElement(By.xpath("//input[@id='onlineId1']")).sendKeys("salman58@gmail.com");
		driver.findElement(By.xpath("//input[starts-with(@class,'cs-o')]")).sendKeys("salman58@gmail.com");
		// driver.findElement(By.xpath("//input[@name='onlineId1']")).sendKeys("salman58@gmail.com");

		driver.findElement(By.xpath("//input[starts-with(@class,'tl-pri')]")).sendKeys("jkYo8@");
		// driver.findElement(By.xpath("//input[@id='passcode1']")).sendKeys("jkYo8@");

		//driver.findElement(By.xpath("//button[contains(@class,'spa-circle-btn-wr')]")).click();
		 driver.findElement(By.xpath("//*[text()='Log In']")).click();
		// driver.findElement(By.xpath("//button[@id='signIn']")).click();
	}

	@Test
	public void HeadingXpathLoop() {
		 driver.findElement(By.xpath("//div[contains(@class,'column small-10')]/nav/ul/li[3]")).click();
		 driver.findElement(By.xpath("//div[contains(@class,'column small-10')]/nav/ul/li[5]")).click();
		// driver.findElement(By.xpath("//*[text()='Home Loans']")).click();
		// driver.findElement(By.xpath("//*[contains(text(),'Better Money')]")).click();
		// driver.findElement(By.xpath("//a[@id='navSavings']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'spa-circl')]")).sendKeys("salman");
		
		
	}

	@Test
	public void gettextXpath() {
		// String gtX=
		// driver.findElement(By.xpath("//p[contains(@class,'overlay-cont')][2]")).getText();
		// System.out.println(gtX);

		// String gtX1=
		// driver.findElement(By.xpath("//div[contains(@class,'legal-in')]/table/tbody/tr/td[3]")).getText();
		// System.out.println(gtX1);

		// String gtX2=
		// driver.findElement(By.xpath("//div[@class='headlines']/p")).getText();
		// System.out.println(gtX2);

		//String gtX3 = driver.findElement(By.xpath("//div[contains(@class,'carousel-ti')]/a/div/div[3]")).getText();
	//System.out.println(gtX3);

		// String gtX4= driver.findElement(By.xpath("//*[contains(@class,'column large-8')]/p[2]")).getText();
		// System.out.println(gtX4);
		
		
		String gtX4 = driver.findElement(By.xpath("//*[contains(text(),'Travel Rewards')]")).getText();
		System.out.println(gtX4);
		

	}

	@Test
	public void linkXpath() throws InterruptedException {
		// driver.findElement(By.xpath("//div[contains(@class,'main-')]/ul/li[4]")).click();
		// driver.findElement(By.xpath("//a[text()='En español']")).click();
		// driver.findElement(By.xpath("//p[@class='cnx-light']/span")).click();
		// driver.findElement(By.xpath("//a[contains(@id,'yniLifeSer')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Browse with S')]")).click();

		 //driver.findElement(By.xpath("//div[contains(@class,'products-container')]/div/div/span/a")).click();
		
		//driver.findElement(By.xpath("//*[contains(@id,'product3Cta')]/span[2]")).click();
		//WebElement click1 =driver.findElement(By.xpath("//*[contains(@id,'product3Cta')]"));
		//click1.click();

		//WebElement click6 =driver.findElement(By.xpath("//*[contains(text(),'Travel Rewards')]"));
		//click6.click();
		
		//driver.findElement(By.xpath("(//a[contains(text(),'3% cash')])[1]")).click();
		
		//driver.findElement(By.xpath("//div[@class='product'] /div[2] /span //a[contains(text(),'3% cash')]")).click();
		
		
		Thread.sleep(10);
		driver.findElement(By.xpath("(//div[@class='product'] /div[2] /span //a[contains(text(),'3% cash')])[1]")).click();
		
		
	
		
	}

	@AfterMethod
	public void closeBankOfAmerica() {
		CloseApplication();
	}
}
