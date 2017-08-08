package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	public WebDriver driver;
	
	public void openBrowser(String browser){
		if(System.getProperty("os.name").equals("Window")){
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+
						"/drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}
		}
	}
	
	public void navigate(){
		driver.get("http://google.com");
	}
}
