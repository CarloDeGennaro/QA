package classes.qaAlpian;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SearchAndDeleteComputer {

	private static final Logger logger = LoggerFactory.getLogger(SearchAndDeleteComputer.class);
	private String pc = "Amiga";
	public void SearchAndDeleteComputerMethod(WebDriver driver, WebDriverWait wait) throws Exception {

		logger.info("search for a pc");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.id("searchbox")).click();
		driver.findElement(By.id("searchbox")).clear();
		driver.findElement(By.id("searchbox")).sendKeys(pc);
		
		driver.findElement(By.id("searchsubmit")).click();
		
		driver.findElement(By.linkText(pc)).click();
		
		
		logger.info("delete pc");
		driver.findElement(By.xpath("//input[@class='btn danger']")).click();
		

		String textDeleteComputer = driver.findElement(By.xpath("//div[@class='alert-message warning']")).getText();
		System.out.println(textDeleteComputer);
		String ExpectedTitle = "Computer "+pc+" has been deleted";
		System.out.println(ExpectedTitle);
		if(!textDeleteComputer.contains(ExpectedTitle))
			throw new Exception("Computer has not been deleted");
		//can be handled with assertion too
		
	}
}