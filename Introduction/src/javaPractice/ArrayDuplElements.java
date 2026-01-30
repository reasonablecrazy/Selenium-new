package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDuplElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"naveen","narayanan","naveen","nithin","mohan","naveen"};
		ArrayList <String>ls = new ArrayList(Arrays.asList(arr));
		
		//ArrayList ls_mod = (ArrayList) ls.stream().distinct().collect(Collectors.toList());
		//System.out.println(ls_mod);
		
		ArrayList<String> ls_updated = new ArrayList();
		
		for(String str:ls) {
			if(ls_updated.contains(str)) {
				continue;
			}
			else {
				ls_updated.add(str);
			}
		}
		System.out.println(ls_updated);
		
		String original = "Everything is planned";
		StringBuilder sb = new StringBuilder(original);
		sb.reverse();
		System.out.println(sb);
		
		//original.sta
	}

}
