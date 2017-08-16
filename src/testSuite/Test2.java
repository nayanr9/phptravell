package testSuite;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseTest.BaseTest;

public class Test2 {
	@Parameters({"browser"})
	@Test(description = "application is working fine")
	public void Login(String browser) throws IOException {
		BaseTest b = new BaseTest();
//		ScreenShot s = new ScreenShot();
		b.openBrowser(browser);
		b.navigate("http://www.google.com");
//		s.captureScreen(driver);
	}
}
