package commandsPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {
	public WebDriver driver;
	public void setup(){
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/DriverFiles/chromedriver.exe");
	
		driver=new FirefoxDriver();
		driver.get("http://www.goibibo.com/");
	

	
	}
	public void handlingFrames()
	{
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.findElement(By.id("get_sign_up")).click();
		driver.switchTo().frame("authiframe");
		driver.findElement(By.id("authMobile")).sendKeys("1234");
		driver.switchTo().defaultContent();
		
	}
	public static void main(String[] args) {
	
		
		HandlingFrames h=new HandlingFrames();
		h.setup();
		h.handlingFrames();
	}

}
