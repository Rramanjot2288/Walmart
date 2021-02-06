package walmart.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import walmart.baseclass.Baseclass;
import walmart.pom.HomePage;
import walmart.pom.OrderHistory;
import walmart.pom.SignInPage;

public class OrderTest extends Baseclass {
	
	
	SignInPage signinpage;
	HomePage home;
	OrderHistory orderhistory;
	
@BeforeMethod
	
	public  void startup()
	{
		initilize();
		signinpage = new SignInPage();
		home = signinpage.signin(prop.getProperty("user"),prop.getProperty("pass"));
		orderhistory = new OrderHistory();
		orderhistory = home.orderhistory();
		
	}

@Test
public void chechtitke() {
	String title = orderhistory.gettictle();
	Assert.assertEquals(title, "Shop Walmart.ca: Online Shopping & Everyday Low Prices");
	
	}
@Test
public void checlabel()
{
	String label = orderhistory.getlabel();
	Assert.assertEquals(label, "Order History");
}

@AfterMethod
public void quit()
{
	driver.quit();
}

	
	

}
