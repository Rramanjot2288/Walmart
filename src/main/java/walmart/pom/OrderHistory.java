package walmart.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import walmart.baseclass.Baseclass;

public class OrderHistory extends Baseclass{
	
	
	@FindBy(className="css-1k8ky1d eqdeh202")
	WebElement getlableorder;
	
	public OrderHistory  ()
	{
		PageFactory.initElements(driver, this);
		
	}

	public String gettictle()
	{
		return driver.getTitle();
	}
	
	public String getlabel()
	{
		return getlableorder.getText();
      
	}	

}
