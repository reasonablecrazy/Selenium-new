package test;

import org.testng.annotations.Test;

public class Day_One_Basics_1 {

	@Test
	public void Hello1() {		
		System.out.println("Hello 1");
	}
	
	@Test(groups="smoke")
	public void Hello2() {
		System.out.println("Hello 2");
	}
	
	@Test(groups={"smoke","sanity"})
	public void Hello3() {
		System.out.println("Hello 3");
	}
	
	@Test
	public void Hello4() {
		System.out.println("Hello 4");
	}

}
