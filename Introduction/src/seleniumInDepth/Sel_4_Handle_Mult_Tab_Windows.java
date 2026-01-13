package seleniumInDepth;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

public class Sel_4_Handle_Mult_Tab_Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set <String> handles = driver.getWindowHandles();
		Iterator <String>it = handles.iterator();
		String parentHandle = it.next();
		String childHandle = it.next();
		
		driver.switchTo().window(childHandle);
		driver.get("https://ca.news.yahoo.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement course = wait.until(ExpectedConditions.visibilityOfElementLocated(By.
				xpath("(//p)[1]")));
				
		String courseName;
		 try {        
			 // Interact with the element        
			 courseName = driver.findElement(By.
						xpath("(//p)[1]")).getText();
				System.out.println("I am here 1 " + courseName);

			 } catch (StaleElementReferenceException e) {        
				 // Relocate the element and retry the action        
				 courseName = driver.findElement(By.
							xpath("(//p)[1]")).getText();   
					System.out.println("I am here 2 "+courseName);

				 }
		
		
		driver.switchTo().window(parentHandle);
		WebElement searchQuery = driver.findElement(By.xpath("//input[@name='search_query']"));
		searchQuery.sendKeys(courseName);
		File src = searchQuery.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File ("/Users/naveennarayanan99/Downloads/partSrc.PNG"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
