package YZLeetCode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode-cn.com/problems/combination-sum/
public class _39_组合总和 {
	public static void main(String[] args) {
		List<List<Integer>> res = combinationSum(new int[] {2,3,6,7}, 7);
		System.out.println(res);
	}
	
	static List<List<Integer>> resList ;
	static public List<List<Integer>> combinationSum(int[] candidates, int target) {
	        resList = new ArrayList<>();
		 if (candidates == null || candidates.length == 0) {
			return resList;
		 }
		 
		 Arrays.sort(candidates);
		 List<Integer> theList = new ArrayList<>();
		 play(target, candidates, theList,0);
		 return resList;
		 
	    }
	 
	static private void play(int lastTarget,int[] candidates,List<Integer> theList,int pre) {
		if (lastTarget == 0) {
			resList.add(new ArrayList<>(theList));
			return;
		}
		 
		for (int i = pre; i < candidates.length;i++) {
			if (candidates[i] > lastTarget) {
				
				continue;
			}
			//选择这个
			theList.add(candidates[i]);
			play(lastTarget - candidates[i], candidates, theList,i);
			//回溯
			theList.remove(theList.size()-1);
		}
		 
		 
	 }
	 
	 
	 
}
