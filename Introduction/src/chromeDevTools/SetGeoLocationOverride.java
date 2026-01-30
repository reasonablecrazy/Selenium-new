package chromeDevTools;

import java.time.Duration;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v144.emulation.Emulation;

public class SetGeoLocationOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		devTools.send(Emulation.setGeolocationOverride(Optional.of(40), Optional.of(3), 
				Optional.of(1), Optional.empty(), Optional.empty(), Optional.empty(), 
				Optional.empty()));
		
		driver.get("http://google.com");		
		
		driver.findElement(By.name("q")).sendKeys("netflix",Keys.ENTER);
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();

	}

}
