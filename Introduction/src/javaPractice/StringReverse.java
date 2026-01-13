package javaPractice;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s_int = sc.nextLine();
		String s_rev = "";
		int j = s_int.length();
		System.out.println("Length of s_int is: "+j);

		
		for (int p=(s_int.length());p>=1;p--) {
			String s = s_int.substring(p-1, p);
			System.out.println("Value of s is: "+s);
			s_rev=s_rev+s;
			System.out.println("The current value of s_rev is : "+s_rev);
		}
		
		System.out.println("The final value of s_rev is : "+s_rev);

	}

}
