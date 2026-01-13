package seleniumInDepth;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		WebElement username = wait.until(ExpectedConditions.
				visibilityOf(driver.findElement(By.id("username"))));
		
		username.sendKeys("rahulshettyacademy");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("learning");
		
		WebElement userRadio = driver.findElement(By.xpath("//span[@class='radiotextsty'][text()=' User']"));
		userRadio.click();
		
		WebElement okayButton = wait.until(ExpectedConditions.
				visibilityOf(driver.findElement(By.id("okayBtn"))));
		
		okayButton.click();
		//wait.until(ExpectedConditions.alertIsPresent());		
		//driver.switchTo().alert().accept();
		
		WebElement selectDropdown = driver.findElement(By.cssSelector("select.form-control"));
		Select selectDropdown1 = new Select(selectDropdown);
		selectDropdown1.selectByValue("consult");
		
		WebElement terms = driver.findElement(By.id("terms"));
		terms.click();
		
		WebElement submitButton = driver.findElement(By.id("signInBtn"));
		submitButton.click();
		
		WebElement checkoutButton = wait.until(ExpectedConditions.
				elementToBeClickable(driver.findElement(By.
						cssSelector("a.nav-link.btn.btn-primary"))));
		
		List<WebElement> addButtons = driver.findElements(By.xpath("//button[text()='Add ']"));
		for(WebElement addButton:addButtons) {
			addButton.click();
		}
		
		checkoutButton.click();
		
		WebElement continueShoppingButton = wait.until(ExpectedConditions.
				elementToBeClickable(driver.findElement(By.
						cssSelector("button[class='btn btn-default']"))));
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Test case has passed");
		
		driver.quit();

	}

}
