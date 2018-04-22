package testcases;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import factory.DataProviderFactory;

//import com.thoughtworks.selenium.Wait;

//import factory.BrowserFactory;
//import factory.DataProviderFactory;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

//import static org.openqa.selenium.By.className;
//import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.name;

import java.util.concurrent.TimeUnit;

//import Pages.HomePage;
//import factory.BrowserFactory;
//import factory.DataProviderFactory;

@Test
public class TC005VerifyLogoutTest {

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

	@Test
	public void testLLogout() {
		WebDriver driver;
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
		driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
	driver.findElement(name("j_idt11:j_idt22")).click();
	
//	HomePage home = PageFactory.initElements(driver, HomePage.class);
//
//	LoginPage login = PageFactory.initElements(driver, LoginPage.class);
//
//	login.loginApplication(DataProviderFactory.getExcel().getData(0, 0, 0),
//			DataProviderFactory.getExcel().getData(0, 0, 1));
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.findElement(By.linkText("logout")).click();
	}
}