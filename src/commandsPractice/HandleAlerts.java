package commandsPractice;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAlerts {
	
	Reuse s=new Reuse();
	public WebDriver driver;
	public void setup() throws IOException
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/DriverFiles/chromedriver.exe");
	
		driver=new FirefoxDriver();
		driver.get("http://selenium4testing.com/hms/index.php");
		
	}
	
	public void handleAlert() throws IOException, InterruptedException
	{
		
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("ad123");
	driver.findElement(By.name("submit")).click();
Thread.sleep(3000);
//to get text from the alert box


Alert alert=driver.switchTo().alert();
String alerttext=alert.getText();
alert.accept();
System.out.println(alerttext);

		
		s.screenshot(driver,"abc");
		driver.close();
		
	}
	

	public static void main(String[] args) throws IOException, InterruptedException {
		
		HandleAlerts h=new HandleAlerts();
		h.setup();
		h.handleAlert();
	}

}
