package commandsPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {
	public void screenshot(WebDriver driver, String screenshotName ) throws IOException
	{
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.moveFile(file, new File("C:\\harish\\selenium\\workspace\\seleniumLearning\\screenshots\\"+screenshotName+".jpg"));
		
	}

}
