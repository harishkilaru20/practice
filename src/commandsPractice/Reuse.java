package commandsPractice;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Reuse {

	public void screenshot(WebDriver driver, String screenshotname ) throws IOException 
	{
	
	File	file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.moveFile(file, new File("C:\\harish\\selenium\\workspace\\seleniumLearning\\screen\\"+screenshotname+gettimeStamp()+".jpg"));
	}
	
	public String gettimeStamp()
	{
		Date date = new Date();
	Timestamp time=new Timestamp(date.getTime());
		String stime=time.toString();
		String timestamp=stime.replaceAll(":","-");
	
	return timestamp;
	//System.out.println(timestamp);
	}
	
	
	
	
	
}
 