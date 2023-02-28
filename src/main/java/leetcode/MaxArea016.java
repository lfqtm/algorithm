package leetcode;

/**
 * 11. 盛最多水的容器
 */
public class MaxArea016 {

	public static void main(String[] args) {
		int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
		System.out.println(maxArea(height));
	}

	public static int maxArea(int[] height) {
		int l = 0, r = height.length - 1;
		int ans = 0;
		while (l < r) {
			int area = Math.min(height[l], height[r]) * (r - l);
			ans = Math.max(area, ans);
			if (height[l] <= height[r]) {
				//哪边的小，就需要把较小的那边往相对的方向移动
				l++;
			} else {
				r--;
			}
		}
		return ans;
	}
}
