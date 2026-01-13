package javaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class First_nonrepeating_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str_input = sc.nextLine();
		List<Character> ls = new ArrayList<Character>();
		
		for(int i=0;i<str_input.length();i++) {
			ls.add(str_input.charAt(i));
		}
		
		int i;
		for(i=0;i<ls.size()-1;i++) {
				
			if(ls.get(i).equals(ls.get(i+1))) {
				System.out.println("The repeating chara is : "+ls.get(i));;
				break;
			}
			else {
				continue;
			}
		}
		if(i==(ls.size()-1)) {
			System.out.println("There are no repearting characters");;
		}
	}

}
