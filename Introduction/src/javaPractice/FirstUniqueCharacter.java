package javaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int counter =0;
		List <Character> ls = new <Character> ArrayList();
		for (int i=0;i<input.length();i++) {
			ls.add(input.charAt(i));
		}
		
		for (char ch:ls) {
			counter =0;
			int i;
			for(i=0;i<ls.size();i++) {
				if(ch==ls.get(i)) {
					counter++;
				}
			}
			if(counter==1) {
				System.out.println(ch);
				System.out.println(ls.indexOf(ch));
				break;
			}
			else {
				continue;
			}
		}
		

	}

}
