package seleniumInDepth;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().
		implicitlyWait(Duration.ofMinutes(1));
		
		List <WebElement> options = driver.findElements(By.cssSelector("input[id*='checkBoxOption']"));
		System.out.println("The number of checkboxes are: "+options.size());
		
		WebElement option = driver.findElement(By.cssSelector("input[id*='checkBoxOption']"));
		option.click();
		
		Assert.assertTrue(option.isSelected());
		option.click();

		Assert.assertFalse(option.isSelected());
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.quit();

	}

}
