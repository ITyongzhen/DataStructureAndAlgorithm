package YZLeetCode;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class _51_N皇后 {
	
	public static void main(String[] args) {
		solveNQueens(4);
		System.out.println(totalN);
	}
	
	static int totalN;
	/**
	 * 数组索引是行号，数组元素是列号
	 */
	static int[] queens;
	// 返回结果
	static List<List<String>> res; 
	//标记某一列是否有皇后
	static boolean[] cols;
	// 标记某一斜线是否有皇后 （左上 -> 右下）
	static boolean[] leftTop;
	// 标记某一斜线是否有皇后 （右上 -> 左下）
	static boolean[] rightTop;
	
	 static public List<List<String>> solveNQueens(int n) {
		  res= new ArrayList<>();
		  totalN = 0;
		  if (n<1) {
			  return res;
		  }
		  queens = new int[n];
		  cols = new boolean[n];
		  leftTop = new boolean[n * 2 -1];
		  rightTop = new boolean[leftTop.length];
		  place(0);
		  return res;
	    }
	  
	  //摆放
	 static private void place(int row) {
		if (row == cols.length) {
			totalN++;
			add();
			return;
		}
		
		for (int col = 0; col < cols.length; col++) {
			//这一列有皇后
			if (cols[col]) {
				continue;
				
			}
			// 左上到右下
			int leftIndex = col - row + cols.length -1;
			if (leftTop[leftIndex]) {
				continue;
			}
			//右上到左下
			int rightIndex = row + col;
			if (rightTop[rightIndex]) {
				continue;
			}
			
			// 可以放置皇后
			queens[row] =col;
			cols[col] = true;
			leftTop[leftIndex] = true;
			rightTop[rightIndex] = true;
			
			place(row+1);
			// 来到这里，说明回溯了
			cols[col] = false;
			leftTop[leftIndex] = false;
			rightTop[rightIndex] = false;
			
			
		}
		
		
	}
	  
	 static private void add() {
		 List<String> thisRes = new ArrayList<>();
		 
		 for (int row = 0; row < cols.length; row++) {
			 StringBuffer stringBuffer = new StringBuffer();
			 for (int col = 0; col < cols.length; col++) {
				
					if (queens[row] == col) {
//						thisRes.add("Q");
						stringBuffer.append("Q");
					}else {
						stringBuffer.append(".");
					}
					
				}
			 
			 thisRes.add(stringBuffer.toString());
		}
		 
		 
		 res.add(thisRes);
	 }
	  
	  
}
