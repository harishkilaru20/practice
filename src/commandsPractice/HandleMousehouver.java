package commandsPractice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleMousehouver {
	public WebDriver driver;
	public void setup() throws IOException
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/DriverFiles/geckodriver.exe");
	
		driver=new FirefoxDriver();
		
		driver.get("http://www.covalentech.com/");
		
	}
	public void mousehouver() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions action =new Actions(driver);
	WebElement	wb=driver.findElement(By.xpath("//a[@href='services_products.html']"));
	WebElement	wb2=driver.findElement(By.xpath("//a[@href='sas.html']"));
	WebElement	wb3=driver.findElement(By.xpath("//a[@href='java.html']"));
	action.moveToElement(wb).moveToElement(wb2).moveToElement(wb3).build().perform();
	Thread.sleep(3000);
		
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		HandleMousehouver h=new HandleMousehouver();
		h.setup();
		h.mousehouver();
	}

}
