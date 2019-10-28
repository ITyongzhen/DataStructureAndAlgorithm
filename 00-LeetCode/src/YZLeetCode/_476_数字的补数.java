package YZLeetCode;
//https://leetcode-cn.com/problems/number-complement/
public class _476_数字的补数 {
	 public int findComplement(int num) {
	        int tmp = num;
	        int num2 = 1;
	        while(tmp>0){
	            num2<<=1;
	            tmp>>=1;
	        }
	        num2-=1;
	        return num^num2;
	            
	    }

}
