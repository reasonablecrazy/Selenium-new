package javaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Non_Repeating_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str_input = sc.nextLine();
		List<Character> ls = new ArrayList<Character>();
		List<Character> ls_duplicate = new ArrayList<Character>();

		
		int j = str_input.length();
		
		for(int i=0;i<j;i++) {
			ls.add(str_input.charAt(i));}
		
		for(char ch:ls) {
			int counter = 0;
			for(int i=0;i<ls.size();i++) {
				if(ch==ls.get(i)) {
					counter++;
				}
				else
					continue;
			}
			
			if(ls_duplicate.contains(ch)){
				continue;
			}
			else {
				System.out.println("The character "+ch+" repeats "+counter+" times.");
				ls_duplicate.add(ch);
			}
			
		}

}
}