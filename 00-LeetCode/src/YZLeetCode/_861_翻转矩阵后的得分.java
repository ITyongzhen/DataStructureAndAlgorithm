package YZLeetCode;



//https://leetcode-cn.com/problems/score-after-flipping-matrix/solution/fan-zhuan-ju-zhen-hou-de-de-fen-by-leetcode/
public class _861_翻转矩阵后的得分 {

//	0 0 1 1
//	1 0 1 0 
//	1 1 0 0
//	
//	1 1 0 0
//	1 0 1 0 
//	1 1 0 0
//	
//	1 1 1 1
//	1 0 0 1 
//	1 1 1 1
	
	public static void main(String[] args) {
		int res = matrixScore(new int[][] {{0,0,1,1},{1,0,1,0},{1,1,0,0}});
		System.out.println(res);
	}
	
	static public int matrixScore(int[][] A) {
		 int lie = A[0].length;
		 int hang = A.length;
	
		 for (int i = 0; i < hang; i++) {
			if (A[i][0] == 0) {// 如果第一个是0，翻转
				for (int j = 0; j < lie; j++) {
					A[i][j] ^= 1;
				}
			}
		}
		 
		 int sum = hang * (1<<lie-1);
		 
		for (int i = 1; i < lie; i++) {
			
			int oneNum = 0;
			for (int j = 0; j < hang; j++) {
				if (A[j][i] == 1) {//统计1的个数
					oneNum++;
				}
			}
		
			if (oneNum <= hang/2) { //1的个数少于一半，
				oneNum = hang - oneNum;
			}
			sum += oneNum * (1<<lie-1-i);
		} 
		 
		 return sum;

	 }

private int pow(int i, int j) {
	// TODO Auto-generated method stub
	return 0;
}
	
	
}
