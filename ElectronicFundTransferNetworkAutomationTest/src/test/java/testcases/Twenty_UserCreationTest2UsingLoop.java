
package testcases;

import org.testng.annotations.Test;

import Pages.AdministrationTwentyUserCreationPage;
//import Pages.HomePage;
//import factory.BrowserFactory;
//import factory.DataProviderFactory;
//

public class Twenty_UserCreationTest2UsingLoop {
	
	@Test
	public void twentyUserCreationTest() {
		AdministrationTwentyUserCreationPage twenty_UserCreationPage = new AdministrationTwentyUserCreationPage(null);
twenty_UserCreationPage.OneUserCreationTest("user304");
twenty_UserCreationPage.OneUserCreationTest("user302");


	}
	
	} 
	

