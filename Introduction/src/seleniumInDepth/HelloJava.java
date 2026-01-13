package seleniumInDepth;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class HelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoke browser
		//ChromeDriver-Methods
		//ChromeDriver driver1 = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ca.news.yahoo.com/");
		System.out.println("Welcome to selenium java");	
		System.out.println(driver.getTitle());	
		int i; 
		int[]j = new int[6];
		j[1]=100;
		int[] arr = {1,89,98,0,5,9999};
		for(int p=0;p<arr.length;p++) {
			System.out.println(j[p]);	
			System.out.println(arr[p]);
			}
		
		//int a = 1;
		for (int a=1;a<10;a++) {
			int b=a++;
			int c=++a;
			System.out.println("value of a: "+a);
			System.out.println("value of b: "+b);
			System.out.println("value of c: "+c);
		}
		
		driver.close();
		driver.quit();
	}

}
