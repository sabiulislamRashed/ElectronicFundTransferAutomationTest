package Pages;

import static org.openqa.selenium.By.name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//import utility.Helper;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OutwardNewTransactionPage 
{

	WebDriver driver;
	
	public OutwardNewTransactionPage(WebDriver ldriver)
	{
		
		this.driver=ldriver;
	}

	//@FindBy(xpath="//a[text()='Internet Banking Admin Portal']") WebElement InternetBankingAdminPortal;
	
	
	
	public void getOriginatingDetailsAccountIDorNameOnePartPage() {
		// TODO Auto-generated method stub
		driver.findElement(name("txnEntryForm:j_idt22")).sendKeys("test2");

		 
	}
	public void getOriginatingDetailsAccountIDorNameTwoPartPage() {
		// TODO Auto-generated method stub
		driver.findElement(name("txnEntryForm:j_idt23")).sendKeys("test2");

		 
	}
	
	public void getOriginatingDetailsAccountNoPage() {
		// TODO Auto-generated method stub
		driver.findElement(name("txnEntryForm:j_idt25")).sendKeys("test2");

		 
	}
	public void getOriginatingDetailsAmountPage() {
		// TODO Auto-generated method stub
		driver.findElement(name("txnEntryForm:j_idt27")).sendKeys("test2");

		 
	}

//============================================================================
	
	
	public void getOutwardDetailsTranssactionTypeOnePartPage() {
		Select oSelect = new Select(driver.findElement(By.id("txnEntryForm:secc")));

		oSelect.selectByVisibleText("PPD");

		 
	}
	
	public void getOutwardDetailsDescriptionPage() {
		Select oSelect = new Select(driver.findElement(By.id("txnEntryForm:description")));

		oSelect.selectByVisibleText("Pension");

		 
	}
	public void getOutwardDetailsTxnCodePage() {
		Select oSelect = new Select(driver.findElement(By.id("txnEntryForm:txnCode")));

		oSelect.selectByVisibleText("42 Automated GL Deposit");

		 
	}
	public void getOutwardDetailsReceivingBankPage() {
		Select oSelect = new Select(driver.findElement(By.id("txnEntryForm:receivingBankSelectItem")));

		oSelect.selectByVisibleText("BANK AL-FALAH LTD");

		 
	}public void getOutwardDetailsBranchPage() {
		Select oSelect = new Select(driver.findElement(By.id("txnEntryForm:bankBranchSelectItem")));

		oSelect.selectByVisibleText("AGRABAD [065150137]");

		 
	}
	
	
	public void getOutwardDetailsBranchPage1() {
		
		// TODO Auto-generated method stub
		driver.findElement(name("txnEntryForm:j_idt27")).sendKeys("test2");

		 
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
