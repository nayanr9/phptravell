package admin.phptravels;

import org.testng.annotations.Test;

import baseTest.BaseTest;

public class Test1 {
  @Test
  public void Login() {
	  BaseTest b = new BaseTest();
	  b.openBrowser("chrome");
	  b.navigate();
  }
}
