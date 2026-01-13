package javaPractice;

import java.util.Scanner;

public class Paliandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int j = s.length();
		int i=0;
		
		for(i=0;i<s.length();i++, j--) {
			if (s.charAt(i)==s.charAt(j-1)){
				System.out.println("Value of i is "+i+" and the value of j is "+j);
				continue;
			}
			else {
				System.out.println("Given string is not a pliandrome");
				break;
			}
		}
		if (i==s.length()) {
			System.out.println("Given string is a palinadrome");
		}
	}

}
