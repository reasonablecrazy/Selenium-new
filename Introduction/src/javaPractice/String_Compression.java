package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String [] a= {"a","a","b","b","c","c","c"};
		String [] a= {"a"};
		List<String> ls = new ArrayList<String>(Arrays.asList(a));
		List<String> ls_mod = new ArrayList<String>();
		
		for(String b:ls) {
			int counter = 0;
			for(int i=0;i<ls.size();i++) {
				if(b.equals(ls.get(i))) {
					counter++;
				}
			}
			if(ls_mod.contains(b)) {
				continue;
			}
			else {
				ls_mod.add(b);
				if(counter>1) {
				ls_mod.add(Integer.toString(counter));
				}
			}
		}
		
		System.out.println("List length is : "+ls_mod.size());
		System.out.println(ls_mod);
		
	}

}
