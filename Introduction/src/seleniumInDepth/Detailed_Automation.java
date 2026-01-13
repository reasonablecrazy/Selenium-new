package seleniumInDepth;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Detailed_Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().
		implicitlyWait(Duration.ofMinutes(1));
		
		WebElement currencyDropdown = driver.findElement(By.
				id("ctl00_mainContent_DropDownListCurrency"));
		Select currencyDropdownSelect = new Select(currencyDropdown);
		currencyDropdownSelect.selectByValue("USD");
		System.out.println(currencyDropdownSelect.
				getFirstSelectedOption().getText());
		Assert.assertEquals(currencyDropdownSelect.
				getFirstSelectedOption().getText(),"USD" ,"Expected CAD. But found "+currencyDropdownSelect.
				getFirstSelectedOption().getText());
		
		driver.quit();

	}

}
