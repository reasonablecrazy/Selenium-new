package test;

import org.testng.annotations.Test;

public class Day_One_Basics_3 {
	@Test
	public void Hello9() {		
		System.out.println("Hello 9");
	}
	
	@Test
	public void Hello10() {
		System.out.println("Hello 10");
	}
	
	@Test(groups={"smoke","manual"})
	public void Hello11() {
		System.out.println("Hello 11");
	}
	
	@Test
	public void Hello12() {
		System.out.println("Hello 12");
	}
}
