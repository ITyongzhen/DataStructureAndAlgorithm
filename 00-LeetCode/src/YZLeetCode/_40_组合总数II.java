package YZLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//https://leetcode-cn.com/problems/combination-sum-ii/
public class _40_组合总数II {
	

	 
	 public static void main(String[] args) {
			List<List<Integer>> res = combinationSum2(new int[] {10,1,2,7,6,1,5}, 8);
			System.out.println(res);
		}
		
		static List<List<Integer>> resList ;
		static public List<List<Integer>> combinationSum2(int[] candidates, int target) {		        resList = new ArrayList<>();
			 if (candidates == null || candidates.length == 0) {
				return resList;
			 }
			 
			 Arrays.sort(candidates);
			 List<Integer> theList = new ArrayList<>();
			 play(target, candidates, theList,0);
			 List<List<Integer>> result = quchong(resList);
			 return result;
			 
		    }
		 static private List<List<Integer>> quchong(List<List<Integer>> lists) {
			 List<List<Integer>> res = new ArrayList<>();
			 HashSet<String> hashStrings = new HashSet<>();
			 for (List<Integer> list : resList) {
				 Object[] listArr = list.toArray();
				 Arrays.sort(listArr);
				 StringBuffer sBuffer = new StringBuffer();
				 for (int i = 0; i < list.size(); i++) {
					 sBuffer.append(list.get(i));
				}
				
				 System.out.println(sBuffer.toString());
				if (hashStrings.contains(sBuffer.toString())) {
					
				}else {
					res.add(list);
					hashStrings.add(sBuffer.toString());
				}
			}
			 return res;
			 
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
				play(lastTarget - candidates[i], candidates, theList,i+1);
				//回溯
				theList.remove(theList.size()-1);
			}
			 
			 
		 }
		 
		 
}
