package commandsPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Gmail {
	public WebDriver driver;

	
	public void open()
	{

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/DriverFiles/geckodriver.exe");
	driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");
	
}
	public void basic() throws Exception
	{
	//driver.get("https://www.google.com/gmail/about/");
	//driver.findElement(By.xpath("html/body/nav/div/a[3]")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.findElement(By.id("FirstName")).clear();
	driver.findElement(By.id("FirstName")).sendKeys("nnn");
	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("uppuganti");
	driver.findElement(By.id("GmailAddress")).sendKeys("gvjhljvjhpreetham");
	driver.findElement(By.name("GmailAddress")).sendKeys("uppuganti");
	driver.findElement(By.id(":0")).click();
	driver.findElement(By.id(":8")).click();
	
	}

	public static void main(String[] args) throws Exception
	{
	Gmail p=new Gmail();
	p.open();
	p.basic();
	}
	

}