package testcases;

//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import factory.BrowserFactory;
import factory.DataProviderFactory;

//import Pages.HomePage;
//import factory.BrowserFactory;
//import factory.DataProviderFactory;

@Test
public class TC002VerifyLoginPageTest {

	WebDriver driver;

	@BeforeMethod
	public void setUP() {
		driver = BrowserFactory.getBrowser("Chrome");

		// driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	}

	@Test
	public void testLoginPage() {

		HomePage home = PageFactory.initElements(driver, HomePage.class);

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		login.loginApplication(DataProviderFactory.getExcel().getData(0, 0, 0),
				DataProviderFactory.getExcel().getData(0, 0, 1));

	}

	// @AfterMethod
	// public void tearDown()
	// {
	// BrowserFactory.closeBrowser(driver);
	// }

}

//

//
// @Test
// public void testLoginPage() {
// WebDriver driver;
//
//// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//// driver = new ChromeDriver();
////
//// driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
// driver.manage().window().maximize();
// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
// driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
// driver.findElement(name("j_idt11:j_idt22")).click();
//
//
// }
//
//

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
