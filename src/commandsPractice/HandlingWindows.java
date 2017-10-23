package commandsPractice;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindows {
public WebDriver driver;

		public void setup(){
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/DriverFiles/chromedriver.exe");
		
			driver=new FirefoxDriver();
			driver.get("https://www.google.com/gmail/about/#");
			
		}		
	  public void windowhandle(){
		  String parentwindow=driver.getWindowHandle();
		  System.out.println(driver.getTitle());
driver.findElement(By.className("hero_home__link__desktop")).click();

      Set<String> windows=driver.getWindowHandles();
      
      for(String childwindow:windows ){
    	  driver.switchTo().window(childwindow);
      }
      driver.findElement(By.id("FirstName")).sendKeys("12345");
     
      System.out.println(driver.getTitle());
      driver.close();  //it will close child
      driver.switchTo().window(parentwindow);
      //we can do noe the parent window operations.
	  }
	  
	  
	  
			public static void main(String[] args) {
				HandlingWindows h=new HandlingWindows();
				h.setup();
				h.windowhandle();

	}

}
