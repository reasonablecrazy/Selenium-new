package seleniumInDepth;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		// driver.manage().wait();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));

		WebElement name = driver.findElement(By.cssSelector("input[name='name']"));
		name.sendKeys("Sasi");

		WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
		email.sendKeys("Sasi@gmail.com");

		WebElement password = driver.findElement(By.id("exampleInputPassword1"));
		password.sendKeys("pupu");

		WebElement examplecheck = driver.findElement(By.id("exampleCheck1"));
		examplecheck.click();

		WebElement gender = driver.findElement(By.id("exampleFormControlSelect1"));
		Select gender1 = new Select(gender);
		gender1.selectByVisibleText("Female");

		WebElement empStatus = driver.findElement(By.xpath("//*[text()='Student']"));
		empStatus.click();

		WebElement dob = driver.findElement(By.cssSelector("input[type='date']"));
		dob.sendKeys("2025-06-25");

		WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
		submitButton.click();
		// submitButton.

		WebElement alertMessage = driver.findElement(By.cssSelector("div.alert.alert-success.alert-dismissible"));
		System.out.println(alertMessage.getText());

		// driver.switchTo().alert().

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.quit();

	}

}
