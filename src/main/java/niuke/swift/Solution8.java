package niuke.swift;

/**
 * 变态跳台阶：
 *  一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author lordchen
 */
public class Solution8 {
	public int JumpFloorII(int target) {
		if(0 >= target)
			return 0;
		int result = 1;
		for(int i =1;i<=target;i++)
			result += JumpFloorII(target - i);
		return result;
	}
}