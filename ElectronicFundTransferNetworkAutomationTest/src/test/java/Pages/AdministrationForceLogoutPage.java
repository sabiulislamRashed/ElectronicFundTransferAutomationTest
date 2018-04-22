package Pages;

import static org.openqa.selenium.By.name;
import Pages.AdministrationForceLogoutPage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AdministrationForceLogoutPage {

	WebDriver driver;
	WebDriver driverChrome;

	public AdministrationForceLogoutPage(WebDriver ldriver) {

		this.driver = ldriver;
	}

	public void adminLogin() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Sabiul\\eclipse-workspace\\ElectronicFundTransferNetworkAutomationTest\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(name("j_idt11:j_idt17")).sendKeys("sabiul");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(name("j_idt11:j_idt20")).sendKeys("test2");
		driver.findElement(name("j_idt11:j_idt22")).click();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.findElement(By.className("rf-pm-gr-lbl")).click();
		driver.findElement(By.id("navForm:m_menu_112")).click();

		// username
		driver.findElement(name("j_idt14:j_idt19")).sendKeys("user1000");

		Select oSelect = new Select(driver.findElement(By.id("j_idt14:payingBranchSelectItem")));

		oSelect.selectByVisibleText("ABDULLAHPUR BAZAR");

		// search;''

		driver.findElement(name("j_idt14:j_idt23")).click();
		driver.findElement(name("j_idt14:existingUsersDataTable:0:j_idt30")).click();

	}
	public void userLoginPage(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driverChrome = new ChromeDriver();
		driverChrome.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");

		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverChrome.findElement(name("j_idt11:j_idt17")).sendKeys("user1000");
		driverChrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driverChrome.findElement(name("j_idt11:j_idt20")).sendKeys("1");
		driverChrome.findElement(name("j_idt11:j_idt22")).click();
		driverChrome.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		
		adminLogin();
		
		
		driverChrome.get(driverChrome.getCurrentUrl());
		
		
	}

	
}
