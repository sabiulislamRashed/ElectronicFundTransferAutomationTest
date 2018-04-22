package testcases;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import Pages.AdministrationForceLogoutPage;

//import static org.openqa.selenium.By.name;
//
//import java.util.concurrent.TimeUnit;

@Test
public class TC007VerifyForceLogoutTest {

	WebDriver driverChrome;


	@Test
	public void VerifyForceLogoutTest() {

		AdministrationForceLogoutPage forceLogoutPage = new AdministrationForceLogoutPage(driverChrome);
		forceLogoutPage.userLoginPage();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//import org.openqa.selenium.WebElement;
	//import org.openqa.selenium.chrome.ChromeDriver;

	//
	// import factory.BrowserFactory;
	// import factory.DataProviderFactory;
	// import junit.framework.Assert;

	// import org.openqa.selenium.By;
	// import org.openqa.selenium.By;

	// import org.testng.annotations.BeforeMethod;
	// import org.openqa.selenium.support.ui.FluentWait;
	// import org.openqa.selenium.support.PageFactory;
	// import org.testng.Assert;
	// import org.testng.annotations.AfterMethod;
	// import org.testng.annotations.BeforeMethod;

	// import Pages.HomePage;
	// import factory.BrowserFactory;
	// import factory.DataProviderFactory;
	// import com.thoughtworks.selenium.Wait;
	// import factory.BrowserFactory;
	// import factory.DataProviderFactory;

	// import org.openqa.selenium.WebDriver;
	// import org.openqa.selenium.chrome.ChromeDriver;
	// import org.openqa.selenium.firefox.FirefoxDriver;
	// import org.openqa.selenium.ie.InternetExplorerDriver;
	// import org.openqa.selenium.support.ui.Select;

	// import static org.openqa.selenium.By.className;
	// import static org.openqa.selenium.By.id;

	// driver=BrowserFactory.getBrowser("firefox");
	//
	// driver.get(DataProviderFactory.getConfig().getApplicationUrl());

	// System.setProperty("webdriver.gecko.driver",
	// "geckodriver.exe");
	// driver = new FirefoxDriver();

	//
	// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	// driver = new ChromeDriver();
	// driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
	// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	// driver = new ChromeDriver();

	//
	// System.setProperty("webdriver.gecko.driver","C:\\Users\\Sabiul\\eclipse-workspace\\ElectronicFundTransferNetworkAutomationTest\\geckodriver.exe");
	// driver = new FirefoxDriver();
	// driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
	// driver.manage().window().maximize();
	// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
	// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	// driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
	// driver.findElement(name("j_idt11:j_idt22")).click();
	// driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	// driver.findElement(By.className("rf-pm-gr-lbl")).click();
	// driver.findElement(By.id("navForm:m_menu_112")).click();
	//
	//
	//
	//
	//
	//

	// username
	// driverChrome.findElement(name("j_idt14:j_idt19")).sendKeys("user1000");
	//
	// Select oSelect = new
	// Select(driverChrome.findElement(By.id("j_idt14:payingBranchSelectItem")));
	//
	// oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");
	//
	//
	//
	//
	//
	//
	//
	//
	// //search
	//
	// driverChrome.findElement(name("j_idt14:j_idt23")).click();
	// driverChrome.findElement(name("j_idt14:existingUsersDataTable:0:j_idt30")).click();
	//

	// driver.get(driver.getCurrentUrl());

	// WebElement TxtBoxContent = driver.findElement(By.id("j_idt15:messages:"));
	// TxtBoxContent.getText();
	// Assert.assertEquals("\r\n" +
	// "Welcome", TxtBoxContent);

}

// @Test
// public void testLLogout() {
//// WebDriver driver;
//// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//// driver = new ChromeDriver();
//// driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
// driver.manage().window().maximize();
//
// }}

// import com.thoughtworks.selenium.Wait;

// import factory.BrowserFactory;
// import factory.DataProviderFactory;

// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.ie.InternetExplorerDriver;

// import static org.openqa.selenium.By.className;
// import static org.openqa.selenium.By.id;

// import Pages.HomePage;
// import factory.BrowserFactory;
// import factory.DataProviderFactory;

// public class TC007VerifyForceLogoutTest {
//
// @Test
// public void TC007VerifyForceLogoutTest() {
//
// WebDriver driver;
// // System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
// // driver = new InternetExplorerDriver();
//
//
// System.setProperty("webdriver.gecko.driver",
// "C:\\Users\\Sabiul\\eclipse-workspace\\ElectronicFundTransferNetworkAutomationTest\\geckodriver.exe");
// driver = new FirefoxDriver();
// driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
// driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
// driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
// driver.findElement(name("j_idt11:j_idt22")).click();
// }
// }