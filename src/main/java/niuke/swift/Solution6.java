package niuke.swift;

/*
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * n<=39
 */
public class Solution6 {
	public int Fibonacci(int n) {
		if(n==0)
			return 0;
		if(n<=2&&n>0)
			return 1;								
		return Fibonacci(n-2)+Fibonacci(n-1);
	}
}