package YZLeetCode;

public class _1030_距离顺序排列矩阵单元格 {
	public static void main(String[] args) {
		int[][] res=allCellsDistOrder(2, 2, 0, 1);
		System.out.println(res);
	}
	
	 public static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] ans=new int[R*C][2];
        int order=0;//当前顺序
        int point_x=r0,point_y=c0;
        ans[order][0]=r0;ans[order][1]=c0;order++;
        while(order<R*C) {
        	//先上移一格,现在在上侧
        	point_x--;
        	while(point_x<r0) {//从上侧到右侧
        		if(point_x>=0&&point_y<=C-1) {
        			ans[order][0]=point_x;
        			ans[order++][1]=point_y;
        			System.out.println(ans[order-1][0]+","+ans[order-1][1]);
        		}
        		point_x++;point_y++;
        	}
        	
        	while(point_y>c0) {//从右侧到下侧
        		if(point_x<=R-1&&point_y<=C-1) {
        			ans[order][0]=point_x;
        			ans[order++][1]=point_y;
        			System.out.println(ans[order-1][0]+","+ans[order-1][1]);
        		}
        		point_x++;point_y--;
        	}
        	
        	while(point_x>r0) {//从下侧到左侧
        		if(point_x<=R-1&&point_y>=0) {
        			ans[order][0]=point_x;
        			ans[order++][1]=point_y;
        			System.out.println(ans[order-1][0]+","+ans[order-1][1]);
        		}
        		point_x--;point_y--;
        	}
        	
        	while(point_y<c0) {//从左侧到上侧
        		if(point_x>=0&&point_y>=0) {
        			ans[order][0]=point_x;
        			ans[order++][1]=point_y;
        			System.out.println(ans[order-1][0]+","+ans[order-1][1]);
        		}
        		point_x--;point_y++;
        	}
     	
        }
        return ans;
    }

}
