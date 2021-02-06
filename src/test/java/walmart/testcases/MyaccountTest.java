package walmart.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import walmart.baseclass.Baseclass;
import walmart.pom.HomePage;
import walmart.pom.MyAccount;
import walmart.pom.SignInPage;

public class MyaccountTest extends Baseclass {
	
	SignInPage signinpage;
	HomePage home;
	MyAccount account;
	
	public MyaccountTest(){
		super();
	}
	@BeforeMethod
	   public  void startup()
		{
			initilize();
			signinpage = new SignInPage();
			home = signinpage.signin(prop.getProperty("user"),prop.getProperty("pass"));
			account = new MyAccount();
			account = home.myacc();
		}
	
	@Test 
	public void chectitle()
	{
		String acc = account.gettictle();
		Assert.assertEquals(acc, "Walmart Canada");
	}
	
	@Test
	public void checklabel()
	{
		String label = account.getlabel();
		Assert.assertEquals(label, "My Account");
	}
	

	@AfterMethod
	public void quit()
	{
		driver.quit();
	}



}
