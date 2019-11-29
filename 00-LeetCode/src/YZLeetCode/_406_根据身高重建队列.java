package YZLeetCode;

import java.util.Arrays;
import java.util.LinkedList;

//https://leetcode-cn.com/problems/queue-reconstruction-by-height/
public class _406_根据身高重建队列 {
	
	
	/**
     * 解题思路：先排序再插入
     * 1.排序规则：按照先H高度降序，K个数升序排序
     * 2.遍历排序后的数组，根据K插入到K的位置上
     *
     * 核心思想：高个子先站好位，矮个子插入到K位置上，前面肯定有K个高个子，矮个子再插到前面也满足K的要求
     *
     * @param people
     * @return
     */

	
	public int[][] reconstructQueue(int[][] people) {
		// [7,0], [7,1], [6,1], [5,0], [5,2], [4,4]
        // 再一个一个插入。
        // [7,0]
        // [7,0], [7,1]
        // [7,0], [6,1], [7,1]
        // [5,0], [7,0], [6,1], [7,1]
        // [5,0], [7,0], [5,2], [6,1], [7,1]
        // [5,0], [7,0], [5,2], [6,1], [4,4], [7,1]

        Arrays.sort(people,(o1,o2)->o1[0] == o2[0] ? o1[1]-o2[1]:o2[0]-o1[0]);
        LinkedList<int[]> list = new LinkedList<>();
       for (int[] is : people) {
		list.add(is[1],is);
       }
        
       return list.toArray(new int[list.size()][2]);
       
       
    }
}
