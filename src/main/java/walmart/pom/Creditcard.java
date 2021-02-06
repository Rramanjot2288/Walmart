package walmart.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import walmart.baseclass.Baseclass;

public class Creditcard extends Baseclass {
	
	@FindBy(xpath="//*[@id=\"my-account-content\"]/section/section[1]/div/h1")
	WebElement label;
	
	public  Creditcard()
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
