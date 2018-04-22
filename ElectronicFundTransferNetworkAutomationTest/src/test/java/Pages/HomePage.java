package Pages;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//import utility.Helper;

public class HomePage 
{

	WebDriver driver;
	
	public HomePage(WebDriver ldriver)
	{
		
		this.driver=ldriver;
	}

	//@FindBy(xpath="//a[text()='Internet Banking Admin Portal']") WebElement InternetBankingAdminPortal;
	
	public String getInternetBankingAdminPortalTitle() {
		// TODO Auto-generated method stub
		 return driver.getTitle();
	}

	
	public String getApplicationTitle() {
		return driver.getTitle();
	}

	public void clickOnSigninLink() {
	driver.get("http://172.16.215.62:8080/beftn/faces/login.xhtml");
	}

}





	
	
	
	
	
	
	
	
//public HomePage fillEmail(String email) {
//if (driver != null) {
//
//  driver.findElement(id("UserInfo_UserName")).sendKeys(email);
//}else {
//  System.out.printf("driver null");
//}
//
//return  this;
//}
//
//public HomePage fillPassword(String pass) {
//driver.findElement(id("primary_secu")).sendKeys(pass);
//
//return  this;
//
//}
//
//
//public HomePage clickLogin() {
//driver.findElement(className("btn-primary")).click();
//WebDriverWait wait = new WebDriverWait(driver, 10);
//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(className("fa-sign-out")));
//return this;
//}
//
//public HomePage clickLogout() {
//driver.findElement(className("nav-label")).click();
//return this;
//}
