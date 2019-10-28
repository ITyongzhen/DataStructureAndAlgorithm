package YZLeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

//https://leetcode-cn.com/problems/find-the-town-judge/
public class _997_找到小镇的法官 {
	
	public int findJudge(int N, int[][] trust) {
        int[] cnt = new int[N+1];//统计出入度
        for (int[] index : trust) {
	        cnt[index[0]]--;//出度--
	        cnt[index[1]]++;//入度++
	}
        for ( int i = 1; i <= N; i++ ) {
        	if ( cnt[i] == N-1 ) return i;
        }
        return -1;
    }

//	public int findJudge(int N, int[][] trust) {
//		if (trust.length == 0 && N==1) {
//			return 1;
//		}
//		
//        HashMap<Integer, Integer> resMap = new HashMap<>();
//        HashSet<Integer> resSet=new HashSet<>();
//        
//        for (int i = 0; i < trust.length; i++) {
//			int[] trustNum = trust[i];
//			resSet.add(trustNum[0]);
//			if (resMap.containsKey(trustNum[0])) {
//				
//			}else {
//				resMap.put(trustNum[0], 0);
//			}
//			
//			if (resMap.containsKey(trustNum[1])) {
//				int num = resMap.get(trustNum[1]);
//				resMap.put(trustNum[1], num+1);
//			}else {
//				resMap.put(trustNum[1], 1);
//			}			
//		}
//        
//		for (int is : resMap.keySet()) {
//			if (resMap.get(is) == N-1 && !resSet.contains(is)) {
//				return is;
//			}
//		}
//		return -1;
//    }
}
