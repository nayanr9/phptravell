package generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	public void captureScreen(WebDriver driver) throws IOException {
		System.out.println("inside screenshot1");
		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "/screenshot/abc.png");
		FileUtils.copyFile(src, dest);
		System.out.println("Screenshot has been taken.");
	}
	
//	public static void main(String[] args) throws IOException{
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		ScreenShot s = new ScreenShot();
//		driver.get("http://google.com");
//		s.captureScreen(driver);
//		
//	}

}
