package walmart.baseclass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Baseclass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public Baseclass(){
		try
		{
		
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\14167\\eclipse-workspace\\walmart\\src\\main\\java\\walmart\\config\\config.properties");
		prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
		
		public static void initilize()
		
		{
			String browsername =  prop.getProperty("broswer");
			
			if(browsername.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","C:\\Users\\14167\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else 
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\14167\\Downloads\\chromedriver_win32\\chromedriver.exe");
			    driver=new ChromeDriver(); //Launch Chrome Driver
			}
			
	
		   
    driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
		
		}
	}


