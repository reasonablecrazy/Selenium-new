package seleniumInDepth;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Assignment_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));

		driver.findElement(By.id("autocomplete")).sendKeys("can");

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@class='ui-menu-item']//div[text()='Canada']"))).click()
				.build().perform();

		Assert.assertEquals(driver.findElement(By.id("autocomplete")).getAttribute("value"), "Canada");

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.quit();

	}

}
