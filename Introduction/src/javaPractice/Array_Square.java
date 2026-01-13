package javaPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]arr = {
				{0,1,0,0,1,1,1,1},
				{1,1,1,1,1,1,1,1},
				{0,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1},
				{0,1,0,1,0,1,0,1}
				};
		int m = arr[0].length;
		System.out.println(m);
		int n = arr.length;
		System.out.println(n);
		
		List<Integer> ls = new ArrayList<Integer>();
		List<Integer> ls_i = new ArrayList<Integer>();
		List<Integer> ls_j = new ArrayList<Integer>();


	
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				int dimention = 1;
				
				try {
					if(arr[i][j]==0) {
						continue;
					}
					else {
						int a = i;
						int b = j;
						while((arr[a][b+1]==1)&&(arr[a+1][b]==1)&&(arr[a+1][b+1]==1)) {
							dimention++;
							a++;
							b++;
						}
				}
				}
				catch(ArrayIndexOutOfBoundsException e) {
					continue;
				}	
				ls.add(dimention);
				ls_i.add(i);
				ls_j.add(j);

		}
			
		}
		System.out.println(ls);
		System.out.println(ls_i);
		System.out.println(ls_j);
		System.out.println(Collections.max(ls));

}
}
