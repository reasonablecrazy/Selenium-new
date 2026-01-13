package seleniumInDepth;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dynamic_Xpath_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().
		implicitlyWait(Duration.ofMinutes(1));
		
		WebElement fromDropdownMain = driver.findElement(By.
				id("ctl00_mainContent_ddl_originStation1_CTXT"));
		fromDropdownMain.click();
		
		WebElement fromDropdownCOK = driver.findElement(By.
				cssSelector("a[value='COK']"));
		fromDropdownCOK.click();
		
		
		WebElement fromDropdownMAA = driver.findElement(By.
		 xpath("(//a[@value='MAA'])[2]"));
		fromDropdownMAA.click();
		
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}

}
