package seleniumInDepth;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import dev.failsafe.internal.util.Assert;
import org.testng.asserts.*;





public class Assertion_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testng.org/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement footerNote = driver.findElement(By.
				xpath("//h1"));
		
		System.out.println(footerNote.getText());
		
		Assert.assertEquals(footerNote.getText(), "TestNG Documentatio", "The test has failed");
		
		driver.quit();

	}

}
