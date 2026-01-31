package seleniumInDepth;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import java.util.List;
import java.util.Optional;

public class HandleWindowsAuthentication {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://admin:admin@the-internet.herokuapp.com");
        driver.findElement(By.linkText("Basic Auth")).click();
        driver.quit();
    }
}