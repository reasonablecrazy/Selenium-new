package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day_One_Basics_4 {
	@Test
	public void Hello13() {		
		System.out.println("Hello 13");
	}
	
	@Test(groups={"smoke"})
	public void Mobile14() {
		System.out.println("Mobile 14");
	}
	
	@Test
	public void Mobile15() {
		System.out.println("Mobile 15");
	}
	
	@Test(groups={"manual","smoke"})
	public void Hello16() {
		System.out.println("Hello 16");
		Assert.fail();
	}
	
	
}
