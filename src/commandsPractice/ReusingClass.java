package commandsPractice;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ReusingClass {
	
	public void reuse(WebDriver driver,String xy) throws IOException
	{

	File file=((TakesScreenshot)driver).getScreenshotAs((OutputType.FILE));
	FileUtils.copyFile(file,new File("C:\\harish\\selenium\\workspace\\seleniumLearning\\screen\\"+xy+timestamp()+".png"));
		
	}
	
	public String timestamp()
	{
		Date d=new Date();
		Timestamp stamp=new Timestamp(d.getTime());
		String time=stamp.toString();
		String y=time.replaceAll(":", "-");
		/*System.out.println(stamp);*/
		return y;
		
	}

	
	
	
	
	/*public static void main(String[] args)
	{
		ReusingClass r=new ReusingClass();
		r.timestamp();
	*/
	
	}


