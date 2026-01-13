package seleniumInDepth;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsForJavaSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = initiate();
		load("https://ca.news.yahoo.com/", driver);
		getTitle(driver);
		close(driver);
	}
	
	public static WebDriver initiate() {
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static void getTitle(WebDriver driver) {
		String s = driver.getTitle();
		System.out.println(s);
	}
	
	public static void load (String s, WebDriver driver){
	driver.get(s);
	return;
	}
	
	public static void close(WebDriver driver) {
		driver.quit();
	}
		

}
