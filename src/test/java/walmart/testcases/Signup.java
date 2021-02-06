package walmart.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import walmart.baseclass.Baseclass;
import walmart.pom.SignInPage;
import walmart.pom.SignupPage;
import walmart.util.TestUtil;

public class Signup extends Baseclass {

	SignInPage signinpage;
	SignupPage signup;
	String sheetname = "sheet1";
	
	
	public Signup(){
		super();
	}
	@BeforeMethod
	   public  void startup()
		{
			initilize();
			signinpage = new SignInPage();
			signup = signinpage.clicksignup();
		
		}
	@DataProvider
	public Object[][] accessdata()
	{
		Object data [][] = TestUtil.getTestData(sheetname);
		return data;
	}
		
	 @Test(dataProvider="accessdata")
	 public void login(String firstname,String lastname,String email,String password )
	 {
     signup.signup(firstname,lastname,email,password);
	 }
	 
	 @AfterMethod
	 public void quit()
	 {
		 driver.quit();
	 }
	
	
}
