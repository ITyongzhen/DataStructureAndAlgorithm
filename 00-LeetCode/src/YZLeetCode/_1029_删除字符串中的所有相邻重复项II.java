package YZLeetCode;

import java.util.HashMap;
import java.util.Stack;

//https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string-ii/
public class _1029_删除字符串中的所有相邻重复项II {
	public String removeDuplicates(String s, int k) {

        Stack<Character> stack = new Stack<>();
        Stack<Integer> nums = new Stack<>();

        for (char c : s.toCharArray()) {
            if (stack.empty()) {
                stack.push(c);
                nums.push(1);
                continue;
            }
            // 判断栈顶元素与当前元素是否相等
            Character peek = stack.peek();
            if (peek == c) {
                stack.push(c);
                nums.push(nums.peek() + 1);
                // 判断相邻元素个数是否 == k
                int num = nums.peek();
                if (num == k) {
                    // 相同元素出栈
                    for (int i = 0; i < k; i++) {
                        stack.pop();
                        nums.pop();
                    }
                }
                continue;
            }

            // 不相同元素直接入栈
            stack.push(c);
            nums.push(1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stack.forEach(e -> stringBuilder.append(e));
        return stringBuilder.toString();
    }
}
