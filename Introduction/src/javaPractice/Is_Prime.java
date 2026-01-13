package javaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Is_Prime {
	
	static List <Integer> ls = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		ls.add(2);
		
		for(int i=3;i<=input;i++) {
			isPrime(i);
		}
		
		System.out.println(ls);

	}

	private static void isPrime(int i) {
		// TODO Auto-generated method stub
		int j;
		
		for(j=2;j<i;j++) {
			if(i%j == 0) {
				break;
			}
			else
				continue;
		}	
		
		if(i==j) {
			ls.add(i);

		}		
		
	}
	

}
