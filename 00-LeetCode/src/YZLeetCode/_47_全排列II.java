package YZLeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

//https://leetcode-cn.com/problems/permutations-ii/
public class _47_全排列II {
	public static void main(String[] args) {
		List<List<Integer>> resList = permute(new int[]{1,1,2});
		System.out.println(resList);
	}
	
	static HashSet<String> haveSet;
	static  List<List<Integer>> resList;
	static  List<Integer> selectedIndex;
	static  int[] theNums;
	static public List<List<Integer>> permute(int[] nums) {
		 resList = new ArrayList<>();
		 if (nums == null || nums.length == 0) {
			return resList;
		 }
		 selectedIndex = new ArrayList<Integer>();
		 theNums = nums;
		 haveSet = new HashSet<>();
		 
		 place(0);
		 return resList;
		 
		 // resList里面存的是下标
		 
	   }
	
	static private void changeIndexToNum(List<List<Integer>> resList) {
		
		
	}
	
	 
	static  private void place(int num) {
		 if (num == theNums.length) {
			//排列好了一个了
			 addList();
			 return;
		}
		 
		 for (int i = 0; i < theNums.length; i++) {
			if (isOK(i)) {
				selectedIndex.add(i);
			    place(num+1);
			    selectedIndex.remove(selectedIndex.size()-1);
			}			
		    
		    
		}
		 
	 }

	static  private boolean isOK(int num) {
		for (int i = 0; i < selectedIndex.size(); i++) {
			if (selectedIndex.get(i) == num) {
				return false;
			}
		}
		 return true;
	}
	 
	static  private void addList() {
		 List<Integer> myList = new ArrayList<>();
		 for (int i = 0; i < selectedIndex.size(); i++) {
			 myList.add(selectedIndex.get(i));
		 }
		 
		 //这转换
		 List<Integer> newList = new ArrayList<>();
		 StringBuffer stringB = new StringBuffer();
		 for (int i = 0; i < myList.size(); i++) {
			 int num = theNums[myList.get(i)];
			 stringB.append(num);
			 //如果没有重复的，就添加
			 newList.add(num);
		 	}
		 if (!haveSet.contains(stringB.toString())) {
			 haveSet.add(stringB.toString());
			 resList.add(newList);
		 }
		 
		
		 
	}
	 
}
