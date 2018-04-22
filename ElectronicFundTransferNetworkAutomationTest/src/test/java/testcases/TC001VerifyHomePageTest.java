package testcases;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//import Pages.HomePage;
import factory.BrowserFactory;
//import factory.DataProviderFactory;

public class TC001VerifyHomePageTest {

	WebDriver driver;

	@BeforeMethod
	public void setUP() {
		driver = BrowserFactory.getBrowser("Chrome");
		
		// driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	}


}




















// String title=home.getInternetBankingAdminPortalTitle();
// BrowserFactory.closeBrowser(driver);
// Assert.assertTrue(title.contains("http://192.168.1.152:8091/"));

// @AfterMethod
// public void tearDown()
// {
//
// }
