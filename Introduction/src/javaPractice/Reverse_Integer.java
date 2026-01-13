package javaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reverse_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		reverse(number);
	}
	
	static void reverse(int number){
		int counter=1;
		List<Integer> ls = new ArrayList<Integer>();
		for(int i=0;i<number;i++) {
			if(number/10>0) {
				counter = counter+1;
				ls.add(number%10);
				number = number/10;
				//int 
			}
			else {
				ls.add(number%10);
				break;
			}
		}
		System.out.println("The number of digits are: "+counter);
		int reverseNumber = 0;
		System.out.println(ls);
		reverseNumber = (int) ((ls.get(counter-1))*Math.pow(10, counter-1));
		System.out.println(reverseNumber);

	}

}
