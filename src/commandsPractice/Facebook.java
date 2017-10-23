package commandsPractice;


import java.io.IOException;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook
{
	Reuse s=new Reuse();
	public WebDriver driver;
	public void login() throws IOException
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/DriverFiles/chromedriver.exe");
	
		driver=new FirefoxDriver();
		//File file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.moveFile(file1, new File("C:\\harish\\selenium\\workspace\\seleniumLearning\\screenshots\\f1fa.jpg"));
		driver.get("http://www.facebook.com");
		driver.findElement(By.cssSelector("input#u_0_9")).clear();
		driver.findElement(By.cssSelector("input#u_0_9")).sendKeys("harish");
		
		s.screenshot(driver,"abc");
		//File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.moveFile(file, new File("C:\\harish\\selenium\\workspace\\seleniumLearning\\screenshots\\faf.jpg"));
	
	}
	
	public static void main(String[] args) throws IOException
	{
		Facebook f=new Facebook();
		f.login();
	}
}
