package M11D5;

public class RegularExpressionMatching10 {
	class Solution {//减而治之和分而治之的结合
	    public boolean isMatch(String s, String p) {
	    	if (p.isEmpty()) return s.isEmpty();
	        if (p.length() > 1 && p.charAt(1) == '*') {
	            return isMatch(s, p.substring(2)) || (!s.isEmpty() && (s.charAt(0) ==
	p.charAt(0)|| p.charAt(0) == '.') && isMatch(s.substring(1), p));
	        } else {
	            return !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.') && isMatch(s.substring(1), p.substring(1));
	        }
		        

	      
	        
	    }
	}
}
