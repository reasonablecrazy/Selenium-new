package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]str = {"Ravi", "Sasi", "Soman", "Pupu", "Sasi", "Pupu", "Sasi"};
		
		List<String> ls = new ArrayList<String>(Arrays.asList(str));
		List<String> ls_duplicate = new ArrayList<String>();

		int j = str.length;
		int p;
		
		for(String s:ls) {
			p=0;			
			
			
			for (int i=0;i<ls.size();i++) {
				
				if (s.equals(str[i])) {
					p++;
				}
				else {
					continue;
				}
			}
			
			if(p>1) {
				
				if(ls_duplicate.contains(s)) {
					continue;
				}
				
				else {
					System.out.println("Value "+s+" is a duplicate and it repeats "+p+" times");
					ls_duplicate.add(s);
				}			
			}
		}
		
		

	}

}
