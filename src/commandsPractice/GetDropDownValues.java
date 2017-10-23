package commandsPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetDropDownValues {
	public WebDriver driver;
	public void setup(){
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/DriverFiles/chromedriver.exe");
	
		driver=new FirefoxDriver();
		driver.get("http://selenium4testing.com/hms/");

	
	}
	public void getDropdwon()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("Registration")).click();
		
		List<WebElement> se=new Select(driver.findElement(By.name("PATIENT_CAT"))).getOptions();
		
		
		for(int i=0;i<se.size();i++){
		String	out=se.get(i).getText();
			System.out.println(out);
		}
	}
	
	
	

	public static void main(String[] args) {
		GetDropDownValues d=new GetDropDownValues();
		d.setup();
		d.getDropdwon();
	}

}
