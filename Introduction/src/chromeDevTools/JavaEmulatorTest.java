package chromeDevTools;

import java.time.Duration;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v144.emulation.Emulation;
import org.openqa.selenium.devtools.v144.network.Network;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public class JavaEmulatorTest {

	public static void main(String[] args) {

		//note that we are not using web driver. It does not have the 
		//methods that chrome driver supports
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		//send command to CDP methods. 
		devTools.send(Emulation.setDeviceMetricsOverride(430, 932, 3, true, 
				Optional.empty(), Optional.empty(), Optional.empty(), 
				Optional.empty(), Optional.empty(), Optional.empty(), 
				Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));

		driver.get("https://www.espncricinfo.com/");
		driver.findElement(By.xpath("(//a[@href=\"/\"])[1]/preceding-sibling::i")).click();
		
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.switchTo().alert().sendKeys(null)
		
		LogEntries logentries = driver.manage().logs().get(LogType.BROWSER);
		List<LogEntry> logs = logentries.getAll();
		
		for (LogEntry le:logs) {
			System.out.println(le.getMessage());
		}
		
		driver.quit();

	}

}
