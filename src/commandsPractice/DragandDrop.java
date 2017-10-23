package commandsPractice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public WebDriver driver;
	public void setup(){
	
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/DriverFiles/chromedriver.exe");
	
		driver=new FirefoxDriver();
		driver.get("http://codef0rmer.github.io/angular-dragdrop/#/");

	
	}
	public void handleDragAndDrop(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement drag=driver.findElement(By.xpath("//div[contains(@class,'btn btn-primary ng-pristine ng-untouched')]"));
		WebElement drop=driver.findElement(By.xpath("//div[contains(@class,'thumbnail ng-pristine ng-untouched')]"));
	Actions action=new Actions(driver);
	action.dragAndDrop(drag, drop).build().perform();
	}

	public static void main(String[] args) {
		DragandDrop d=new DragandDrop();
		d.setup();
		d.handleDragAndDrop();

	}

}
