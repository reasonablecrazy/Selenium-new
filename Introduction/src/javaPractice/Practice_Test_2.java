package javaPractice;

import java.util.List;
import java.util.stream.IntStream;

public class Practice_Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        List<String> names = List.of("Shyam", "Ravi", "Sasi", "Seema", "Boss");
		        
		        names.stream().filter(name -> 
		        				name.matches(".*(.)\\1.*"))
		        				.forEach(name->System.out.println(name));
		       
		    }

}
