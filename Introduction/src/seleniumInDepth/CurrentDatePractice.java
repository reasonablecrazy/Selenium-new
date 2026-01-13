package seleniumInDepth;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentDatePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriver driver = new ChromeDriver();
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");
		String formattedDate = currentDate.format(formatter);
		System.out.println(currentDate);
		System.out.println(formattedDate);

	}

}
