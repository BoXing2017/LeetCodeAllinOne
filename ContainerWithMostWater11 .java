package M11D5;

public class ContainerWithMostWater11 {
	class Solution {//设置左右两个指针，谁小哪个指针向中间移动，不断地求最大容量
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
