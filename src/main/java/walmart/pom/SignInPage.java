package walmart.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import walmart.baseclass.Baseclass;

public class SignInPage extends Baseclass{
	
	@FindBy(css = ".css-1si6i1z > svg:nth-child(1) > path:nth-child(1)")
	WebElement logo;
	
	@FindBy(className = "css-17uo84k e17nj3uo1")
	WebElement signuptext;
	
	@FindBy(id ="username")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id = "rememberme")
	WebElement keepsign;
	
	@FindBy(css=".css-vfxkzw")
	WebElement signBtn;
	
	@FindBy(linkText="Create account")
	WebElement signup;
	
	public  SignInPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String signinpagevalidation()
	{
		return driver.getCurrentUrl();
	}
	
	public boolean checklogo()
	{
		return logo.isDisplayed();
	}
	
	public boolean checksignup()
	{
		return signup.isDisplayed();
	}
	public SignupPage clicksignup()
	{
		signup.click();
		return new SignupPage();
	}
	
	public HomePage signin(String user,String pass)
	{
		username.sendKeys(user);
		password.sendKeys(pass);
		keepsign.click();
		signBtn.click();
		return new HomePage();
	}

	

}
