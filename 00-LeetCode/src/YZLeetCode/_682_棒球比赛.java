package YZLeetCode;

import java.util.Stack;

// https://leetcode-cn.com/problems/baseball-game/
public class _682_棒球比赛 {
	public int calPoints(String[] ops) {
		
		Stack<Integer> stack = new Stack<>();
		int len = ops.length;
		int score = 0;
		for (int i = 0; i < len; i++) {
			
			String string = ops[i];
			if (string.equals("C")) {
				score -= stack.pop();
				
			}else if (string.equals("D")) {
				
				stack.push(stack.peek() * 2);
				score += stack.peek();
				
			}else if (string.equals("+")) {
				int a = stack.pop();
				int b = stack.peek();
				stack.push(a);
				stack.push(a + b);
				score += stack.peek();
			}else {
				int num = Integer.parseInt(string);
				score += num;
				stack.push(num);
			}
		}
		
	
        return score;
    }
}
