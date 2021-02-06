package walmart.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import walmart.baseclass.Baseclass;
import walmart.pom.AddressPage;
import walmart.pom.HomePage;
import walmart.pom.SignInPage;

public class AddressTest extends Baseclass {
	
	SignInPage signinpage;
	HomePage home;
	AddressPage address;
	
	public AddressTest(){
		super();
	}
	
	@BeforeMethod
	
	public  void startup()
	{
		initilize();
		signinpage = new SignInPage();
		home = signinpage.signin(prop.getProperty("user"),prop.getProperty("pass"));
		address = new AddressPage();
		address = home.addressres();
		

	}
	
	@Test
	public void title() {
		String title = address.gettictle();
		Assert.assertEquals(title, "Walmart Canada");
	}
	
	@Test
	public void label()
	{
		String label = address.getlabel();
		Assert.assertEquals(label, "Addresses");
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}

}
