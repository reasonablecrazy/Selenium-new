package javaPractice;

import java.util.Scanner;

public class String_Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		String input_replace = input.replace(".", "[.]");
		System.out.println(input_replace);

	}

}
