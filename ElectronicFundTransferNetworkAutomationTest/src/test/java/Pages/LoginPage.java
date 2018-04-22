package Pages;

import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage {
	WebElement element;
	WebDriver driver;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	//By signout = By.xpath("//div[@class='text-center']//a[text()='Social Islami Bank Limited © 2018']");

	public void loginApplication(String email, String pass) {
		//element = wait.until((Predicate<WebDriver>) ExpectedConditions.elementToBeClickable(className("fa-sign-out")));
		driver.findElement(By.name("j_idt11:j_idt17")).sendKeys(email);
		driver.findElement(By.name("j_idt11:j_idt20")).sendKeys(pass);
		driver.findElement(By.name("j_idt11:j_idt22")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//import java.util.function.Function;
	//import com.google.common.base.Predicate;

	//import org.openqa.selenium.WebElement;
	//import org.openqa.selenium.support.FindBy;
	//import org.openqa.selenium.support.ui.ExpectedConditions;
	//import org.openqa.selenium.support.ui.WebDriverWait;
	//import org.testng.Assert;
	//import org.openqa.selenium.By;
	//import org.openqa.selenium.support.ui.ExpectedConditions;

	// public void verifySignOutLink()
	// {
	//
	// WebDriverWait wait=new WebDriverWait(driver, 20);
	//
	// WebElement
	// ele=wait.until(ExpectedConditions.presenceOfElementLocated(signout));
	//
	// String text=ele.getText();
	//
	// Assert.assertEquals(text, "Social Islami Bank Limited © 2018t","Internet
	// Banking Admin Portal");
	// }

	// public void verifySignOutLink()
	// {
	//
	// WebDriverWait wait=new WebDriverWait(driver, 20);
	//
	// WebElement
	// ele=wait.until(ExpectedConditions.presenceOfElementLocated(signout));
	//
	// String text=ele.getText();
	//
	// // Assert.assertEquals(text, "Sign Out","Sign out link not verified
	// properly");
	// }
}

//
//
// public LoginPage fillEmail(String email) {
// if (driver != null) {
//
// driver.findElement(id("UserInfo_UserName")).sendKeys(email);
// }else {
// System.out.printf("driver null");
// }
//
// return this;
// }
//
// public LoginPage fillPassword(String pass) {
// driver.findElement(id("primary_secu")).sendKeys(pass);
//
// return this;
//
// }
//
//
// public LoginPage clickLogin() {
// driver.findElement(className("btn-primary")).click();
// WebDriverWait wait = new WebDriverWait(driver, 10);
// WebElement element =
// wait.until(ExpectedConditions.elementToBeClickable(className("fa-sign-out")));
// return this;
// }

