package walmart.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import walmart.baseclass.Baseclass;

public class HomePage extends Baseclass {
	
	@FindBy(className="userFirstName")
	WebElement checkuser;
	
	@FindBy(linkText ="My Recommendations")
	WebElement myrecom;
	
	@FindBy(xpath = "//*[@id=\"my-account-nav\"]/section[1]/ul/li[2]/a")
	WebElement myaccount;
	
	@FindBy(linkText = "Order History")
	WebElement orderhistory;
	
	
	@FindBy(linkText = "Communication Preferences")
	WebElement communication;
	
	@FindBy(linkText = "Personal Settings")
	WebElement personal;
	
	@FindBy(linkText = "Addresses")
	WebElement address;
	
	@FindBy(linkText = "Credit Cards")
	WebElement cards;
	
	@FindBy(linkText = "Sign Out")
	WebElement signout;
	
	
	
	public HomePage() 
	{
	PageFactory.initElements(driver, this);
	}
	
	public String  homeurl()
	{
		return driver.getTitle();
	}
	
	public String checkuser()
	{
		return checkuser.getText();
	}
	
	public MyRecommendation reco()
	{
		myrecom.click();
		return new MyRecommendation();
	}

 	public MyAccount myacc()
 	{
 		myaccount.click();
 		return new MyAccount();
 	}
 	
 	public OrderHistory orderhistory()
 	{
 		orderhistory.click();
 		return new OrderHistory();
 	}
 	
    public Communication communication()
    {
    	communication.click();
    	return new Communication();
    }
	
    public PersonalSetting personal()
    {
    	personal.click();
    	return new PersonalSetting();
    }
    
    public AddressPage addressres()
    {
    	address.click();
    	return new AddressPage();
    }
    
    public Creditcard creditcards()
    {
    	cards.click();
    	return new Creditcard();
    }
    
    public HomePage signout()
    {
    	signout.click();
    	return new HomePage();
    }
 

}
