package M11D5;

public class PalindromeNumber9 {
	class Solution {
	    public boolean isPalindrome(int x) {
	        if(x<0) {
	        	return false;
	        }
	        else {
	        	int temp=0,temp2=x;
	        	while(temp2!=0) {
	        		temp = temp*10+temp2%10;
	        		temp2 = temp2/10;
	        	}
	        	return temp==x;
	        }
	    }
	}
}
