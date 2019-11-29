package YZLeetCode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode-cn.com/problems/partition-labels/
public class _763_划分字母区间 {
	
	public static void main(String[] args) {
		List<Integer> res = partitionLabels2("ababcbacadefegdehijhklij");
		System.out.println(res);
	}
	
	public List<Integer> partitionLabels(String S) {
		int[] last = new int[26];
		for (int i = 0; i < S.length(); i++) {
			last[S.charAt(i) - 'a'] = i;
		}
		
		int begin = 0;
		int end = 0;
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < S.length(); i++) {
			end = Math.max(end, last[S.charAt(i) - 'a']);
			if (begin == end) {//一个分割区间完成
				res.add(i-end+1);
				end = i+1;
			}
		 }
	    return res;	
	}
	
 static	public List<Integer> partitionLabels2(String S) {
        int[] last = new int[26];
        for (int i = 0; i < S.length(); ++i)
            last[S.charAt(i) - 'a'] = i;
        
        int j = 0, anchor = 0;
        List<Integer> ans = new ArrayList();
        for (int i = 0; i < S.length(); ++i) {
            j = Math.max(j, last[S.charAt(i) - 'a']);
            if (i == j) {
                ans.add(i - anchor + 1);
                anchor = i + 1;
            }
        }
        return ans;
    }


}
