package classes.qaAlpian;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AddNewComputer {

	private static final Logger logger = LoggerFactory.getLogger(AddNewComputer.class);

	public void AddNewComputerMethod(WebDriver driver, WebDriverWait wait) throws Exception {

		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.id("add")).click();
		
		logger.info("add pc");
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("NomeComputer");
	
		driver.findElement(By.id("introduced")).click();
		driver.findElement(By.id("introduced")).clear();
		driver.findElement(By.id("introduced")).sendKeys("1960-01-01");
		
		driver.findElement(By.id("discontinued")).click();
		driver.findElement(By.id("discontinued")).clear();
		driver.findElement(By.id("discontinued")).sendKeys("1960-02-02");
		
		WebElement selectElement = driver.findElement(By.id("company"));
		Select selectObject = new Select(selectElement);
		selectObject.selectByValue("1");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String textAddComputer = driver.findElement(By.xpath("//div[@class='alert-message warning']")).getText();
		System.out.println(textAddComputer);
		String ExpectedTitle = "Computer NomeComputer has been created";
		if(!textAddComputer.contains(ExpectedTitle))
			throw new Exception("Computer has not been created");
		//can be handled with assertion too

	}
}