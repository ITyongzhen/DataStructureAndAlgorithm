package YZLeetCode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode-cn.com/problems/subsets/
public class _78_子集 {
	
	public static void main(String[] args) {
		 List<List<Integer>> resultList= subsets(new int[] {0});
		 System.out.println(resultList);
	}
	
	static List<List<Integer>> res = new ArrayList<>();
	static public List<List<Integer>> subsets(int[] nums) {
		 if (nums == null || nums.length == 0) {
			return res;
		}
		 addRes(nums, new ArrayList<>(), 0);
		 
		 return res;
		 
	    }
	 
	static private  void addRes(int[] nums,List<Integer> list,int index) {
		
		 if (list.size() ==nums.length) {
			res.add(new ArrayList<>(list));
			return;
		}
		 res.add(new ArrayList<>(list));
		 for (int i = 0; i < nums.length; i++) {
			//|| ((list != null && list.size()>0) && ((nums[i] == list.get(list.size()-1)) ||  (nums.indexOf(list.get(list.size()-1)) >= index)))
			if (index>i ) {
				continue;
			}
//			 res.add(new ArrayList<>(list));
			 list.add(nums[i]);
			 addRes(nums, list,index>i?index+1:i+1);
			 list.remove(list.size()-1);
		}
		 
	}
}
