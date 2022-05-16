package classes.qaAlpian.util;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.mito.ui.automation.classes.incident.IncidentParentChild;

@SuppressWarnings("unused")
public class Logout {
	
	private  final Logger logger = LoggerFactory.getLogger(IncidentParentChild.class);

	public void logout(WebDriver driver, WebDriverWait wait) throws Exception {
	
			driver.quit();
			
			logger.debug("QUIT SUCCESS");
			System.out.println("TEST OK");

			}

		}