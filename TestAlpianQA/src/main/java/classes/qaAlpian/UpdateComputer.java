package classes.qaAlpian;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class UpdateComputer {

	private static final Logger logger = LoggerFactory.getLogger(UpdateComputer.class);
	private String updatePcName = "newpcname";
	public void UpdateComputerMethod(WebDriver driver, WebDriverWait wait) throws Exception {

		logger.info("search for a pc");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a")).click();

		logger.info("update pc name");
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys(updatePcName);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String textUpdateComputer = driver.findElement(By.xpath("//div[@class='alert-message warning']")).getText();
		System.out.println(textUpdateComputer);
		String ExpectedTitle = "Computer "+updatePcName+" has been updated";
		System.out.println(ExpectedTitle);
		if(!textUpdateComputer.contains(ExpectedTitle))
			throw new Exception("Computer has not been deleted");
		//can be handled with assertion too
		
	}
}