package seleniumInDepth;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class GreenKart_Practice_searchAnadCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		options.addArguments("--disable-gpu");
		options.addArguments("--window-size=1920,1080");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		String searchInput = "Rice";
		driver.findElement(By.id("search-field")).sendKeys(searchInput);		
		List <WebElement> items = driver.findElements(By.xpath("//tr/td[1]"));				
		List<WebElement>searchedItems = items.stream().filter(item->item.getText().contains(searchInput)).collect(Collectors.toList());		
		List<String>searchedItemsPrice = searchedItems.stream().map(item->findThePrice(item)).collect(Collectors.toList());		
		
		Assert.assertEquals(searchedItemsPrice.get(0),"37", "Expected 37. But found "+
				searchedItemsPrice.get(0));
		
		driver.quit();
			
	}

	private static String findThePrice(WebElement result) {
		// TODO Auto-generated method stub
		String price = result.findElement(By.xpath("following-sibling::td[1]")).getText();
		System.out.println(price);
		return price;
	}

}
