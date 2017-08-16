package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	public WebDriver driver;

	public void openBrowser(String browser) {
		System.out.println("browser name: " + browser);
		String osName = System.getProperty("os.name");
		String projectPath = System.getProperty("user.dir");
		System.out.println(osName);
		if (osName.contains("Window")) {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
		}
		else if (osName.contains("Mac")) {
			if (browser.equalsIgnoreCase("chrome")) {
//				System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
//				System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
		}
	}

	public void navigate(String url) {
		driver.get(url);
	}

	public void closeApp() {
		driver.quit();
	}

	// public static void main(String[] args) {
	// BaseTest b = new BaseTest();
	// System.err.println("open browser");
	// b.openBrowser("chrome");
	// System.err.println("browser is there");
	// b.navigate("http://google.com");
	// b.closeApp();
	// }
}
