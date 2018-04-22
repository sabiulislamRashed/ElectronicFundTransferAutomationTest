package testcases;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import factory.DataProviderFactory;
//import factory.BrowserFactory;
//import factory.DataProviderFactory;
import junit.framework.Assert;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

//import static org.openqa.selenium.By.className;
//import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.name;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

//import Pages.HomePage;
//import factory.BrowserFactory;
//import factory.DataProviderFactory;

@Test
public class TC004VerifyNagativeChangePasswoardTest {

	WebDriver driver;
	//
	// @BeforeMethod
	// public void setUP()
	// {
	// driver=BrowserFactory.getBrowser("Chrome");
	//
	// driver.get(DataProviderFactory.getConfig().getApplicationUrl());

	// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	// driver = new ChromeDriver();
	// driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");

	//
	// *****wait.until(new ExpectedCondition<Boolean>() {
	// public Boolean apply(WebDriver webDriver) {
	// System.out.println("Searching ...");
	// String s = driver.findElement(By.cssSelector("#ContentPrimary ul li[4]
	// span.selector")).getText();
	// System.out.println(s);
	// if (Pattern.compile(Pattern.quote("About"),
	// Pattern.CASE_INSENSITIVE).matcher(s).find()) {
	// return true;
	// } else {
	// return false;
	// }
	// }driver.findElement(By.linkText("About")).click();
	// });

	@Test
	public void testLoginPage() {
		WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	 
		driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
		driver.findElement(name("j_idt11:j_idt22")).click();
		
		
		
//		HomePage home = PageFactory.initElements(driver, HomePage.class);
//
//		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
//
//		login.loginApplication(DataProviderFactory.getExcel().getData(0, 0, 0),
//				DataProviderFactory.getExcel().getData(0, 0, 1));
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("rf-pm-gr-lbl")).click();
		driver.findElement(By.id("navForm:m_menu_57")).click();
		driver.findElement(name("j_idt15:old-password")).sendKeys("test2");
		driver.findElement(name("j_idt15:password-box")).sendKeys("amar sonar bangla ami tomai valobasi");
		driver.findElement(name("j_idt15:confirm-box")).sendKeys("amar sonar bangla ami tomai valobasi");
		driver.findElement(name("j_idt15:j_idt29")).click();

		// WebElement TxtBoxContent = driver.findElement(By.className("rf-msgs-sum"));
		// TxtBoxContent.getText();
		// Assert.assertEquals("Invalid password, Maximum password length is
		// 20",TxtBoxContent);

		String bodyText = driver.findElement(By.className("rf-msgs-sum")).getText();
		Assert.assertTrue("Invalid password, Maximum password length is 20",
				bodyText.contains("Invalid password, Maximum password length is 20"));

	}

}