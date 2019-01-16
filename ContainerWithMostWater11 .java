package M11D5;

public class ContainerWithMostWater11 {
	class Solution {//������������ָ�룬˭С�ĸ�ָ�����м��ƶ������ϵ����������
	    public int maxArea(int[] height) {
	        int res=0,left=0,right=height.length-1;
	        while(right>left) {
	        	res = Math.max(res, (right-left)*Math.min(height[right],height[left]));
	        	if(height[right]>height[left]) {
	        		left++;
	        	}
	        	else {
	        		right--;
	        	}
	        }
	        return res;
	    }
	}
}
