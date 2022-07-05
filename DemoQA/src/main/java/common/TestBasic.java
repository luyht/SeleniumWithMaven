package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBasic {
	public WebDriver driver;

	public void openWebsite(String url) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\01Automation\\01Tools\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}

	public void closeBrowser() {
		driver.quit();// close toàn bộ cửa sổ
	}

	public By getLocatorString(String locatorType, String locatorValue) {
		By result = null;

		return result;

	}
}
