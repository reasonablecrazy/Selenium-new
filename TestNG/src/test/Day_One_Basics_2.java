package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day_One_Basics_2 {
	@Test
	public void Hello5() {		
		System.out.println("Hello 5");
	}
	
	@Test
	public void Hello6() {
		System.out.println("Hello 6");
	}
	
	@Test
	public void Hello7() {
		System.out.println("Hello 7");
	}
	
	@Test(groups={"smoke","regression"})
	public void Hello8() {
		System.out.println("Hello 8");
	}
	
	@BeforeTest
	public void MyBeforeTestMethod() {
		System.out.println("This is my Before Test Method");
	}
	
	@AfterTest
	public void MyAfterTestMethod() {
		System.out.println("This is my After Test Method");
	}
}
