package walmart.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import walmart.baseclass.Baseclass;
import walmart.pom.AddressPage;
import walmart.pom.HomePage;
import walmart.pom.PersonalSetting;
import walmart.pom.SignInPage;

public class PersonalTest extends Baseclass {
	SignInPage signinpage;
	HomePage home;
	PersonalSetting personal;
	
	public PersonalTest(){
		super();
	}
	
	@BeforeMethod
	
	public  void startup()
	{
		initilize();
		signinpage = new SignInPage();
		home = signinpage.signin(prop.getProperty("user"),prop.getProperty("pass"));
	    personal = new PersonalSetting();
		personal = home.personal();
		

	}
	
	@Test
	public void title() {
		String title = personal.gettictle();
		Assert.assertEquals(title, "Walmart Canada");
	}
	
	@Test
	public void label()
	{
		String label = personal.getlabel();
		Assert.assertEquals(label, "Personal Settings");
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}

	

}
