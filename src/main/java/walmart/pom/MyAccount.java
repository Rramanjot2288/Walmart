package walmart.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import walmart.baseclass.Baseclass;

public class MyAccount extends Baseclass {
	
	

	@FindBy(css = "#my-account-main-content > h1")
	WebElement Label;
	
	public MyAccount ()
	{
		PageFactory.initElements(driver, this);
		
	}

	public String gettictle()
	{
		return driver.getTitle();
	}
	
	public String getlabel()
	{
	return Label.getText();
	}
	

}
