package walmart.pom;

import org.openqa.selenium.support.PageFactory;

import walmart.baseclass.Baseclass;

public class MyRecommendation extends Baseclass {
	
	public MyRecommendation ()
	{
		PageFactory.initElements(driver, this);
		
	}
	public String gettictle()
	{
		return driver.getTitle();
	}

}
