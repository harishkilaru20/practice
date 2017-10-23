package commandsPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadingFile {
	public WebDriver driver;
	public void setup(){
	
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/DriverFiles/chromedriver.exe");
	
		driver=new FirefoxDriver();
		driver.get("https://www.axisbank.com/");

	
	}
	
	
	public static void main(String[] args) {
		UploadingFile u=new UploadingFile();
		u.setup();
	

	}

}
