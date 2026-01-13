package seleniumInDepth;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PageWithBrokenLinks {
	
	static SoftAssert a = new SoftAssert();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		options.addArguments("--disable-gpu");
		options.addArguments("--window-size=1920,1080");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List <WebElement> ls_a = driver.findElements(By.tagName("a"));
		for (WebElement link:ls_a) {
			isBroken(link);
		}
		a.assertAll();
	}

	private static void isBroken(WebElement link) {
		// TODO Auto-generated method stub
		String url = link.getAttribute("href");
		try {
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			a.assertTrue(respCode<400, "Link "+url+" associated with the webelement "+link.getText()
			+" is broken. Response Code is "+respCode);
			if(respCode<400) {
				System.out.println("Link "+url+" associated with the webelement "+link.getText()
				+" is working as expected. Response Code is "+respCode);
				return;
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}

}
