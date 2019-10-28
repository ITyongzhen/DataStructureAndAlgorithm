package YZLeetCode;
// https://leetcode-cn.com/problems/available-captures-for-rook/
////输入：[[".",".",".",".",".",".",".","."],
//		 [".",".",".","p",".",".",".","."],
//		 [".",".",".","p",".",".",".","."],
//		 ["p","p",".","R",".","p","B","."],
//		 [".",".",".",".",".",".",".","."],
//		 [".",".",".","B",".",".",".","."],
//		 [".",".",".","p",".",".",".","."],
//		 [".",".",".",".",".",".",".","."]]
//输出：3
//解释： 
//车可以捕获位置 b5，d6 和 f5 的卒。

public class _999_车的可用捕获量 {
public int numRookCaptures(char[][] board) {
        int row = -1;
        int lie = -1;
        int flag = 0;
        for (int i = 0; i < 8; i++) {
        	
			for (int j = 0; j < 8; j++) {
				if (board[i][j] == 'R') {
					row=i;
					lie=j;
					flag = 1;
					break;
				}
			}
			if (flag == 1) {
				break;
			}
		}
        
        int sum = 0;
        
        int i = lie,j = row;
        	while (i<8) {
        		if (board[row][i] == 'p' ) {
        			i++;
					sum++;
					break;
				}else if (board[row][i] == 'B') {
					break;
				}else {
					i++;
				}
				
			}
		
        
        	i = lie;
        	j = row;
        	while (i>=0) {
        		if (board[row][i] == 'p' ) {
        			i--;
					sum++;
					break;
				}else if (board[row][i] == 'B') {
					break;
				}else {
					i--;
				}
				
			}
		
        	i = lie;
        	j = row;
        	while (j<8) {
        		if (board[j][lie] == 'p' ) {
        			j++;
					sum++;
					break;
				}else if (board[j][lie] == 'B') {
					break;
				}else {
					j++;
				}
				
			}
        	
        	i = lie;
        	j = row;
        	while (j>=0) {
        		if (board[j][lie] == 'p' ) {
        			j--;
					sum++;
					break;
				}else if (board[j][lie] == 'B') {
					break;
				}else {
					j--;
				}
				
			}
		
		return sum;
    }
}
