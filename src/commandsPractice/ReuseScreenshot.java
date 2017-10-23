package commandsPractice;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ReuseScreenshot {
	
public void screenshotReuse(WebDriver driver,String abc) throws IOException
{
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("C:\\harish\\selenium\\workspace\\seleniumLearning\\screen\\"+abc+timestamp()+".png"));
}

  public String timestamp()
  {
	 Date d=new Date(); 
	 Timestamp time=new Timestamp(d.getTime());
	 
	 String stime=time.toString();
	 String xxx=stime.replaceAll(":", "-");
	 return xxx;
	  
	
	  
	  
  }
  
}
