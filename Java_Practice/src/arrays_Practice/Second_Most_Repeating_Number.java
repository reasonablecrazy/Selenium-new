package arrays_Practice;

import java.util.HashMap;
import java.util.Map;

public class Second_Most_Repeating_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Input:
[4, 5, 6, 4, 6, 4, 5, 6, 6]

Frequency:
6 → 4
4 → 3
5 → 2

Second most repeating number:
4
		 */
		
		Integer[]arr = {4, 5, 6, 4, 6, 4, 5, 6, 6};
		
		int first = 0;
		int second = 0;
		Map <Integer,Integer>map = new HashMap();
		for(int num:arr) {
			int count = 0;
			for(int i=0;i<arr.length;i++) {
				if(num==arr[i]) {
					count++;
				}
			}	
			if(count>first) {
				second = first;
				first = count;
			}
			map.put(count, num);
		}
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(map);
		
		System.out.println("The number "+map.get(second)+" repeats "+second+" times");
	}

}
