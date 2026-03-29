package strings_Practice;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//automation -> noitamotua
		
		String str = "automation";
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println(reversed);
		
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}

}
