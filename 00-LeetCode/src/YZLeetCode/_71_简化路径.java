package YZLeetCode;

import java.util.Stack;

//https://leetcode-cn.com/problems/simplify-path/
public class _71_简化路径 {
	
	public static void main(String[] args) {
//		String srString = simplifyPath("/home//foo/");
		String srString = simplifyPath("/a/./b/../../c/");
	}
	static public String simplifyPath(String path) {
		
		String[] strArrStrings = path.split("/");
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < strArrStrings.length; i++) {
			if (!stack.isEmpty() && strArrStrings[i].equals("..")) {
				stack.pop();
			}else if (!strArrStrings[i].equals(".") && !strArrStrings[i].equals("..") && !strArrStrings[i].equals("")) {
				stack.push(strArrStrings[i]);
			}			
		}
		
		if (stack.isEmpty()) {
			return "/";
		}
		
		StringBuffer reStringBuffer = new StringBuffer();
		
		for (int i = 0; i < stack.size(); i++) {
            reStringBuffer.append("/" + stack.get(i));
        }
		
		return reStringBuffer.toString();
		
	}
	static public String simplifyPath2(String path) {
		if (path.length() == 0 || path == null) {
			return null;
		}
        Stack<Character> stack = new Stack<>();
		char[] charArr = path.toCharArray();
		Character pre = charArr[0];
        for (Character c : charArr) {
        	 if (c.equals('/')) {
 				if (!stack.isEmpty() && stack.peek().equals('/')) {
					//前面有'/' 不做处理
				}else if (!stack.isEmpty() && stack.peek().equals('.')) {//前面有一个.
					Character temp = stack.pop();
					
					if (!stack.isEmpty() && stack.peek().equals('.')) { //2个点 返回上级目录
						while (!stack.isEmpty() && !stack.pop().equals('/') ) {
							stack.pop();
						}
						while (!stack.isEmpty() && !stack.pop().equals('/') ) {
							stack.pop();
						}
						
					}else {//1个点 当前目录
						stack.pop();
					}
				}else {
					stack.push(c);
				}
 			}else  {
 				stack.push(c);
			}
        	
			
        	
		}
        
        if (stack.peek().equals('/')) {
			stack.pop();
		}
        
        String string = stack.toString();
        
        
        return string;
    }
}
