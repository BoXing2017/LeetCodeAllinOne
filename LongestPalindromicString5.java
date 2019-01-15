package M11D3;

public class LongestPalindromicString5 {
	class Solution {
		 int maxlen =0;
	     int start =0;
		public String longestPalindrome(String s) {
	        int n = s.length();
	       
	        
	        if(n<2) {
	        	return s;
	        }
	        for(int i=0;i<n-1;i++) {
	        	searchPalindrome(s,i,i,start,maxlen);//��������bob����������ʽ�Ļ��Ĵ�
	        	searchPalindrome(s,i,i+1,start,maxlen);//��������noon����ż����ʽ�Ļ��Ĵ�
	        }
	        return s.substring(start, start+maxlen);
	        
	    }
		
		public void searchPalindrome(String s,int left,int right,int st,int len) {
			while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)) {
				left--;
				right++;
			}
			if(maxlen<right-left-1) {
				maxlen = right -left -1;
				start = left+1;
			}
		}
	}
}
