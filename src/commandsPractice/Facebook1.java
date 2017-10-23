package commandsPractice;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class Facebook1 {
	
	Reuse screen=new Reuse();

	public WebDriver driver;
	public void navigate() throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/DriverFiles/chromedriver.exe");
		
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//File file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.moveFile(file1, new File("C:\\harish\\selenium\\workspace\\seleniumLearning\\screenshots\\f1fa.jpg"));
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.id("u_0_9")).sendKeys("harish");
		driver.findElement(By.id("u_0_b")).sendKeys("k");
		driver.findElement(By.name("reg_email__")).sendKeys("11145515631");
	new Select(driver.findElement(By.id("month"))).selectByVisibleText("Aug");
	new Select(driver.findElement(By.id("day"))).selectByIndex(12);
	
	//driver.findElement(By.linkText("Terms")).click();
	//driver.findElement(By.partialLinkText("Cookie")).click();
	
	driver.get("http://google.com");
String tile=driver.getTitle();
System.out.println(tile);
String url=driver.getCurrentUrl();
screen.screenshot(driver, "xxx");
//File	file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.moveFile(file1, new File("C:\\harish\\selenium\\workspace\\seleniumLearning\\screen\\google.jpg"));
System.out.println(url);
	driver.navigate().back();
	screen.screenshot(driver, "xxxa");
	driver.navigate().forward();
	driver.navigate().refresh();
	
//File	file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.moveFile(file, new File("C:\\harish\\selenium\\workspace\\seleniumLearning\\screen\\facebook.jpg"));
		screen.screenshot(driver, "preetham");
	}

	public static void main(String[] args) throws Exception {
		Facebook1 f=new Facebook1();
		f.navigate();

	}

}
