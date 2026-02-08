package javaPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ArrayListExample {
    
    public static void main(String[] args){
        
    	HashMap<Integer, String> map = new HashMap();
    	
    	map.put(1, "Naveen");
    	map.put(2, "Twinkle");
    	map.put(3, "Dimple");
    	map.put(4, "Sara");
    	
    	Set set = map.entrySet();
    	System.out.println(set);
    	System.out.println(set.contains("Naveen"));
    	
    	
    	Iterator it = set.iterator();
		
    	while(it.hasNext()) {
			System.out.println(it.next());
		}
        
    }

	
}