package YZLeetCode;

public class _224_基本计算器 {
	
	int i = 0;
	public int calculate(String s) {
		
		s = "(" + s + ")";
		return helper(s);
	}
	
	int helper(String s) {
		int num = 0;
		int res = 0;
		int offer = 1;
		while(i<s.length()) {
			char c = s.charAt(i);
			switch (c) {
			case '(':
				i++;
				res = res + offer * helper(s);
				break;
			case ')':
				i++;
				res = res + offer * num;
				return res;
				
			case '+':
				res = res + offer * num;
				i++;
				offer = 1;
				num = 0;
				break;
			case '-':
				res = res + offer * num;
				i++;
				offer = -1;
				num = 0;
				break;
			case ' ':
				i++;
				break;
			default:
				i++;
				int a = c - '0';
				num = num *10 + a;
				break;
			}
			
		}
		
		
		return res;
	}
	
	
//	int i =0;
//    public int calculate(String s) { // (1+(4+5+2)-3)+(6+8)
//        i=0;
//        s = "(" + s + ")"; // s = ((1+(4+5+2)-3)+(6+8))
//        return helper(s);
//    }
//    int helper(String s) {
//        int num =0;
//        int val = 0;
//        int presign = 1;
//        while(i < s.length()) {
//            char c = s.charAt(i);
//            if(c==' ') {
//                i++;
//            }else if(c=='+') {
//                val = val + presign * num;//0+1*1
//                num=0;
//                presign = 1;
//                i++;
//            }else if(c=='-') {
//                val = val + presign * num;
//                num=0;
//                presign = -1;
//                i++;
//            }else if(c=='(') {
//                i++; 
//                val = val + presign * helper(s);
//            }else if(c==')') {
//                val = val + presign * num;
//                i++;
//                return val;
//            }else {
//                int n = c-'0';
//                num = num * 10 + n;//1
//                i++;
//            }
//        }
//        return val;
//    }
}
