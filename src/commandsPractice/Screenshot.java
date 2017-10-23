package commandsPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {
	public WebDriver driver;
  ReusingClass usuable= new ReusingClass();
	
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/DriverFiles/chromedriver.exe");
		
		driver=new FirefoxDriver();
		driver.get("https://www.axisbank.com/");
		
	}
	public void screenshot() throws Exception
	{
		/*File file=((TakesScreenshot)driver).getScreenshotAs((OutputType.FILE));
	FileUtils.copyFile(file,new File("C:\\harish\\selenium\\workspace\\seleniumLearning\\screen//preetham.png"));
	*/	
		usuable.reuse(driver, "xy");
		
		
		
	}
	
	
public static void main(String[] args) throws Exception {
	
Screenshot p=new Screenshot();
p.setup();
p.screenshot();
	}

}
