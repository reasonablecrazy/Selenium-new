package javaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		List<Character> ls = new ArrayList<Character>();
		List<Character> ls_reverse = new ArrayList<Character>();

		for(int i=0;i<string.length();i++) {
			ls.add(string.charAt(i));
		}
		
		for(int i=ls.size()-1;i>=0;i--) {
			ls_reverse.add(ls.get(i));
		}
		
		String s_rev="";
		for(int i=0;i<ls_reverse.size();i++) {
			s_rev = s_rev+ ls_reverse.get(i);
		}
		
				
		System.out.println(s_rev);
		
		StringBuilder rev = new StringBuilder(string).reverse();
		System.out.println(rev);

	}

}
