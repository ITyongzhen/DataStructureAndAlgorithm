package YZLeetCode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode-cn.com/problems/number-of-burgers-with-no-waste-of-ingredients/
public class _1276_不浪费原料的汉堡制作方案 {
	public static void main(String[] args) {
		List<Integer> resIntegers = numOfBurgers(16, 7);
		
	}
	
	
	static public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
		 List<Integer> res = new ArrayList<>();
		 System.out.println("2 " +(cheeseSlices<<2));
		 System.out.println("1 " +(cheeseSlices<<1));
		 System.out.println("0 " +(cheeseSlices));
		 if (tomatoSlices> (cheeseSlices<<2) || tomatoSlices<cheeseSlices<<1) {
			return res;
		}
		 
		 int sum = cheeseSlices *2;
		 int more = tomatoSlices - sum;
		 
		 if (( more & 1)==1) {
			return res;
		 }
		 System.out.println("sum" +sum );
		 System.out.println("more" +more );
		 res.add(more/2); 
		 res.add(cheeseSlices - more/2); 
		 
	      return res;
		 
	    }
}
