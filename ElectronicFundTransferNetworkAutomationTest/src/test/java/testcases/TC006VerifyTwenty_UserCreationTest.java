
package testcases;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import factory.BrowserFactory;
//import factory.DataProviderFactory;
//import junit.framework.Assert;

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
public class TC006VerifyTwenty_UserCreationTest {

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
	public void OneUserCreationTest() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
		driver.manage().window().maximize();
		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
		driver.findElement(name("j_idt11:j_idt22")).click();

		// user 1 creation
		// Username :
	
		
		
		
		driver.findElement(By.className("rf-pm-gr-lbl")).click();

		driver.findElement(By.id("navForm:m_menu_53")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("testForm:usernameid")).sendKeys("user201");
		// Password :
		driver.findElement(By.id("testForm:password")).sendKeys("1");
		// //Confirm Password : :
		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
		// name : :
		driver.findElement(By.id("testForm:name")).sendKeys("user1");
		// Paying Branch:

		Select oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));

		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");

		// Employee Id
		driver.findElement(By.id("testForm:employeeId")).sendKeys("1");
		// Designation
		driver.findElement(By.id("testForm:designation")).sendKeys("Designation");
		// Phone Number :
		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");

		// Roles

		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
		// save
		driver.findElement(name("testForm:j_idt47")).click();
		driver.findElement(By.linkText("logout")).click();

		
		
		
		
		//2nd
		
		
		
        driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
		driver.findElement(name("j_idt11:j_idt22")).click();

		// user 1 creation
		// Username :
		driver.findElement(By.className("rf-pm-gr-lbl")).click();

		driver.findElement(By.id("navForm:m_menu_53")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("testForm:usernameid")).sendKeys("user202");
		// Password :
		driver.findElement(By.id("testForm:password")).sendKeys("1");
		// //Confirm Password : :
		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
		// name : :
		driver.findElement(By.id("testForm:name")).sendKeys("user1");
		// Paying Branch:

		 oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));

		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");

		// Employee Id
		driver.findElement(By.id("testForm:employeeId")).sendKeys("1");
		// Designation
		driver.findElement(By.id("testForm:designation")).sendKeys("Designation");
		// Phone Number :
		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");

		// Roles

		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
		// save
		driver.findElement(name("testForm:j_idt47")).click();
		driver.findElement(By.linkText("logout")).click();
		
		
		
		
		
		//3rd
		
		
		
		
		
		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
		driver.findElement(name("j_idt11:j_idt22")).click();

		// user 1 creation
		// Username :
		driver.findElement(By.className("rf-pm-gr-lbl")).click();

		driver.findElement(By.id("navForm:m_menu_53")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("testForm:usernameid")).sendKeys("user203");
		// Password :
		driver.findElement(By.id("testForm:password")).sendKeys("1");
		// //Confirm Password : :
		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
		// name : :
		driver.findElement(By.id("testForm:name")).sendKeys("user1");
		// Paying Branch:

		 oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));

		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");

		// Employee Id
		driver.findElement(By.id("testForm:employeeId")).sendKeys("1");
		// Designation
		driver.findElement(By.id("testForm:designation")).sendKeys("Designation");
		// Phone Number :
		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");

		// Roles

		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
		// save
		driver.findElement(name("testForm:j_idt47")).click();
		driver.findElement(By.linkText("logout")).click();
		
		
		//4th
		
		
		
		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
		driver.findElement(name("j_idt11:j_idt22")).click();

		// user 1 creationR
		// Username :
		driver.findElement(By.className("rf-pm-gr-lbl")).click();

		driver.findElement(By.id("navForm:m_menu_53")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("testForm:usernameid")).sendKeys("user204");
		// Password :
		driver.findElement(By.id("testForm:password")).sendKeys("1");
		// //Confirm Password : :
		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
		// name : :
		driver.findElement(By.id("testForm:name")).sendKeys("user1");
		// Paying Branch:

		 oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));

		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");

		// Employee Id
		driver.findElement(By.id("testForm:employeeId")).sendKeys("1");
		// Designation
		driver.findElement(By.id("testForm:designation")).sendKeys("Designation");
		// Phone Number :
		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");

		// Roles

		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
		// save
		driver.findElement(name("testForm:j_idt47")).click();
		driver.findElement(By.linkText("logout")).click();
		
		
		
		
		
		//5th
		
		
		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
		driver.findElement(name("j_idt11:j_idt22")).click();

		// user 1 creation
		// Username :
		driver.findElement(By.className("rf-pm-gr-lbl")).click();

		driver.findElement(By.id("navForm:m_menu_53")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("testForm:usernameid")).sendKeys("user205");
		// Password :
		driver.findElement(By.id("testForm:password")).sendKeys("1");
		// //Confirm Password : :
		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
		// name : :
		driver.findElement(By.id("testForm:name")).sendKeys("user1");
		// Paying Branch:

		 oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));

		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");

		// Employee Id
		driver.findElement(By.id("testForm:employeeId")).sendKeys("1");
		// Designation
		driver.findElement(By.id("testForm:designation")).sendKeys("Designation");
		// Phone Number :
		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");

		// Roles

		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
		// save
		driver.findElement(name("testForm:j_idt47")).click();
		driver.findElement(By.linkText("logout")).click();
		
		
		
		
		
		
		
		//6th
		
		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
		driver.findElement(name("j_idt11:j_idt22")).click();

		// user 1 creation
		// Username :
		driver.findElement(By.className("rf-pm-gr-lbl")).click();

		driver.findElement(By.id("navForm:m_menu_53")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("testForm:usernameid")).sendKeys("user206");
		// Password :
		driver.findElement(By.id("testForm:password")).sendKeys("1");
		// //Confirm Password : :
		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
		// name : :
		driver.findElement(By.id("testForm:name")).sendKeys("user1");
		// Paying Branch:

		 oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));

		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");

		// Employee Id
		driver.findElement(By.id("testForm:employeeId")).sendKeys("1");
		// Designation
		driver.findElement(By.id("testForm:designation")).sendKeys("Designation");
		// Phone Number :
		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");

		// Roles

		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
		// save
		driver.findElement(name("testForm:j_idt47")).click();
		driver.findElement(By.linkText("logout")).click();

		
		
		//7th
		
		
		
		
		//
		
		
		
		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
		driver.findElement(name("j_idt11:j_idt22")).click();

		// user 1 creation
		// Username :
		driver.findElement(By.className("rf-pm-gr-lbl")).click();

		driver.findElement(By.id("navForm:m_menu_53")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("testForm:usernameid")).sendKeys("user207");
		// Password :
		driver.findElement(By.id("testForm:password")).sendKeys("1");
		// //Confirm Password : :
		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
		// name : :
		driver.findElement(By.id("testForm:name")).sendKeys("user1");
		// Paying Branch:

		 oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));

		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");

		// Employee Id
		driver.findElement(By.id("testForm:employeeId")).sendKeys("1");
		// Designation
		driver.findElement(By.id("testForm:designation")).sendKeys("Designation");
		// Phone Number :
		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");

		// Roles

		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
		// save
		driver.findElement(name("testForm:j_idt47")).click();
		driver.findElement(By.linkText("logout")).click();
		
		
		
		
		
		//8th
		
		
		
		
		
		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
		driver.findElement(name("j_idt11:j_idt22")).click();

		// user 1 creation
		// Username :
		driver.findElement(By.className("rf-pm-gr-lbl")).click();

		driver.findElement(By.id("navForm:m_menu_53")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("testForm:usernameid")).sendKeys("user208");
		// Password :
		driver.findElement(By.id("testForm:password")).sendKeys("1");
		// //Confirm Password : :
		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
		// name : :
		driver.findElement(By.id("testForm:name")).sendKeys("user1");
		// Paying Branch:

		 oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));

		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");

		// Employee Id
		driver.findElement(By.id("testForm:employeeId")).sendKeys("1");
		// Designation
		driver.findElement(By.id("testForm:designation")).sendKeys("Designation");
		// Phone Number :
		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");

		// Roles

		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
		// save
		driver.findElement(name("testForm:j_idt47")).click();
		driver.findElement(By.linkText("logout")).click();
		
		
		//9th
		
		
		
		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
		driver.findElement(name("j_idt11:j_idt22")).click();

		// user 1 creation
		// Username :
		driver.findElement(By.className("rf-pm-gr-lbl")).click();

		driver.findElement(By.id("navForm:m_menu_53")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("testForm:usernameid")).sendKeys("user209");
		// Password :
		driver.findElement(By.id("testForm:password")).sendKeys("1");
		// //Confirm Password : :
		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
		// name : :
		driver.findElement(By.id("testForm:name")).sendKeys("user1");
		// Paying Branch:

		 oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));

		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");

		// Employee Id
		driver.findElement(By.id("testForm:employeeId")).sendKeys("1");
		// Designation
		driver.findElement(By.id("testForm:designation")).sendKeys("Designation");
		// Phone Number :
		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");

		// Roles

		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
		// save
		driver.findElement(name("testForm:j_idt47")).click();
		driver.findElement(By.linkText("logout")).click();
		
		
		
		
		
		//10th
		
		
		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
		driver.findElement(name("j_idt11:j_idt22")).click();

		// user 1 creation
		// Username :
		driver.findElement(By.className("rf-pm-gr-lbl")).click();

		driver.findElement(By.id("navForm:m_menu_53")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("testForm:usernameid")).sendKeys("user210");
		// Password :
		driver.findElement(By.id("testForm:password")).sendKeys("1");
		// //Confirm Password : :
		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
		// name : :
		driver.findElement(By.id("testForm:name")).sendKeys("user1");
		// Paying Branch:

		 oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));

		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");

		// Employee Id
		driver.findElement(By.id("testForm:employeeId")).sendKeys("1");
		// Designation
		driver.findElement(By.id("testForm:designation")).sendKeys("Designation");
		// Phone Number :
		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");

		// Roles

		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
		// save
		driver.findElement(name("testForm:j_idt47")).click();
		driver.findElement(By.linkText("logout")).click();
		
		
		//11th
		
		
		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
		driver.findElement(name("j_idt11:j_idt22")).click();

		// user 1 creation
		// Username :
		driver.findElement(By.className("rf-pm-gr-lbl")).click();

		driver.findElement(By.id("navForm:m_menu_53")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("testForm:usernameid")).sendKeys("user211");
		// Password :
		driver.findElement(By.id("testForm:password")).sendKeys("1");
		// //Confirm Password : :
		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
		// name : :
		driver.findElement(By.id("testForm:name")).sendKeys("user1");
		// Paying Branch:

		 oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));

		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");

		// Employee Id
		driver.findElement(By.id("testForm:employeeId")).sendKeys("1");
		// Designation
		driver.findElement(By.id("testForm:designation")).sendKeys("Designation");
		// Phone Number :
		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");

		// Roles

		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
		// save
		driver.findElement(name("testForm:j_idt47")).click();
		driver.findElement(By.linkText("logout")).click();

		
		//12th
		
		
		
		
		
		//1
		
		
		
		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
		driver.findElement(name("j_idt11:j_idt22")).click();

		// user 1 creation
		// Username :
		driver.findElement(By.className("rf-pm-gr-lbl")).click();

		driver.findElement(By.id("navForm:m_menu_53")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("testForm:usernameid")).sendKeys("user112");
		// Password :
		driver.findElement(By.id("testForm:password")).sendKeys("1");
		// //Confirm Password : :
		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
		// name : :
		driver.findElement(By.id("testForm:name")).sendKeys("user1");
		// Paying Branch:

		 oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));

		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");

		// Employee Id
		driver.findElement(By.id("testForm:employeeId")).sendKeys("1");
		// Designation
		driver.findElement(By.id("testForm:designation")).sendKeys("Designation");
		// Phone Number :
		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");

		// Roles

		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
		// save
		driver.findElement(name("testForm:j_idt47")).click();
		driver.findElement(By.linkText("logout")).click();
		
		
		
		
		
		//13th
		
		
		
		
		
		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
		driver.findElement(name("j_idt11:j_idt22")).click();

		// user 1 creation
		// Username :
		driver.findElement(By.className("rf-pm-gr-lbl")).click();

		driver.findElement(By.id("navForm:m_menu_53")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("testForm:usernameid")).sendKeys("user113");
		// Password :
		driver.findElement(By.id("testForm:password")).sendKeys("1");
		// //Confirm Password : :
		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
		// name : :
		driver.findElement(By.id("testForm:name")).sendKeys("user1");
		// Paying Branch:

		 oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));

		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");

		// Employee Id
		driver.findElement(By.id("testForm:employeeId")).sendKeys("1");
		// Designation
		driver.findElement(By.id("testForm:designation")).sendKeys("Designation");
		// Phone Number :
		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");

		// Roles

		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
		// save
		driver.findElement(name("testForm:j_idt47")).click();
		driver.findElement(By.linkText("logout")).click();
		
		
		//14th
		
		
		
		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
		driver.findElement(name("j_idt11:j_idt22")).click();

		// user 1 creation
		// Username :
		driver.findElement(By.className("rf-pm-gr-lbl")).click();

		driver.findElement(By.id("navForm:m_menu_53")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("testForm:usernameid")).sendKeys("user114");
		// Password :
		driver.findElement(By.id("testForm:password")).sendKeys("1");
		// //Confirm Password : :
		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
		// name : :
		driver.findElement(By.id("testForm:name")).sendKeys("user1");
		// Paying Branch:

		 oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));

		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");

		// Employee Id
		driver.findElement(By.id("testForm:employeeId")).sendKeys("1");
		// Designation
		driver.findElement(By.id("testForm:designation")).sendKeys("Designation");
		// Phone Number :
		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");

		// Roles

		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
		// save
		driver.findElement(name("testForm:j_idt47")).click();
		driver.findElement(By.linkText("logout")).click();
		
		
		
		
		
		//15th
		
		
		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
		driver.findElement(name("j_idt11:j_idt22")).click();

		// user 1 creation
		// Username :
		driver.findElement(By.className("rf-pm-gr-lbl")).click();

		driver.findElement(By.id("navForm:m_menu_53")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("testForm:usernameid")).sendKeys("user115");
		// Password :
		driver.findElement(By.id("testForm:password")).sendKeys("1");
		// //Confirm Password : :
		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
		// name : :
		driver.findElement(By.id("testForm:name")).sendKeys("user1");
		// Paying Branch:

		 oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));

		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");

		// Employee Id
		driver.findElement(By.id("testForm:employeeId")).sendKeys("1");
		// Designation
		driver.findElement(By.id("testForm:designation")).sendKeys("Designation");
		// Phone Number :
		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");

		// Roles

		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
		// save
		driver.findElement(name("testForm:j_idt47")).click();
		driver.findElement(By.linkText("logout")).click();
		
		
		
		//15th
		
		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
		driver.findElement(name("j_idt11:j_idt22")).click();

		// user 1 creation
		// Username :
		driver.findElement(By.className("rf-pm-gr-lbl")).click();

		driver.findElement(By.id("navForm:m_menu_53")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("testForm:usernameid")).sendKeys("user115");
		// Password :
		driver.findElement(By.id("testForm:password")).sendKeys("1");
		// //Confirm Password : :
		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
		// name : :
		driver.findElement(By.id("testForm:name")).sendKeys("user1");
		// Paying Branch:

		 oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));

		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");

		// Employee Id
		driver.findElement(By.id("testForm:employeeId")).sendKeys("1");
		// Designation
		driver.findElement(By.id("testForm:designation")).sendKeys("Designation");
		// Phone Number :
		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");

		// Roles

		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
		// save
		driver.findElement(name("testForm:j_idt47")).click();
		driver.findElement(By.linkText("logout")).click();

		
		
		
		//16th
		
		
		
		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
		driver.findElement(name("j_idt11:j_idt22")).click();

		// user 1 creation
		// Username :
		driver.findElement(By.className("rf-pm-gr-lbl")).click();

		driver.findElement(By.id("navForm:m_menu_53")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("testForm:usernameid")).sendKeys("user116");
		// Password :
		driver.findElement(By.id("testForm:password")).sendKeys("1");
		// //Confirm Password : :
		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
		// name : :
		driver.findElement(By.id("testForm:name")).sendKeys("user1");
		// Paying Branch:

		 oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));

		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");

		// Employee Id
		driver.findElement(By.id("testForm:employeeId")).sendKeys("1");
		// Designation
		driver.findElement(By.id("testForm:designation")).sendKeys("Designation");
		// Phone Number :
		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");

		// Roles

		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
		// save
		driver.findElement(name("testForm:j_idt47")).click();
		driver.findElement(By.linkText("logout")).click();
		
		
		
		
		
		//17th
		
		
		
		
		
		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
		driver.findElement(name("j_idt11:j_idt22")).click();

		// user 1 creation
		// Username :
		driver.findElement(By.className("rf-pm-gr-lbl")).click();

		driver.findElement(By.id("navForm:m_menu_53")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("testForm:usernameid")).sendKeys("user117");
		// Password :
		driver.findElement(By.id("testForm:password")).sendKeys("1");
		// //Confirm Password : :
		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
		// name : :
		driver.findElement(By.id("testForm:name")).sendKeys("user1");
		// Paying Branch:

		 oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));

		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");

		// Employee Id
		driver.findElement(By.id("testForm:employeeId")).sendKeys("1");
		// Designation
		driver.findElement(By.id("testForm:designation")).sendKeys("Designation");
		// Phone Number :
		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");

		// Roles

		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
		// save
		driver.findElement(name("testForm:j_idt47")).click();
		driver.findElement(By.linkText("logout")).click();
		
		
		//18th
		
		
		
		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
		driver.findElement(name("j_idt11:j_idt22")).click();

		// user 1 creation
		// Username :
		driver.findElement(By.className("rf-pm-gr-lbl")).click();

		driver.findElement(By.id("navForm:m_menu_53")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("testForm:usernameid")).sendKeys("user118");
		// Password :
		driver.findElement(By.id("testForm:password")).sendKeys("1");
		// //Confirm Password : :
		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
		// name : :
		driver.findElement(By.id("testForm:name")).sendKeys("user1");
		// Paying Branch:

		 oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));

		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");

		// Employee Id
		driver.findElement(By.id("testForm:employeeId")).sendKeys("1");
		// Designation
		driver.findElement(By.id("testForm:designation")).sendKeys("Designation");
		// Phone Number :
		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");

		// Roles

		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
		// save
		driver.findElement(name("testForm:j_idt47")).click();
		driver.findElement(By.linkText("logout")).click();
		
		
		
		
		
		//19th
		
		
		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
		driver.findElement(name("j_idt11:j_idt22")).click();

		// user 1 creation
		// Username :
		driver.findElement(By.className("rf-pm-gr-lbl")).click();

		driver.findElement(By.id("navForm:m_menu_53")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("testForm:usernameid")).sendKeys("user119");
		// Password :
		driver.findElement(By.id("testForm:password")).sendKeys("1");
		// //Confirm Password : :
		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
		// name : :
		driver.findElement(By.id("testForm:name")).sendKeys("user1");
		// Paying Branch:

		 oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));

		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");

		// Employee Id
		driver.findElement(By.id("testForm:employeeId")).sendKeys("1");
		// Designation
		driver.findElement(By.id("testForm:designation")).sendKeys("Designation");
		// Phone Number :
		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");

		// Roles

		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
		// save
		driver.findElement(name("testForm:j_idt47")).click();
		driver.findElement(By.linkText("logout")).click();
		
		
		
		//20th
		
		
		
		
		
		
				driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
				driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
				driver.findElement(name("j_idt11:j_idt22")).click();

				// user 1 creation
				// Username :
				driver.findElement(By.className("rf-pm-gr-lbl")).click();

				driver.findElement(By.id("navForm:m_menu_53")).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				driver.findElement(By.id("testForm:usernameid")).sendKeys("user120");
				// Password :
				driver.findElement(By.id("testForm:password")).sendKeys("1");
				// //Confirm Password : :
				driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
				// name : :
				driver.findElement(By.id("testForm:name")).sendKeys("user1");
				// Paying Branch:

				 oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));

				oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");

				// Employee Id
				driver.findElement(By.id("testForm:employeeId")).sendKeys("1");
				// Designation
				driver.findElement(By.id("testForm:designation")).sendKeys("Designation");
				// Phone Number :
				driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");

				// Roles

				driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
				// save
				driver.findElement(name("testForm:j_idt47")).click();
				driver.findElement(By.linkText("logout")).click();
				
				
		
		
		
		

		// driver.findElement(By.linkText("logout")).click();

		// @FindBy(id = "//*[@name='j_idt11:j_idt22']")
		// WebElement submitButton;

		// WebElement TxtBoxContent = driver.findElement(By.id("j_idt15:messages:"));
		// TxtBoxContent.getText();
		// Assert.assertEquals("Password changed successfully.", TxtBoxContent);
		// old_value = browser.find_element_by_id('my-id').text
		// browser.find_element_by_link_text('my link').click()
		// new_value = browser.find_element_by_id('my-id').text
		// assert new_value != old_value ## fails unexpectedly

	}

	// driver.findElement(By.linkText("logout")).click();
	//
	// @FindBy(id = "//*[@name='j_idt11:j_idt22']")
	// WebElement submitButton;
	//
	// WebElement TxtBoxContent = driver.findElement(By.id("j_idt15:messages:"));
	// TxtBoxContent.getText();
	// Assert.assertEquals("Password changed successfully.", TxtBoxContent);
	// old_value = browser.find_element_by_id('my-id').text
	// browser.find_element_by_link_text('my link').click()
	// new_value = browser.find_element_by_id('my-id').text
	// assert new_value != old_value ## fails unexpectedly

//	@Test
//	public void TwoUserCreationTest() {
//		WebDriver driver;
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
//		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
//		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
//		driver.findElement(name("j_idt11:j_idt22")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.className("rf-pm-gr-lbl")).click();
//		driver.findElement(By.id("navForm:m_menu_57")).click();
////		driver.findElement(By.id("navForm:m_menu_53")).click();
//
//		// user 1 creation
//		// Username :
//		driver.findElement(By.id("testForm:usernameid")).sendKeys("use22");
//		// Password :
//		driver.findElement(By.id("testForm:password")).sendKeys("1");
//		// //Confirm Password : :
//		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
//		// name : :
//		driver.findElement(By.id("testForm:name")).sendKeys("use2");
//		// Paying Branch:
//
//		Select oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));
//
//		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");
//
//		// Employee Id
//		driver.findElement(By.id("testForm:employeeId")).sendKeys("2");
//		// Designation
//		driver.findElement(By.id("testForm:designation")).sendKeys("use1");
//		// Phone Number :
//		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");
//
//		// Roles
//
//		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
//		// save
//		driver.findElement(name("testForm:j_idt47")).click();
//
//		driver.findElement(By.linkText("logout")).click();
//
//		// @FindBy(id = "//*[@name='j_idt11:j_idt22']")
//		// WebElement submitButton;
//
//		// WebElement TxtBoxContent = driver.findElement(By.id("j_idt15:messages:"));
//		// TxtBoxContent.getText();
//		// Assert.assertEquals("Password changed successfully.", TxtBoxContent);
//		// old_value = browser.find_element_by_id('my-id').text
//		// browser.find_element_by_link_text('my link').click()
//		// new_value = browser.find_element_by_id('my-id').text
//		// assert new_value != old_value ## fails unexpectedly
//
//	}
//
//	@Test
//	public void ThreeUserCreationTest() {
//		// WebDriver driver;
//		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver = new ChromeDriver();
//		// driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
//		// driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
//		// driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
//		// driver.findElement(name("j_idt11:j_idt22")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.className("rf-pm-gr-lbl")).click();
//		driver.findElement(By.id("navForm:m_menu_57")).click();
//		driver.findElement(By.id("navForm:m_menu_53")).click();
//
//		// user 1 creation
//		// Username :
//		driver.findElement(By.id("testForm:usernameid")).sendKeys("use23");
//		// Password :
//		driver.findElement(By.id("testForm:password")).sendKeys("1");
//		// //Confirm Password : :
//		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
//		// name : :
//		driver.findElement(By.id("testForm:name")).sendKeys("use3");
//		// Paying Branch:
//
//		Select oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));
//
//		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");
//
//		// Employee Id
//		driver.findElement(By.id("testForm:employeeId")).sendKeys("3");
//		// Designation
//		driver.findElement(By.id("testForm:designation")).sendKeys("use1");
//		// Phone Number :
//		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");
//
//		// Roles
//
//		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
//		// save
//		driver.findElement(name("testForm:j_idt47")).click();
//		driver.findElement(By.linkText("logout")).click();
//
//
//		// @FindBy(id = "//*[@name='j_idt11:j_idt22']")
//		// WebElement submitButton;
//
//		// WebElement TxtBoxContent = driver.findElement(By.id("j_idt15:messages:"));
//		// TxtBoxContent.getText();
//		// Assert.assertEquals("Password changed successfully.", TxtBoxContent);
//		// old_value = browser.find_element_by_id('my-id').text
//		// browser.find_element_by_link_text('my link').click()
//		// new_value = browser.find_element_by_id('my-id').text
//		// assert new_value != old_value ## fails unexpectedly
//
//	}
//
//	@Test
//	public void FoureUserCreationTest() {
//		WebDriver driver;
//		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver = new ChromeDriver();
//		// driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
//		// driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
//		// driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
//		// driver.findElement(name("j_idt11:j_idt22")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.className("rf-pm-gr-lbl")).click();
//		driver.findElement(By.id("navForm:m_menu_57")).click();
//		driver.findElement(By.id("navForm:m_menu_53")).click();
//
//		// user 1 creation
//		// Username :
//		driver.findElement(By.id("testForm:usernameid")).sendKeys("use24");
//		// Password :
//		driver.findElement(By.id("testForm:password")).sendKeys("1");
//		// //Confirm Password : :
//		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
//		// name : :
//		driver.findElement(By.id("testForm:name")).sendKeys("use4");
//		// Paying Branch:
//
//		Select oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));
//
//		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");
//
//		// Employee Id
//		driver.findElement(By.id("testForm:employeeId")).sendKeys("1");
//		// Designation
//		driver.findElement(By.id("testForm:designation")).sendKeys("use1");
//		// Phone Number :
//		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");
//
//		// Roles
//
//		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
//		// save
//		driver.findElement(name("testForm:j_idt47")).click();
//		driver.findElement(By.linkText("logout")).click();
//
//
//		// @FindBy(id = "//*[@name='j_idt11:j_idt22']")
//		// WebElement submitButton;
//
//		// WebElement TxtBoxContent = driver.findElement(By.id("j_idt15:messages:"));
//		// TxtBoxContent.getText();
//		// Assert.assertEquals("Password changed successfully.", TxtBoxContent);
//		// old_value = browser.find_element_by_id('my-id').text
//		// browser.find_element_by_link_text('my link').click()
//		// new_value = browser.find_element_by_id('my-id').text
//		// assert new_value != old_value ## fails unexpectedly
//
//	}
//
//	//
//	@Test
//	public void FiveUserCreationTest() {
//		WebDriver driver;
//		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver = new ChromeDriver();
//		// driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
//		// driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
//		// driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
//		// driver.findElement(name("j_idt11:j_idt22")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.className("rf-pm-gr-lbl")).click();
//		driver.findElement(By.id("navForm:m_menu_57")).click();
//		driver.findElement(By.id("navForm:m_menu_53")).click();
//
//		// user 1 creation
//		// Username :
//		driver.findElement(By.id("testForm:usernameid")).sendKeys("use25");
//		// Password :
//		driver.findElement(By.id("testForm:password")).sendKeys("1");
//		// //Confirm Password : :
//		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
//		// name : :
//		driver.findElement(By.id("testForm:name")).sendKeys("use5");
//		// Paying Branch:
//
//		Select oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));
//
//		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");
//
//		// Employee Id
//		driver.findElement(By.id("testForm:employeeId")).sendKeys("5");
//		// Designation
//		driver.findElement(By.id("testForm:designation")).sendKeys("use1");
//		// Phone Number :
//		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");
//
//		// Roles
//
//		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
//		// save
//		driver.findElement(name("testForm:j_idt47")).click();
//		driver.findElement(By.linkText("logout")).click();
//
//		// @FindBy(id = "//*[@name='j_idt11:j_idt22']")
//		// WebElement submitButton;
//
//		// WebElement TxtBoxContent = driver.findElement(By.id("j_idt15:messages:"));
//		// TxtBoxContent.getText();
//		// Assert.assertEquals("Password changed successfully.", TxtBoxContent);
//		// old_value = browser.find_element_by_id('my-id').text
//		// browser.find_element_by_link_text('my link').click()
//		// new_value = browser.find_element_by_id('my-id').text
//		// assert new_value != old_value ## fails unexpectedly
//
//	}

//	@Test
//	public void SixUserCreationTest() {
//		WebDriver driver;
//		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver = new ChromeDriver();
//		// driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
//		// driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
//		// driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
//		// driver.findElement(name("j_idt11:j_idt22")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.className("rf-pm-gr-lbl")).click();
//		driver.findElement(By.id("navForm:m_menu_57")).click();
//		driver.findElement(By.id("navForm:m_menu_53")).click();
//
//		// user 1 creation
//		// Username :
//		driver.findElement(By.id("testForm:usernameid")).sendKeys("use6");
//		// Password :
//		driver.findElement(By.id("testForm:password")).sendKeys("1");
//		// //Confirm Password : :
//		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
//		// name : :
//		driver.findElement(By.id("testForm:name")).sendKeys("use6");
//		// Paying Branch:
//
//		Select oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));
//
//		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");
//
//		// Employee Id
//		driver.findElement(By.id("testForm:employeeId")).sendKeys("6");
//		// Designation
//		driver.findElement(By.id("testForm:designation")).sendKeys("use1");
//		// Phone Number :
//		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");
//
//		// Roles
//
//		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
//		// save
//		driver.findElement(name("testForm:j_idt47")).click();
//
//		// @FindBy(id = "//*[@name='j_idt11:j_idt22']")
//		// WebElement submitButton;
//
//		// WebElement TxtBoxContent = driver.findElement(By.id("j_idt15:messages:"));
//		// TxtBoxContent.getText();
//		// Assert.assertEquals("Password changed successfully.", TxtBoxContent);
//		// old_value = browser.find_element_by_id('my-id').text
//		// browser.find_element_by_link_text('my link').click()
//		// new_value = browser.find_element_by_id('my-id').text
//		// assert new_value != old_value ## fails unexpectedly
//
//	}
//
//	@Test
//	public void SevenUserCreationTest() {
//		WebDriver driver;
//		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver = new ChromeDriver();
//		// driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
//		// driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
//		// driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
//		// driver.findElement(name("j_idt11:j_idt22")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.className("rf-pm-gr-lbl")).click();
//		driver.findElement(By.id("navForm:m_menu_57")).click();
//		driver.findElement(By.id("navForm:m_menu_53")).click();
//
//		// user 1 creation
//		// Username :
//		driver.findElement(By.id("testForm:usernameid")).sendKeys("use7");
//		// Password :
//		driver.findElement(By.id("testForm:password")).sendKeys("1");
//		// //Confirm Password : :
//		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
//		// name : :
//		driver.findElement(By.id("testForm:name")).sendKeys("use7");
//		// Paying Branch:
//
//		Select oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));
//
//		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");
//
//		// Employee Id
//		driver.findElement(By.id("testForm:employeeId")).sendKeys("7");
//		// Designation
//		driver.findElement(By.id("testForm:designation")).sendKeys("use1");
//		// Phone Number :
//		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");
//
//		// Roles
//
//		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
//		// save
//		driver.findElement(name("testForm:j_idt47")).click();
//
//		// @FindBy(id = "//*[@name='j_idt11:j_idt22']")
//		// WebElement submitButton;
//
//		// WebElement TxtBoxContent = driver.findElement(By.id("j_idt15:messages:"));
//		// TxtBoxContent.getText();
//		// Assert.assertEquals("Password changed successfully.", TxtBoxContent);
//		// old_value = browser.find_element_by_id('my-id').text
//		// browser.find_element_by_link_text('my link').click()
//		// new_value = browser.find_element_by_id('my-id').text
//		// assert new_value != old_value ## fails unexpectedly
//
//	}
//
//	//
//	@Test
//	public void EightUserCreationTest() {
//		WebDriver driver;
//		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver = new ChromeDriver();
//		// driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
//		// driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
//		// driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
//		// driver.findElement(name("j_idt11:j_idt22")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.className("rf-pm-gr-lbl")).click();
//		driver.findElement(By.id("navForm:m_menu_57")).click();
//		driver.findElement(By.id("navForm:m_menu_53")).click();
//
//		// user 1 creation
//		// Username :
//		driver.findElement(By.id("testForm:usernameid")).sendKeys("use8");
//		// Password :
//		driver.findElement(By.id("testForm:password")).sendKeys("1");
//		// //Confirm Password : :
//		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
//		// name : :
//		driver.findElement(By.id("testForm:name")).sendKeys("use8");
//		// Paying Branch:
//
//		Select oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));
//
//		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");
//
//		// Employee Id
//		driver.findElement(By.id("testForm:employeeId")).sendKeys("8");
//		// Designation
//		driver.findElement(By.id("testForm:designation")).sendKeys("use1");
//		// Phone Number :
//		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");
//
//		// Roles
//
//		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
//		// save
//		driver.findElement(name("testForm:j_idt47")).click();
//
//		// @FindBy(id = "//*[@name='j_idt11:j_idt22']")
//		// WebElement submitButton;
//
//		// WebElement TxtBoxContent = driver.findElement(By.id("j_idt15:messages:"));
//		// TxtBoxContent.getText();
//		// Assert.assertEquals("Password changed successfully.", TxtBoxContent);
//		// old_value = browser.find_element_by_id('my-id').text
//		// browser.find_element_by_link_text('my link').click()
//		// new_value = browser.find_element_by_id('my-id').text
//		// assert new_value != old_value ## fails unexpectedly
//
//	}
//
//	@Test
//	public void NineUserCreationTest() {
//		WebDriver driver;
//		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver = new ChromeDriver();
//		// driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
//		// driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
//		// driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
//		// driver.findElement(name("j_idt11:j_idt22")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.className("rf-pm-gr-lbl")).click();
//		driver.findElement(By.id("navForm:m_menu_57")).click();
//		driver.findElement(By.id("navForm:m_menu_53")).click();
//
//		// user 1 creation
//		// Username :
//		driver.findElement(By.id("testForm:usernameid")).sendKeys("use9");
//		// Password :
//		driver.findElement(By.id("testForm:password")).sendKeys("1");
//		// //Confirm Password : :
//		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
//		// name : :
//		driver.findElement(By.id("testForm:name")).sendKeys("use9");
//		// Paying Branch:
//
//		Select oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));
//
//		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");
//
//		// Employee Id
//		driver.findElement(By.id("testForm:employeeId")).sendKeys("9");
//		// Designation
//		driver.findElement(By.id("testForm:designation")).sendKeys("use1");
//		// Phone Number :
//		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");
//
//		// Roles
//
//		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
//		// save
//		driver.findElement(name("testForm:j_idt47")).click();
//
//		// @FindBy(id = "//*[@name='j_idt11:j_idt22']")
//		// WebElement submitButton;
//
//		// WebElement TxtBoxContent = driver.findElement(By.id("j_idt15:messages:"));
//		// TxtBoxContent.getText();
//		// Assert.assertEquals("Password changed successfully.", TxtBoxContent);
//		// old_value = browser.find_element_by_id('my-id').text
//		// browser.find_element_by_link_text('my link').click()
//		// new_value = browser.find_element_by_id('my-id').text
//		// assert new_value != old_value ## fails unexpectedly
//
//	}
//
//	@Test
//	public void TenUserCreationTest() {
//		WebDriver driver;
//		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver = new ChromeDriver();
//		// driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
//		// driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
//		// driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
//		// driver.findElement(name("j_idt11:j_idt22")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.className("rf-pm-gr-lbl")).click();
//		driver.findElement(By.id("navForm:m_menu_57")).click();
//		driver.findElement(By.id("navForm:m_menu_53")).click();
//
//		// user 1 creation
//		// Username :
//		driver.findElement(By.id("testForm:usernameid")).sendKeys("use10");
//		// Password :
//		driver.findElement(By.id("testForm:password")).sendKeys("1");
//		// //Confirm Password : :
//		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
//		// name : :
//		driver.findElement(By.id("testForm:name")).sendKeys("use10");
//		// Paying Branch:
//
//		Select oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));
//
//		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");
//
//		// Employee Id
//		driver.findElement(By.id("testForm:employeeId")).sendKeys("10");
//		// Designation
//		driver.findElement(By.id("testForm:designation")).sendKeys("use1");
//		// Phone Number :
//		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");
//
//		// Roles
//
//		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
//		// save
//		driver.findElement(name("testForm:j_idt47")).click();
//
//		// @FindBy(id = "//*[@name='j_idt11:j_idt22']")
//		// WebElement submitButton;
//
//		// WebElement TxtBoxContent = driver.findElement(By.id("j_idt15:messages:"));
//		// TxtBoxContent.getText();
//		// Assert.assertEquals("Password changed successfully.", TxtBoxContent);
//		// old_value = browser.find_element_by_id('my-id').text
//		// browser.find_element_by_link_text('my link').click()
//		// new_value = browser.find_element_by_id('my-id').text
//		// assert new_value != old_value ## fails unexpectedly
//
//	}
//
//	@Test
//	public void ElevenUserCreationTest() {
//		WebDriver driver;
//		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver = new ChromeDriver();
//		// driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
//		// driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
//		// driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
//		// driver.findElement(name("j_idt11:j_idt22")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.className("rf-pm-gr-lbl")).click();
//		driver.findElement(By.id("navForm:m_menu_57")).click();
//		driver.findElement(By.id("navForm:m_menu_53")).click();
//
//		// user 1 creation
//		// Username :
//		driver.findElement(By.id("testForm:usernameid")).sendKeys("use11");
//		// Password :
//		driver.findElement(By.id("testForm:password")).sendKeys("1");
//		// //Confirm Password : :
//		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
//		// name : :
//		driver.findElement(By.id("testForm:name")).sendKeys("use11");
//		// Paying Branch:
//
//		Select oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));
//
//		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");
//
//		// Employee Id
//		driver.findElement(By.id("testForm:employeeId")).sendKeys("11");
//		// Designation
//		driver.findElement(By.id("testForm:designation")).sendKeys("use1");
//		// Phone Number :
//		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");
//
//		// Roles
//
//		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
//		// save
//		driver.findElement(name("testForm:j_idt47")).click();
//
//		// @FindBy(id = "//*[@name='j_idt11:j_idt22']")
//		// WebElement submitButton;
//
//		// WebElement TxtBoxContent = driver.findElement(By.id("j_idt15:messages:"));
//		// TxtBoxContent.getText();
//		// Assert.assertEquals("Password changed successfully.", TxtBoxContent);
//		// old_value = browser.find_element_by_id('my-id').text
//		// browser.find_element_by_link_text('my link').click()
//		// new_value = browser.find_element_by_id('my-id').text
//		// assert new_value != old_value ## fails unexpectedly
//
//	}
//
//	@Test
//	public void TwelveUserCreationTest() {
//		WebDriver driver;
//		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver = new ChromeDriver();
//		// driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
//		// driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
//		// driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
//		// driver.findElement(name("j_idt11:j_idt22")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.className("rf-pm-gr-lbl")).click();
//		driver.findElement(By.id("navForm:m_menu_57")).click();
//		driver.findElement(By.id("navForm:m_menu_53")).click();
//
//		// user 1 creation
//		// Username :
//		driver.findElement(By.id("testForm:usernameid")).sendKeys("use12");
//		// Password :
//		driver.findElement(By.id("testForm:password")).sendKeys("1");
//		// //Confirm Password : :
//		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
//		// name : :
//		driver.findElement(By.id("testForm:name")).sendKeys("use12");
//		// Paying Branch:
//
//		Select oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));
//
//		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");
//
//		// Employee Id
//		driver.findElement(By.id("testForm:employeeId")).sendKeys("12");
//		// Designation
//		driver.findElement(By.id("testForm:designation")).sendKeys("use1");
//		// Phone Number :
//		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");
//
//		// Roles
//
//		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
//		// save
//		driver.findElement(name("testForm:j_idt47")).click();
//
//		// @FindBy(id = "//*[@name='j_idt11:j_idt22']")
//		// WebElement submitButton;
//		//
//		// WebElement TxtBoxContent = driver.findElement(By.id("j_idt15:messages:"));
//		// TxtBoxContent.getText();
//		// Assert.assertEquals("Password changed successfully.", TxtBoxContent);
//		// old_value = browser.find_element_by_id('my-id').text
//		// browser.find_element_by_link_text('my link').click()
//		// new_value = browser.find_element_by_id('my-id').text
//		// assert new_value != old_value ## fails unexpectedly
//
//	}
//
//	@Test
//	public void ThirteenUserCreationTest() {
//		WebDriver driver;
//		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver = new ChromeDriver();
//		// driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
//		// driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
//		// driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
//		// driver.findElement(name("j_idt11:j_idt22")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.className("rf-pm-gr-lbl")).click();
//		driver.findElement(By.id("navForm:m_menu_57")).click();
//		driver.findElement(By.id("navForm:m_menu_53")).click();
//
//		// user 1 creation
//		// Username :
//		driver.findElement(By.id("testForm:usernameid")).sendKeys("use13");
//		// Password :
//		driver.findElement(By.id("testForm:password")).sendKeys("1");
//		// //Confirm Password : :
//		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
//		// name : :
//		driver.findElement(By.id("testForm:name")).sendKeys("use13");
//		// Paying Branch:
//
//		Select oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));
//
//		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");
//
//		// Employee Id
//		driver.findElement(By.id("testForm:employeeId")).sendKeys("13");
//		// Designation
//		driver.findElement(By.id("testForm:designation")).sendKeys("use1");
//		// Phone Number :
//		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");
//
//		// Roles
//
//		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
//		// save
//		driver.findElement(name("testForm:j_idt47")).click();
//
//		// @FindBy(id = "//*[@name='j_idt11:j_idt22']")
//		// WebElement submitButton;
//
//		// WebElement TxtBoxContent = driver.findElement(By.id("j_idt15:messages:"));
//		// TxtBoxContent.getText();
//		// Assert.assertEquals("Password changed successfully.", TxtBoxContent);
//		// old_value = browser.find_element_by_id('my-id').text
//		// browser.find_element_by_link_text('my link').click()
//		// new_value = browser.find_element_by_id('my-id').text
//		// assert new_value != old_value ## fails unexpectedly
//
//	}
//
//	@Test
//	public void FourTeenUserCreationTest() {
//		WebDriver driver;
//		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver = new ChromeDriver();
//		// driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
//		// driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
//		// driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
//		// driver.findElement(name("j_idt11:j_idt22")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.className("rf-pm-gr-lbl")).click();
//		driver.findElement(By.id("navForm:m_menu_57")).click();
//		driver.findElement(By.id("navForm:m_menu_53")).click();
//
//		// user 1 creation
//		// Username :
//		driver.findElement(By.id("testForm:usernameid")).sendKeys("use14");
//		// Password :
//		driver.findElement(By.id("testForm:password")).sendKeys("1");
//		// //Confirm Password : :
//		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
//		// name : :
//		driver.findElement(By.id("testForm:name")).sendKeys("use14");
//		// Paying Branch:
//
//		Select oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));
//
//		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");
//
//		// Employee Id
//		driver.findElement(By.id("testForm:employeeId")).sendKeys("14");
//		// Designation
//		driver.findElement(By.id("testForm:designation")).sendKeys("use1");
//		// Phone Number :
//		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");
//
//		// Roles
//
//		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
//		// save
//		driver.findElement(name("testForm:j_idt47")).click();
//
//		// @FindBy(id = "//*[@name='j_idt11:j_idt22']")
//		// WebElement submitButton;
//
//		// WebElement TxtBoxContent = driver.findElement(By.id("j_idt15:messages:"));
//		// TxtBoxContent.getText();
//		// Assert.assertEquals("Password changed successfully.", TxtBoxContent);
//		// old_value = browser.find_element_by_id('my-id').text
//		// browser.find_element_by_link_text('my link').click()
//		// new_value = browser.find_element_by_id('my-id').text
//		// assert new_value != old_value ## fails unexpectedly
//
//	}
//
//	@Test
//	public void FifteeneUserCreationTest() {
//		WebDriver driver;
//		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver = new ChromeDriver();
//		// driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
//		// driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
//		// driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
//		// driver.findElement(name("j_idt11:j_idt22")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.className("rf-pm-gr-lbl")).click();
//		driver.findElement(By.id("navForm:m_menu_57")).click();
//		driver.findElement(By.id("navForm:m_menu_53")).click();
//
//		// user 1 creation
//		// Username :
//		driver.findElement(By.id("testForm:usernameid")).sendKeys("use5");
//		// Password :
//		driver.findElement(By.id("testForm:password")).sendKeys("1");
//		// //Confirm Password : :
//		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
//		// name : :
//		driver.findElement(By.id("testForm:name")).sendKeys("use15");
//		// Paying Branch:
//
//		Select oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));
//
//		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");
//
//		// Employee Id
//		driver.findElement(By.id("testForm:employeeId")).sendKeys("15");
//		// Designation
//		driver.findElement(By.id("testForm:designation")).sendKeys("use1");
//		// Phone Number :
//		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");
//
//		// Roles
//
//		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
//		// save
//		driver.findElement(name("testForm:j_idt47")).click();
//
//		// @FindBy(id = "//*[@name='j_idt11:j_idt22']")
//		// WebElement submitButton;
//
//		// WebElement TxtBoxContent = driver.findElement(By.id("j_idt15:messages:"));
//		// TxtBoxContent.getText();
//		// Assert.assertEquals("Password changed successfully.", TxtBoxContent);
//		// old_value = browser.find_element_by_id('my-id').text
//		// browser.find_element_by_link_text('my link').click()
//		// new_value = browser.find_element_by_id('my-id').text
//		// assert new_value != old_value ## fails unexpectedly
//
//	}
//
//	@Test
//	public void SixteenUserCreationTest() {
//		WebDriver driver;
//		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver = new ChromeDriver();
//		// driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
//		// driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
//		// driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
//		// driver.findElement(name("j_idt11:j_idt22")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.className("rf-pm-gr-lbl")).click();
//		driver.findElement(By.id("navForm:m_menu_57")).click();
//		driver.findElement(By.id("navForm:m_menu_53")).click();
//
//		// user 1 creation
//		// Username :
//		driver.findElement(By.id("testForm:usernameid")).sendKeys("use16");
//		// Password :
//		driver.findElement(By.id("testForm:password")).sendKeys("1");
//		// //Confirm Password : :
//		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
//		// name : :
//		driver.findElement(By.id("testForm:name")).sendKeys("use16");
//		// Paying Branch:
//
//		Select oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));
//
//		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");
//
//		// Employee Id
//		driver.findElement(By.id("testForm:employeeId")).sendKeys("16");
//		// Designation
//		driver.findElement(By.id("testForm:designation")).sendKeys("use1");
//		// Phone Number :
//		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");
//
//		// Roles
//
//		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
//		// save
//		driver.findElement(name("testForm:j_idt47")).click();
//
//		// @FindBy(id = "//*[@name='j_idt11:j_idt22']")
//		// WebElement submitButton;
//
//		// WebElement TxtBoxContent = driver.findElement(By.id("j_idt15:messages:"));
//		// TxtBoxContent.getText();
//		// Assert.assertEquals("Password changed successfully.", TxtBoxContent);
//		// old_value = browser.find_element_by_id('my-id').text
//		// browser.find_element_by_link_text('my link').click()
//		// new_value = browser.find_element_by_id('my-id').text
//		// assert new_value != old_value ## fails unexpectedly
//
//	}
//
//	@Test
//	public void SeventeenUserCreationTest() {
//		WebDriver driver;
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
//		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
//		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
//		driver.findElement(name("j_idt11:j_idt22")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.className("rf-pm-gr-lbl")).click();
//		driver.findElement(By.id("navForm:m_menu_57")).click();
//		driver.findElement(By.id("navForm:m_menu_53")).click();
//
//		// user 1 creation
//		// Username :
//		driver.findElement(By.id("testForm:usernameid")).sendKeys("use17");
//		// Password :
//		driver.findElement(By.id("testForm:password")).sendKeys("1");
//		// //Confirm Password : :
//		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
//		// name : :
//		driver.findElement(By.id("testForm:name")).sendKeys("use17");
//		// Paying Branch:
//
//		Select oSelect = new Select(driver.findElement(By.id("testForm:payingBranchSelectItem")));
//
//		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");
//
//		// Employee Id
//		driver.findElement(By.id("testForm:employeeId")).sendKeys("17");
//		// Designation
//		driver.findElement(By.id("testForm:designation")).sendKeys("use1");
//		// Phone Number :
//		driver.findElement(By.id("testForm:phoneNumber")).sendKeys("001");
//		// Roles
//		driver.findElement(By.name("testForm:rights:2:j_idt42")).click();
//		
//		// // save
//		// TxtBoxContent.getText();
//		// Assert.assertEquals("Password changed successfully.", TxtBoxContent);
//		// old_value = browser.find_element_by_id('my-id').text
//		// browser.find_element_by_link_text('my link').click()
//		// new_value = browser.find_element_by_id('my-id').text
//		// assert new_value != old_value ## fails unexpectedly
//		//
//	}
}
