package YZLeetCode;

import java.util.Stack;
import java.util.function.IntPredicate;

//https://leetcode-cn.com/problems/daily-temperatures/
public class _739_每日温度 {
	public static void main(String[] args) {
		int[] res = dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});
	}
	
	
	
	static public int[] dailyTemperatures(int[] T) {
		int[] res = new int[T.length];
		Stack<Integer> stack = new Stack<>();
		for (int i = T.length-1; i >=0; i--) {
			while (!stack.isEmpty() && T[i]>=T[stack.peek()]) {
				stack.pop();
			}
			res[i] = stack.isEmpty() ? 0 : stack.peek()-i;
			stack.push(i);
		}
		
		return res;
	}
	
	
	
	
	static public int[] dailyTemperatures2(int[] T) {
        int res[] = new int[T.length];
        if (T.length == 0 || T==null) {
			return res;
		}
        res[T.length -1] = 0;
		for (int i = T.length-2; i >=0; i--) {
			
			int index = i+1;
			int num = 0;
			while (index <= T.length -1) {
				if (T[i] < T[index]) {
					num++;
					res[i] = num;
					break;
				}else {
					
					if (index == T.length -1) {
						num = 0;
						break;
					}else {
						num++;
					}
					index++;
				}
			}
			
			res[i] = num;
		}
		
		return res;
		
    }
}
