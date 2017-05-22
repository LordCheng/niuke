package niuke.swift;

/**
 * 跳台阶： 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 
 * @author lordchen
 */
public class Solution7 {
	public int JumpFloor(int target) {
		if (0 >= target)
			return 0;
		if (1 == target)
			return 1;
		if (2 == target)
			return 2;
		return JumpFloor(target - 1) + JumpFloor(target - 2);
	}
}