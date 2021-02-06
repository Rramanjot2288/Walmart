package walmart.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import walmart.baseclass.Baseclass;

public class AddressPage extends Baseclass {
	
	@FindBy(xpath="//*[@id=\"my-account-content\"]/section/section[1]/div/h1")
	WebElement label;
	@FindBy(id = "add-new-address-btn")
	WebElement addressbtn;
	@FindBy(id = "edit-address-btn")
	WebElement editbtn;
	@FindBy(id = "remove-address-btn")
	WebElement removebtn;
	
	public  AddressPage()
	{
		PageFactory.initElements(driver, this);
		
	}

	public String gettictle()
	{
		return driver.getTitle();
	}
	
	public String getlabel()
	{
		
      return label.getText();
	}	

}
