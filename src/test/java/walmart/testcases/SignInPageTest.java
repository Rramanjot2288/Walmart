package walmart.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import walmart.baseclass.Baseclass;
import walmart.pom.HomePage;
import walmart.pom.SignInPage;

public class SignInPageTest extends Baseclass{
	
	SignInPage signin;
	HomePage home;
	
	public SignInPageTest(){
		super();
	}
	
	@BeforeMethod
	
	public  void startup()
	{
		initilize();
		signin = new SignInPage();
	}
	
	@Test(priority=1)  //Checking the "URL"
	public void checkUrl(){
	String Url = signin.signinpagevalidation();
	Assert.assertEquals(Url,"https://www.walmart.ca/sign-in");
	}
	
	@Test(priority=2)  //Checking the visibility of Walmart Logo
	public void checklogo(){
		boolean logo = signin.checklogo();
		Assert.assertTrue(logo);
		
	}
	
	@Test(priority=3) //Signup Button Should be there 
	public void signupbutton()
	{
	boolean signup= signin.checksignup();
		Assert.assertTrue(signup);
	}
	
	@Test(priority=4)  //Should accept Valid Username and Password 
	public void signinfields()
	{
	home = signin.signin(prop.getProperty("user"),prop.getProperty("pass"));
	
	}
	@AfterMethod
	public void close()
	{
		driver.quit();
	}

}
