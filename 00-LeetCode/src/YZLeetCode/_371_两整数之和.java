package YZLeetCode;
//https://leetcode-cn.com/problems/sum-of-two-integers/
public class _371_两整数之和 {
	public int getSum2(int a, int b) {
	    int yh = a^b;
	    int and = a&b;
		int temp;
	    while (and != 0) {
	    	temp=and<<1;
	    	and=yh&temp;
			yh=yh^temp;	    	
		}	    
		return yh;
	    }
	
	public int getSum(int a, int b) {
	       return Math.addExact(a,b);
	    }
}
