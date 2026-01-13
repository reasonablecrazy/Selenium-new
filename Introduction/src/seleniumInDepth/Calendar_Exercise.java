package seleniumInDepth;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().
		implicitlyWait(Duration.ofMinutes(1));
		
		driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
		driver.findElement(By.xpath("(//a[@class='ui-state-default'][(text()='6')])[1]")).click();
		//driver.findElement(By.xpath("(//a[@class='ui-state-default'][(text()='6')])[1]")).get

		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();


	}

}
