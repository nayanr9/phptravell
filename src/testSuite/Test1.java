package testSuite;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseTest.BaseTest;

public class Test1 {
	@Parameters({"browser"})
	@Test(description = "application is working fine")
	public void Login(String browser) {
		BaseTest b = new BaseTest();
//		ScreenShot s = new ScreenShot();
		b.openBrowser(browser);
		b.navigate("http://www.phptravels.net/admin");
//		try {
//			s.captureScreen();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		finally {
//			b.closeApp();
//		}
	}
}
