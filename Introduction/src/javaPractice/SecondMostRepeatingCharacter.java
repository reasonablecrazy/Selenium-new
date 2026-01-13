package javaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondMostRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		List<Character> ls = new ArrayList<Character>();
		List<Character> ls_unique = new ArrayList<Character>();
		List<Integer> count = new ArrayList<Integer>();
		
		for(int i=0;i<string.length();i++) {
			ls.add(string.charAt(i));
		}
		
		for(int i=0;i<string.length();i++) {
			int counter=0;
			for(int j=0;j<string.length();j++) {
				if(ls.get(i).equals(ls.get(j))) {
					counter++;
				}
				else {
					continue;
				}
			}
			if(ls_unique.contains(ls.get(i))) {
				continue;
			}
			else {
				count.add(counter);
				ls_unique.add(ls.get(i));
			}
			
		}
		
		System.out.println(ls);
		System.out.println(ls_unique);
		System.out.println(count);
		
		int highest =0, secondHighest = 0;
		
		for(int j=0;j<count.size();j++) {
			if(count.get(j)>highest) {
				secondHighest=highest;
				highest = count.get(j);
			}
			else if((count.get(j)<highest)&&(count.get(j)>secondHighest)){
				secondHighest = count.get(j);
			}
			else
				continue;
		}
		
		System.out.println(highest);
		System.out.println(secondHighest);
		
		int indexSecondHighest = count.indexOf(secondHighest);
		System.out.println("The second hightest is : "
				+ls_unique.get(indexSecondHighest)+" and it repeats "
				+secondHighest+" times.");

	}

}
