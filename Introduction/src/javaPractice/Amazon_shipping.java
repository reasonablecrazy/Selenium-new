package javaPractice;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Amazon_shipping {
	
//	static Integer[] weights = {21,22,23,31,32,33,45,46,47,48,38,39,40};
	static Integer[] weights = {21,22,23,31,32,33,45,70,71, 80, 90};

	static List<Integer> ls = new ArrayList<Integer>(Arrays.asList(weights));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int appropriate_weight = sc.nextInt();
		calc(appropriate_weight);
		
	}
	public static void calc(int appropriate_weight ) {
		boolean counter = false;
		int i=0;
		int j=0;
		for(i=0;i<ls.size()-1;i++) {
			for(j=i+1;j<ls.size();j++) {
				if(ls.get(i)+ls.get(j)==appropriate_weight) {
					counter = true;
					System.out.println(i+" th index : Weight "+ls.get(i));
					System.out.println(j+" th index : Weight "+ls.get(j));
					break;
				}
				else
					continue;
			}
			if(counter==true) {
				break;
			}
		}
		
		if(counter==false) {
			System.out.println("There are no weights combination"); ;
		}
		
	}

}
