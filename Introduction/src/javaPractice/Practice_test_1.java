package javaPractice;
import java.util.List;
import java.util.stream.IntStream;



public class Practice_test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        List<String> names = List.of("Shyam", "Ravi", "Sasi", "Seema", "Boss");
		        
		        names.stream().filter(name -> 
		        				IntStream.range(0, name.length()-1).anyMatch(i -> 
		        				name.charAt(i)==name.charAt(i+1))
		        ).forEach(name -> System.out.println(name));
		       
		    }
	}
