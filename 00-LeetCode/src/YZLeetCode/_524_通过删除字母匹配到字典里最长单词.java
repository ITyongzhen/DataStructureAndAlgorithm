package YZLeetCode;

import java.util.ArrayList;
import java.util.LinkedList;

import com.sun.tools.javac.util.List;

//https://leetcode-cn.com/problems/longest-word-in-dictionary-through-deleting/
public class _524_通过删除字母匹配到字典里最长单词 {
	static LinkedList<String>[] strArr;
	
	@SuppressWarnings("unchecked")
	static public String findLongestWord(String s, List<String> d) {
		
	        if (s.length() == 0 || d.size() == 0) {
				return null;
			}
		 // 对数组 d 进行排序
	        strArr = new LinkedList[d.length()>>1];
	        sort(0, d.length(), d);
	        
	        //查找是否有字符串
	    	int index = 0;
	        for (int i = 0; i < d.size(); i++) {
				String str = d.get(i);
				int length = str.length();
				while (index<s.length()) {
					if (str.equals(s.charAt(index))) {
						index++;
						length--;
					}else {
						index++;
					}
					
				}
				
				
				if (length == 0) {//代表找到了
					return str;
				}
			}
	        
	        
	        return null;
	    }
	 
	static private  void sort(int begin,int end,List<String> d) {
		 
		 if (end-begin<2) {
			return;
		}
		 int mid = (begin + end)>>1;
		 sort(begin, mid, d);
		 sort(mid, end, d);
		 merge(begin, mid, end, d);
	 	}
	 
	static private void merge(int begin,int mid, int end,List<String> d) {
		int li=0,le=mid-begin;
		int ri=mid,re=end;
		int ai = begin;
		// 备份左边数据
		for (int i = li; i < le; i++) {
//			strArr[i] = d.get(begin+i);
		strArr[1]= d.get(begin+i);
			
		}
		
		while (li<le) { //左边没有结束
			if (ri<re && compare(d.get(li), d.get(li))<0) {
				d.set(ai++, d.get(ri++));
			}else {
				d.set(ai++, strArr[li++]);
			}
			
		}
	}
	 
	 //返回 -1 代表前面的小
	 //返回  1 代表后面的小
	 //返回  0 代表相等
	static private int compare(String str1,String str2) {
		 if (str1.length() > str2.length()) {
			return -1;
		}else if (str1.length() < str2.length()) {
			return 1;
		}else {
			for (int i = 0; i < str1.length(); i++) {
				Character c1 = str1.charAt(i);
				Character c2 = str1.charAt(i);
				if (c1<c2) {
					return -1;
				}else if (c1>2) {
					return 1;
				}
			}
			return 0;
			
		}
	 }

	
	 
	 
}
