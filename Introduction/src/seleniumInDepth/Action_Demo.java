package seleniumInDepth;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Action_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
		driver.manage().timeouts().
		implicitlyWait(Duration.ofMinutes(1));
		
		WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
		Actions a = new Actions(driver);
		
		a.moveToElement(searchField).click().
			keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
//		String clickCommandEnter = Keys.chord(Keys.COMMAND,Keys.ENTER);
//		searchField.sendKeys(clickCommandEnter);
//		a.moveToElement(searchField).click().keyDown(clickCommandEnter).sendKeys("trt").build().perform();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.quit();

	}

}
