package YZLeetCode;
//https://leetcode-cn.com/problems/is-subsequence/
public class _392_判断子序列 {
	
	public static void main(String[] args) {
		boolean res = isSubsequence("abu", "asdbwrded");
		System.out.println(res);
	}
	
	static public boolean isSubsequence(String s, String t) {
	        int index=-1;
	        for(char c:s.toCharArray()){
	            index=t.indexOf(c,index+1);
	            if(index==-1)
	                return false;
	        }
	        return true;

	    }
	 
	public boolean isSubsequence2(String s, String t) {
        
		if (s.length() == 0 ) {
			return true;
		}
		
		if (s==null || t.length() == 0 || t==null) {
			return false;
		}
		
		 char[] tArray = t.toCharArray(); 
		 char[] sArray = s.toCharArray(); 
	      int sindex = sArray.length-1;
	        for (int i=tArray.length-1; i>=0; i--){ 
	           Character cur = sArray[sindex]; 
	           
	           if (tArray[i] == cur) {
	        	   sindex--;
	           }
	           if (sindex==-1) {
				break;
	           }
	        } 
		
		
		
		return sindex==-1;
    }
}
