package YZLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class _90_子集II {
	public static void main(String[] args) {
		 List<List<Integer>> resultList= subsetsWithDup(new int[] {4,4,4,1,4});
		 System.out.println(resultList);
	}
	
	static List<List<Integer>> res = new ArrayList<>();
	static HashSet<List<Integer>> hashSet = new HashSet<>();
	static HashSet<List<Integer>> hashSet2 = new HashSet<>();
	static public List<List<Integer>> subsetsWithDup(int[] nums) {
		 if (nums == null || nums.length == 0) {
			return res;
		}
		 addRes(nums, new ArrayList<>(), 0);
		
		 for (List<Integer> i : hashSet) {
			 Collections.sort(i);
//			 if (hashSet2.contains(i)) {
//				continue;
//			}
			 hashSet2.add(i);
			res.add(i);
		}
		 return res;
		 
	    }
	 
	static private  void addRes(int[] nums,List<Integer> list,int index) {
//		System.out.println("before"+ list);
//		 Collections.sort(list);
//		 System.out.println("end"+list);
		 if (list.size() ==nums.length) {
//			res.add(new ArrayList<>(list));
			
			hashSet.add(new ArrayList<>(list));
			return;
		}
//		 res.add(new ArrayList<>(list));
		 hashSet.add(new ArrayList<>(list));
		 Integer temp = null;
		 for (int i = 0; i < nums.length; i++) {
			
			//|| ((list != null && list.size()>0) && ((nums[i] == list.get(list.size()-1)) ||  (nums.indexOf(list.get(list.size()-1)) >= index)))
			if (index>i || (temp != null && temp == nums[i])) {
				 temp = nums[i];
				continue;
			}
//			 res.add(new ArrayList<>(list));
			 list.add(nums[i]);
			 addRes(nums, list,index>i?index+1:i+1);
			 list.remove(list.size()-1);
		}
		 
	}
}
