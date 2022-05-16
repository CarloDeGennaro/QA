package classes.qaAlpian.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Set {

	public static ChromeOptions options;
	public static WebDriver driver;
	public static WebDriverWait wait;

	private static final Logger logger = LoggerFactory.getLogger(Set.class);

	public WebDriver SetMethod() throws Exception {
		

		logger.debug("SET PROPERTY");
		
		System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe/");
		

		options = new ChromeOptions();
		options.addArguments("--start-maximized");
//		options.addArguments("--headless");

		//options tra parentesi, servono per jenkins
		driver = new ChromeDriver(options); 

		wait = new WebDriverWait(driver, 20);
		return driver;

	}

}
