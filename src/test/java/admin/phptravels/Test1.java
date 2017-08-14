package admin.phptravels;

import org.testng.annotations.Test;

import baseTest.BaseTest;

public class Test1 {
  @Test(description="application is working fine")
  public void Login() {
	  BaseTest b = new BaseTest();
	  b.openBrowser("chrome");
	  b.navigate("http://google.com");
	  b.closeApp();
  }
}
