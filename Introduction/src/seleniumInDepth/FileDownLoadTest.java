package seleniumInDepth;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FileDownLoadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement priceApple = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.
						xpath("//div[text()='Apple']/parent::div/following-sibling::div[2]/div")));
		WebElement downloadButton = driver.findElement(By.id("downloadButton"));
		downloadButton.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File f = new File("//Users//naveennarayanan99//Downloads//download.xlsx");
		if(f.exists()) {
			System.out.println("File downloaded successfully");
			if(f.delete()) {
				System.out.println("File deleted successfully");
			}
		} else {
			Assert.fail("File not downloaded");
		}
		
		driver.quit();

	}

}
