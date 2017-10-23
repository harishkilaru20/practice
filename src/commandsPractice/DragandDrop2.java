package commandsPractice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop2 {
	public WebDriver driver;
	public void setup(){
	
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/DriverFiles/chromedriver.exe");
	
		driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");

	
	}
	public void handleDragAndDrop(){
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//here in this method the frame does not have the id and name so, If we don't have Id and Name
		//If we want to handle the frame we have to use below method.
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
	}

	public static void main(String[] args) {
		DragandDrop2 d=new DragandDrop2();
		d.setup();
		d.handleDragAndDrop();

	}

}
