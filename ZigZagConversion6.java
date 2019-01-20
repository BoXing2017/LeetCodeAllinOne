package M11D5;

public class ZigZagConversion6 {
	class Solution {
	    public String convert(String s, int numRows) {
	        int size  = 2*numRows-2;
	        String res = "";
	        if(numRows<2) {
	        	return  s;
	        }
	        for(int i=0;i<numRows;i++) {
	        	for(int j=i;j<s.length();j+=size) {
	        		res+=s.charAt(j);
	        		int temp = j+size-2*i;
	        		if(i>0&&i<numRows-1&&temp<s.length()) {
	        			res+=s.charAt(temp);
	        		}
	        	}
	        }
	        return res;
	    }
	}
}
