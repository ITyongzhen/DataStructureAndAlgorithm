package YZLeetCode;
//https://leetcode-cn.com/problems/hamming-distance/
public class _461_汉明距离 {
	public int hammingDistance(int x, int y) {
        int res = 0;
        while(x!= 0 || y!= 0){
            
            if((x&1) != (y&1) ){
                res++;
            }
            x>>=1;
            y>>=1;
        }
        return res;
    }
	
	
	public int hammingDistance2(int x, int y) {
        return Integer.bitCount(x^y);
    }
}
