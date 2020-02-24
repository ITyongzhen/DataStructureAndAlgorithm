package YZLeetCode;

import java.util.ArrayList;
import java.util.List;

public class _46_全排列 {
	
	public static void main(String[] args) {
		List<List<Integer>> resList = permute(new int[]{1,2,3});
		System.out.println(resList);
	}
	
	
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
		 place(0);
		 return resList;
	   }
	 
	static  private void place(int num) {
		 if (num == theNums.length) {
			//排列好了一个了
			 addList();
			 return;
		}
		 
		 for (int i = 0; i < theNums.length; i++) {
			if (isOK(theNums[i])) {
				selectedIndex.add(theNums[i]);
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
		 
//		selectedIndex = new ArrayList<Integer>();
		
		 resList.add(myList);
		 
	}
	 
}
