package YZLeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

//https://leetcode-cn.com/problems/jewels-and-stones/
public class _771_宝石和石头 {
	 public int numJewelsInStones(String J, String S) {
		 char[] arr=J.toCharArray();
		 HashMap<Character, Character> map = new HashMap<>();
		 int res = 0;
		 for (char c : arr) {
			 map.put(c, c);
		}
		 
		 for (int i=0; i<S.length();i++) {
			if (map.containsKey(S.charAt(i))) {
				res++;
			}
			
		}
		 
		 return res;
		 
		 
	    }
}
