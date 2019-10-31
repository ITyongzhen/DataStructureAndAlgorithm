package YZLeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class _841_钥匙和房间 {
	 List<List<Integer>> myRooms;
	 HashSet<Integer> mySet;
	 public boolean canVisitAllRooms(List<List<Integer>> rooms) {
		 myRooms = rooms;
		 mySet = new HashSet<>();
		 getList(0);
		 
		 for (List<Integer> list : rooms) {
			for (Integer integer : list) {
				if (!mySet.contains(integer)) {
					return false;
				}
			}
		}
		 return true;
	 }
	 
	 
	 private List<Integer> getList(Integer index) {
		 setList(myRooms.get(index));
		 return null;
	}
	 
	 private void setList(List<Integer> list) {
		for (Integer integer : list) {
			 mySet.add(integer);
			 getList(integer);
		}
	}
	 

}
