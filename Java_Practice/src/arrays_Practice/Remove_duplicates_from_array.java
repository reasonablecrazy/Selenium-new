package arrays_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Remove_duplicates_from_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Input:[1, 2, 3, 2, 4, 1, 5]

Expected Output:[1, 2, 3, 4, 5]
		 */
		
		Integer[]init = {5, 1, 2, 3, 2, 4, 1, 5};
		List <Integer> initList = new ArrayList(Arrays.asList(init));
		List <Integer>distinctList = new ArrayList();
		
		for(int i=0;i<initList.size();i++) {
			if(!(distinctList.contains(initList.get(i)))) {
				distinctList.add(initList.get(i));
			}
		}
		
		System.out.println(distinctList);
		
		Set <Integer>set = new LinkedHashSet(initList);
		System.out.println(set);
		
		TreeSet set1 = new TreeSet(initList);
		System.out.println(set1);
		
	}
}
