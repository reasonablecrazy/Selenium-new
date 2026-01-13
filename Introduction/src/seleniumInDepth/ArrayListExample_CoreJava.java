package seleniumInDepth;
import java.util.ArrayList;

public class ArrayListExample_CoreJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arrlis = new ArrayList();
		System.out.println(arrlis);
		arrlis.add("Narayanan");
		arrlis.add(("Naveen"));
		for (int i=0;i<2;i++) {
			System.out.println(arrlis.get(i));
		}
		
		ArrayList<String> arrlis1 = new ArrayList();
		//arrlis1.add(1);
		arrlis1.add(("Naveen"));
		arrlis1.add(("Narayanan"));
		int j = arrlis1.size();
		System.out.println("Size of arrlis1 is "+j);
		
		//arrlis1.addAll("Sasi","Soman", "Ulla");
		//arrlis1.ad
		
		for(String s:arrlis1) {
			System.out.println("The value of arrlis is "+s);
		}
		
	}
}
