package seleniumInDepth;
import java.util.Arrays;
import java.util.List;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = {"Naveen", "Reshmi", "Neil", "Nikita"};
		/*
		for(String s:str) {
			System.out.println("The value of the string (str) is : " + s);
		}
		*/
		List<String> arraylist_str = Arrays.asList(str);
		System.out.println("The size of arraylist str is :"+ 
				arraylist_str.size());
		for (int p=0;p<arraylist_str.size();p++) {
			System.out.println("Value of p is : "+arraylist_str.get(p));
		}
		System.out.println("******************");

		
				
		int[] i = {100, 99, 98, 97};
		List<int[]> arraylist_i = Arrays.asList(i );
		System.out.println("The size of arraylist is :"+ arraylist_i.size());
		for (int p=0;p<arraylist_i.size();p++) {
			System.out.println("Value of p is : "+arraylist_i.get(p));
		}
		
		System.out.println("******************");
		for (int j:i) {
			System.out.println("The value of j is : "+j);
		}
	}
}
