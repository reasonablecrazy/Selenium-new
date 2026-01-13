package seleniumInDepth;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment_6_MultiplePageObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().
		implicitlyWait(Duration.ofMinutes(1));
		
		driver.findElement(By.id("checkBoxOption2")).click();
		String selectedOption = driver.findElement(By.
				xpath("//input[@id='checkBoxOption2']//parent::label")).getText().trim();
		WebElement selectOptionDropdown = driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(selectOptionDropdown);
		select.selectByVisibleText(selectedOption);
		driver.findElement(By.id("name")).sendKeys(selectedOption);
		driver.findElement(By.id("alertbtn")).click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		Assert.assertTrue(alertText.contains(selectedOption), "Expected "+selectedOption+" but found "+alertText);

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.quit();

	}

}
