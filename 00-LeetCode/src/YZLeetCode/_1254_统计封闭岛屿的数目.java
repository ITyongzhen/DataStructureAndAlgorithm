package YZLeetCode;

public class _1254_统计封闭岛屿的数目 {
	  /**
     * 解题思路：
     * 其实想做对这个题目首先需要好好理解这个题目定义的孤岛是什么意思，他所谓的孤岛就是指那些被水域包围
     * 的陆地，比如
     *        1     1     1
     *        1     0     1
     *        1     1     1
     * 这种的就算是孤岛而
     *        0     1
     *        1     1
     *  不算是孤岛，因为他有两面是1不靠海的。
     *  那其实我们可以用一种很直观的方式来求解这个题目，我通过一个数组visited来表示当前的位置是否被探索过，
     *  遍历所有的位置，如果当前位置是陆地（grid[i][j] = 0）并且没有被访问过，就处理这个区域，介于DFS
     *  的性质，他会探索所有从当前位置可以触达的区域，如果这些区域中，有在边界意外以外的，那就是说这个陆地
     *  不是里面环海，那肯定当前这个dfs走过的所有区域形成的陆地都不算是孤岛。在实现DFS的过程中我使用了一个
     *  dfsFindLand的方法，他返回一个boolean值，用来表示当前位置所在的岛屿是否是一个孤岛。我们在dfs的过程中
     *  所遇到的值有以下几种情况：
     *  1。当前区域是一个陆地但是已经访问过了
     *  2。当前区域是一个水域
     *  3。当前区域是一个陆地还没有访问过
     *  4。当前区域已经超过边界
     *
     * 针对第四种情况我们已经知道了，如果可以从某个节点通过DFS到达边界那么这个节点所有可以到达的陆地构成的陆地块
     * 都不是孤岛，返回false；
     *
     * 针对1，2两种状况，先说2，如果当前是一个水域，那么返回true，代表到达当前位置的区块在这个方向上是满足要求的，
     * 因为他遇到了一个水域，而不是边界，返回true。如果当前这个位置已经访问过了，那么我们返回true，这个情况多见于
     * 比如我是从[0,0]发现[0,1]也是陆地，此时标记[0,0]为已经访问过 然后通过dfs到达了[0,1]，此时对于[0,1]的dfs
     * 也要考察这个区域的四个方向是不是满足要求（即可不可以出界），当他往上移动时就会碰到来到[0,1]的[0,0]此时[0,0]
     * 已经访问过了返回true，这个地方有点意思在于，比如
     * 1    1    1
     * 1    0    1
     * 1    0    1
     * 1    1    1
     *
     * 我们遇见的第一个0是位于[1,1]的，如果我们按照下上左右的顺序检查它的周边，是否符合规则，我们检查下时，发现他[2,1]也是陆地
     * 此时我们递归检查这个位置是否满足要求，检查这个位置时，向上就会碰到来到这个节点的[1,1]，此时我们返回true，原因在于
     * 你看这个图，其实对于[2,1] 它的前驱节点[1,1]此时是否符合要求的节点依赖于[2,1]的结果 所以这里直接返回true。
     *
     * 针对第三种情况，我们对他的上线左右区域都递归进行检查，如果有一个方向可以使得相邻的陆地出界，那么所有从该位置开始的dfs经过的节点都
     * 不能构成孤岛，有个注意的地方在于 即便发现了某个方向不能构成陆地，也要让从这个点开始的dfs把所有的方向都标记出来。
     */
    int[][] dir = new int[][]{{1,0},{-1,0},{0,-1},{0,1}};
    boolean[][] visited;
    public int closedIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        visited = new boolean[row][col];
        int count = 0;
        for(int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if(grid[i][j] == 0 && !visited[i][j]) {
                    if (dfsFindLand(grid, col, row, i, j)) count++;
                }
            }
        }
        return count;
    }

    private boolean dfsFindLand(int[][] grid, int col, int row, int curRow, int curCol){
        if(curRow >= row || curRow < 0) return false;
        if(curCol >= col || curCol < 0) return false;
        if(grid[curRow][curCol] == 1 ||visited[curRow][curCol]) return true;
        visited[curRow][curCol] = true;
        boolean flag = true;
        for(int[] direction : dir){
            if(!dfsFindLand(grid, col, row, curRow + direction[0], curCol + direction[1]))
                flag = false;
        }
        return flag;
    }
}
