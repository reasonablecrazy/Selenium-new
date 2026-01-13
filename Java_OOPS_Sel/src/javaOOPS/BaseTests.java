package javaOOPS;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTests {
	
	static WebDriver driver;
	static WebDriverWait wait;
	
	@Test
	@Parameters("url")
	public void landingPage_Login(String url){
		driver.get(url);
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@aria-label='Search1']")));
	}
	
	@BeforeTest
	@Parameters("headless1")
	public void setUP(String headless) {
		if(headless.equalsIgnoreCase("headless")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless=new");
			options.addArguments("--disable-gpu");
			options.addArguments("--window-size=1920,1080");
			driver = new ChromeDriver(options);
		}
		else {
			driver = new ChromeDriver();
		}
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	@AfterTest
	public void cleanUP() {
		driver.quit();
	}
	
	public WebDriver getDriver(){
		return driver;	
	}

}
