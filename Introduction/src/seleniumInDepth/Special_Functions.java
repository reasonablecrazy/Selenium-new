package seleniumInDepth;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Special_Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchQuery = driver.findElement(By.xpath("//input[@name='search_query']"));
		searchQuery.sendKeys("Name");
		System.out.println(searchQuery.getSize());
		System.out.println(searchQuery.getSize().height);
		System.out.println(searchQuery.getSize().width);
		System.out.println(searchQuery.getSize().getHeight());
		System.out.println(searchQuery.getSize().getWidth());
		System.out.println(searchQuery.getRect());
		System.out.println(searchQuery.getRect().height);
		System.out.println(searchQuery.getRect().width);
		System.out.println(searchQuery.getRect().getHeight());
		System.out.println(searchQuery.getRect().getWidth());
		System.out.println(searchQuery.getRect().getDimension());







		
		driver.quit();
	}

}
