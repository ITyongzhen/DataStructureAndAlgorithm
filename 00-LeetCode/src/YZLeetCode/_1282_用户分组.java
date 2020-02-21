package YZLeetCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//https://leetcode-cn.com/problems/group-the-people-given-the-group-size-they-belong-to/
public class _1282_用户分组 {
	
	public static void main(String[] args) {
		List<List<Integer>> restList = groupThePeople(new int[] {2,1,3,3,3,2});
	}
	
	static public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> groups = new ArrayList<>();
        boolean[] flags = new boolean[groupSizes.length];

        for (int i = 0; i < groupSizes.length; i++) {
            if (!flags[i]) {
                addGroup(i, groups, groupSizes, flags);
            }
        }

        return groups;
    }

	static void addGroup(int i, List<List<Integer>> groups, int[] groupSizes, boolean[] flags) {
        List<Integer> curGroup = new ArrayList<>();
        curGroup.add(i);

        flags[i] = true;
        int curGroupSize = groupSizes[i];
        int curGroupNum = 1;

        if (curGroupSize == 1) {
            groups.add(curGroup);
            return;
        }

        for (int j = i + 1; j < groupSizes.length; j++) {
            if (!flags[j] && groupSizes[j] == curGroupSize) {
                curGroup.add(j);
                curGroupNum++;
                flags[j] = true;

                if (curGroupNum == curGroupSize) {
                    break;
                }
            }
        }

        groups.add(curGroup);
    }

	
	static public List<List<Integer>> groupThePeople2(int[] groupSizes) {
	     int length = groupSizes.length;
	     List<List<Integer>> res = new ArrayList<>();
	     
	     PriorityQueue<int[]> minHeap = new PriorityQueue<>(length, Comparator.comparingInt(o->o[0]));
		 for (int i = 0; i < length; i++) {
			minHeap.add(new int[] {groupSizes[i],i});
		 }
	     
		 while (!minHeap.isEmpty()) {
			int curSize = minHeap.peek()[0];
			List<Integer> current=new ArrayList<>();
			for (int i = 0; i < curSize; i++) {
				current.add(minHeap.poll()[1]);
			}
			res.add(current);
		}
	     
		 return res;
	    }
}
