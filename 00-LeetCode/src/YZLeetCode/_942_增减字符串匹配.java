package YZLeetCode;
//https://leetcode-cn.com/problems/di-string-match/comments/
public class _942_增减字符串匹配 {
	public static void main(String[] args) {
		diStringMatch("IDID");
	}
	static public int[] diStringMatch(String S) {
		char[] s=S.toCharArray();
		int[] res = new int[S.length()+1];
		int left = 0;
		int right = S.length();
		for (int i = 0; i < s.length; i++) {
			if (s[i] == 'D') {
				res[i] = right--;
				
			}else {
				res[i]= left++;
			}
		}
		res[s.length] = left;
		return res;
		
	}
	static public int[] diStringMatch2(String S) {
	        char[] s=S.toCharArray();
	        int[] result=new int[s.length+1];
	        int left=0;
	        int right=s.length;
	        for(int i=0;i<s.length;i++){
	            if(s[i]=='D'){
	                result[i]=right;
	                right--;
	            }else{
	                result[i]=left;
	                left++;
	            }
	        }
	        result[s.length]=left;
	        return result;
	    }
}
