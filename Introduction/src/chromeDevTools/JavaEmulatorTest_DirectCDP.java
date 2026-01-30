package chromeDevTools;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v144.emulation.Emulation;

public class JavaEmulatorTest_DirectCDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		//send command to CDP methods. 
		Map arguements = new HashMap();
		arguements.put("width", 430);
		arguements.put("height", 932);
		arguements.put("deviceScaleFactor", 3);
		arguements.put("mobile", true);
		
		System.out.println(arguements);
		
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", arguements);

		driver.get("https://www.espncricinfo.com/");
		driver.findElement(By.xpath("(//a[@href=\"/\"])[1]/preceding-sibling::i")).click();
		
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();

	}

}
