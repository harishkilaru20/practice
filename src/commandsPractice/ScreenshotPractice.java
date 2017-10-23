package commandsPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotPractice {
	ReuseScreenshot screen=new ReuseScreenshot();
	public WebDriver driver;
	public void setup(){
	
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/DriverFiles/chromedriver.exe");
	
		driver=new FirefoxDriver();
		driver.get("https://www.axisbank.com/");

	
	}
	public void screenshot() throws IOException
	
	{
		
	/*File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("C:\\harish\\selenium\\workspace\\seleniumLearning\\screen\\preetham.png"));*/
	screen.screenshotReuse(driver, "axis");
	driver.get("http://facebook.com");
	screen.screenshotReuse(driver, "google");
	}

	public static void main(String[] args) throws IOException {
		ScreenshotPractice s=new ScreenshotPractice();
		s.setup();
		s.screenshot();

	}

}
