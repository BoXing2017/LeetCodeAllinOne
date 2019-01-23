package Y2019M1D22;
import java.util.*;
class LRUCache {
    List<Map<Integer,Integer>> res;
    int cap;
    public LRUCache(int capacity) {
        cap = capacity;
        res = new ArrayList();
        
    }
    
    public int get(int key) {
        for(int i=0;i<res.size();i++) {
        	Map<Integer,Integer> temp = res.get(i);
        	if(temp.containsKey(key)) {
        		res.remove(i);
        		res.add(temp);
        		return temp.get(key);
        	}
        	
        }
        return -1;
    }
    
    public void put(int key, int value) {
       if(this.get(key)==-1) {
    	   if(res.size()==cap) {
    		   res.remove(0);
    		   Map<Integer,Integer> temp = new HashMap();
    		   temp.put(key, value);
    		   res.add(temp);
    	   }
    	   else {
    		   Map<Integer,Integer> temp = new HashMap();
    		   temp.put(key, value);
    		   res.add(temp);
    	   }
       }
       else {
    	   for(int i=0;i<res.size();i++) {
    		   Map<Integer,Integer> temp = res.get(i);
    		   if(temp.containsKey(key)) {
    			   res.remove(i);
    		   }
    	   }
    	   Map<Integer,Integer> temp = new HashMap();
    	   temp.put(key, value);
    	   res.add(temp);
       }
    
    }
}
