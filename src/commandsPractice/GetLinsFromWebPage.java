package commandsPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class GetLinsFromWebPage {
	public WebDriver driver;
public void setup(){
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/DriverFiles/chromedriver.exe");
	
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");

	}
public void getLinks()
{
	
List<WebElement>	wb=driver.findElements(By.tagName("a"));
 for(int i=0;i<wb.size();i++)
 {
	String url= wb.get(i).getAttribute("href");
	System.out.println(url);
 }

}

	public static void main(String[] args) {
		GetLinsFromWebPage d=new GetLinsFromWebPage();
		d.setup();
		
		d.getLinks();

	}

}
