package chromeDevTools;

import java.time.Duration;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v144.emulation.Emulation;
import org.openqa.selenium.devtools.v144.network.Network;
import org.openqa.selenium.devtools.v144.network.model.Request;
import org.openqa.selenium.devtools.v144.network.model.Response;

public class NetworkActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
		
		devTools.addListener(Network.requestWillBeSent(), request ->
		{
			Request req = request.getRequest();
			//System.out.println(req.getUrl());
		}
		);
		
		//How to capture the events fired
		devTools.addListener(Network.responseReceived(), response ->
		{
			Response resp = response.getResponse();
			//System.out.println(resp.getStatus());
			if(resp.getStatus().toString().startsWith("4")) {
				System.out.println(resp.getUrl()+" is failing with the code: "+resp.getStatus());
			}
		}
		);
		
		
		driver.get("https://google.com");		
		
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
