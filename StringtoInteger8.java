package M11D5;

public class StringtoInteger8 {
	class Solution {
	    public int myAtoi(String str) {
	        int sign =1,base =0,n = str.length();
	        if(str.isEmpty()) {
	        	return 0;
	        }
	        int i=0;
	        while(i<n&&str.charAt(i)==' ') {
	        	i++;
	        }
	        if(i<n&&(str.charAt(i)=='-'||str.charAt(i)=='+')) {
	        	if(str.charAt(i)=='-') {
	        		sign *=-1;
	        	}
	        		i++;
	        }
	        while(i<n&&str.charAt(i)>='0'&&str.charAt(i)<='9') {
	        	if(base>Integer.MAX_VALUE/10||(base==Integer.MAX_VALUE/10)&&str.charAt(i)-'0'>7) {//这是整数边界条件判断，记住了Integer.maxvalue最后一位是7所以大于7
	        		if(sign==1) {
	        			return Integer.MAX_VALUE;
	        		}
	        		else {
	        			return Integer.MIN_VALUE;
	        		}
	        		
	        	}
	        	base = base*10+str.charAt(i++)-'0';
	        }
	        return base*sign;
	    }
	}
}
