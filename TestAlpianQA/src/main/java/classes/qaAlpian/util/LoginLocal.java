package classes.qaAlpian.util;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginLocal {

	private final Logger logger = LoggerFactory.getLogger(LoginLocal.class);

	public void setUp(WebDriver driver, WebDriverWait wait) throws Exception {

		logger.debug("SET PROPERTY");

		System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe");

		logger.debug("BEFORE");
		
		driver.navigate().to("https://computer-database.gatling.io/computers");
		

		logger.debug("LOGIN");

		
	}

}
