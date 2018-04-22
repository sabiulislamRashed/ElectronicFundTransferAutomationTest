
package Pages;

import static org.openqa.selenium.By.name;
import Pages.AdministrationTwentyUserCreationPage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AdministrationTwentyUserCreationPage {

	WebDriver driver;
	WebDriver driverChrome;

	public AdministrationTwentyUserCreationPage(WebDriver ldriver) {

		this.driver = ldriver;
	}

	public void OneUserCreationTest(String userName) {
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

		driver.findElement(By.id("testForm:usernameid")).sendKeys("userName");
		// Password :
		driver.findElement(By.id("testForm:password")).sendKeys("1");
		// //Confirm Password : :
		driver.findElement(By.id("testForm:cpassword")).sendKeys("1");
		// name : :
		driver.findElement(By.id("testForm:name")).sendKeys("userName");
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

	}
	
}
