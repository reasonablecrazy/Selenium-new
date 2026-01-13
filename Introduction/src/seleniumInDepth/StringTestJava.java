package seleniumInDepth;

public class StringTestJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Naveen Narayanan Soman";
		String[]splittedString = s.split(" ");
		
		for (String s1:splittedString){
			System.out.println(s1.trim());
		}
		

	}

}
