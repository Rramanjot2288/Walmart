package walmart.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import walmart.baseclass.Baseclass;
import walmart.pom.HomePage;
import walmart.pom.MyRecommendation;
import walmart.pom.SignInPage;

public class MyrecomenTest extends Baseclass {
	SignInPage signinpage;
	HomePage home;
	MyRecommendation recommendation;
	
	public MyrecomenTest(){
		super();
	}
		
		@BeforeMethod
	   public  void startup()
		{
			initilize();
			signinpage = new SignInPage();
			home = signinpage.signin(prop.getProperty("user"),prop.getProperty("pass"));
			recommendation = new MyRecommendation();
			recommendation = home.reco();
		}
		
		@Test
		public void checktitle()
		{
			String recoTitle = recommendation.gettictle();
			Assert.assertEquals(recoTitle, "My Recommendations | Walmart Canada");
		}
		

		@AfterMethod
		public void quit()
		{
			driver.quit();
		}
	



}
