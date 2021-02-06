package walmart.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import walmart.baseclass.Baseclass;
import walmart.pom.HomePage;
import walmart.pom.MyRecommendation;
import walmart.pom.SignInPage;

public class HomepageTest extends Baseclass {
	
	SignInPage signinpage;
	HomePage home;
	MyRecommendation recommendation;
	
	public HomepageTest(){
		super();
	}
	
	@BeforeMethod
	
	public  void startup()
	{
		initilize();
		signinpage = new SignInPage();
		home = signinpage.signin(prop.getProperty("user"),prop.getProperty("pass"));
		

	}
	
	@Test(priority = 1 ) 
	public void checktitle()
	{
	String homeurl = home.homeurl();
	Assert.assertEquals(homeurl, "Walmart Canada");
	}
	
	@Test(priority=2)
	public void checkusername()
	{
		String user = home.checkuser();
		Assert.assertEquals(user, "Ramanjot");
	}
	
	@Test(priority=3)
	
	public void clickmyrecc()
	{
		recommendation = home.reco();
	}

	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
}
