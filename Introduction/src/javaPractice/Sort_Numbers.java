package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = {2,2,7,6,5};
		Arrays.sort(arr);
		List<Integer> ls = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println(ls);
		
		Integer[] arr1 = {2,2,7,6,5};
		List<Integer> ls1 = new ArrayList<Integer>(Arrays.asList(arr1));
		Collections.sort(ls1);
		System.out.println(ls1);
		Collections.sort(ls1, Collections.reverseOrder());
		System.out.println(ls1);
		
		Integer[] arr2 = {2,2,7,6,5};
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr2[j]>arr2[j+1]) {
					int temp = arr2[j];
					arr2[j]=arr2[j+1];
					arr2[j+1]=temp;
				}		
				else
					continue;
			}
		}
		List<Integer> ls2 = new ArrayList<Integer>(Arrays.asList(arr2));
		System.out.println(ls2);		
	}

}
