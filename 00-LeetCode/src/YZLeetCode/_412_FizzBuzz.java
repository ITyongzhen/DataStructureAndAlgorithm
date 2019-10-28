package YZLeetCode;

import java.util.LinkedList;
import java.util.List;

// https://leetcode-cn.com/problems/fizz-buzz/
public class _412_FizzBuzz {
	 public List<String> fizzBuzz(int n) {
	        List<String> res = new LinkedList<>();
	        
	        for(int i = 1;i<n+1;i++){
	            int k1 = i%3;
	            int k2 = i%5;
	            if(k1==0 && k2==0){
	                res.add("FizzBuzz");
	            }else if (k1==0) {
	            	res.add("Fizz");
				}else if (k2==0) {
					res.add("Buzz");
				}else {
					res.add(Integer.toString(i));
				}
	        }
	        return res;
	    }
}
