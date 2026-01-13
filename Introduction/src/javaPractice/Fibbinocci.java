package javaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		List <Integer> ls = new ArrayList();
		
		int counter=1;
		ls.add(0);
		ls.add(1);

		
		for(int j=2;counter<limit;j++) {
			counter = ls.get(j-2)+ls.get(j-1);
			if(counter<limit) {
				ls.add(counter);
			}
			else
				break;
		}
		
		System.out.println(ls);

	}

}
