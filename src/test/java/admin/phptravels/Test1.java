package admin.phptravels;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseTest.BaseTest;

public class Test1 {
	@Parameters({"browser"})
	@Test(description = "application is working fine")
	public void Login(String browser) {
		BaseTest b = new BaseTest();
		b.openBrowser(browser);
		b.navigate("http://www.phptravels.net/admin");
		
		b.closeApp();
	}
}
