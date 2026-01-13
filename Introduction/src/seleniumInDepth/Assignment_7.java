package seleniumInDepth;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		System.out.println("The number of rows : "
				+ driver.findElements(By.xpath("//table[@id='product' and @class='table-display']//tr")).size());

		System.out.println("The number of columns : "
				+ driver.findElements(By.xpath("//table[@id='product' and @class='table-display']//tr//th")).size());

		List<WebElement> ls = driver
				.findElements(By.xpath("//table[@id='product' and @class='table-display']//tr[3]/td"));

		System.out.println();

		for (int i = 0; i < ls.size(); i++) {
			System.out.print(ls.get(i).getText());
			System.out.print("\t");
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.quit();

	}

}
