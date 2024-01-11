package testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.BaseTest;
import pages.ActitimeHomePage;
import pages.ActitimeLoginPage;

@Listeners(generics.Screenshot.class)
public class ActitimeTest extends BaseTest
{
	@Test
	public void login()
	{
		ActitimeLoginPage loginpage=new ActitimeLoginPage(driver);
		loginpage.loginmethod();
	}
	@Test(dependsOnMethods = "login")
	public void logout()
	{
		ActitimeHomePage homepage=new ActitimeHomePage(driver);
		homepage.logoutmethod();
	}

}
