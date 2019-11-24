package YZLeetCode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
import java.util.function.IntPredicate;

public class _973_最接近原点的K个点 {
	  public int[][] kClosest(int[][] points, int K) {
	        if (points.length == 0 || K==0) {
				return null;
			}
	        
	        int[][] res = new int[K][2];
	        
	        //创建一个小顶堆
	        PriorityQueue<int[]> queue = new PriorityQueue<int[]>(K,new Comparator<int[]>() {
	        	
	        	@Override
	        	public int compare(int[] o1, int[] o2) {
	        		// TODO Auto-generated method stub
	        		return dis(o1) - dis(o2);
	        	}
			});
	        
	        //  遍历入队
	        
	        for (int i = 0; i < points.length; i++) {
				queue.offer(points[i]);
			}
	        
	       // 前K个元素，就是我们需要的
	        for (int i = 0; i < K; i++) {
				res[i] = queue.poll();
			}
		  
		  return res;
	    }
	  
	  
	  private int dis(int[] t) {
		return t[0]*t[0] + t[1]*t[1];
	}
}
