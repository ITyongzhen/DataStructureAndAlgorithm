package YZLeetCode;

import java.awt.TexturePaint;

//https://leetcode-cn.com/problems/valid-anagram/
public class _242_有效的字母异位词 {
	
	public static void main(String[] args) {
		isAnagram("a", "b");
	}
	
	static public boolean isAnagram(String s, String t) {
		 if(s.length() != t.length())return false;
		 
		 int[] arrayStr = new int[26];
		 
	        char[] arrS= s.toCharArray();
	        for (char i : arrS) {
				arrayStr[i-'a']++;
			}
	        
	        char[] arrt= t.toCharArray();
	        
	        for (char c : arrt) {
				if (arrayStr[c-'a']>0) {
					arrayStr[c-'a']--;
				}else {
					return false;
				}
			}
	        
	        
	        return true;
	    }
}
