package walmart.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import walmart.baseclass.Baseclass;
import walmart.pom.Creditcard;
import walmart.pom.HomePage;
import walmart.pom.SignInPage;

public class CreditcartTest extends Baseclass {
	
	SignInPage signinpage;
	HomePage home;
	Creditcard credit;
	
	public CreditcartTest(){
		super();
	}
	
	@BeforeMethod
	
	public  void startup()
	{
		initilize();
		signinpage = new SignInPage();
		home = signinpage.signin(prop.getProperty("user"),prop.getProperty("pass"));
	    credit = new Creditcard();
		credit = home.creditcards();
		

	}
	
	@Test(priority=1)
	public void title() {
		String title = credit.gettictle();
		Assert.assertEquals(title, "Walmart Canada");
	}
	
	@Test(priority=2)
	public void label()
	{
		String label = credit.getlabel();
		Assert.assertEquals(label, "Credit Cards");
	}
	

	
		
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}

	

}
