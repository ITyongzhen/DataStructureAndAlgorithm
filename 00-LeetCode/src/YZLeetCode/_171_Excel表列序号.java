package YZLeetCode;

public class _171_Excel表列序号 {
	
	public static void main(String[] args) {
		titleToNumber("AB");
	}
	
	
	static public int titleToNumber(String s) {
	     char[] cha = s.toCharArray();
	     int sum = 0;
	  for (int i = cha.length-1; i >=0 ; i--) {
		Character c = cha[i];
		sum+=(c-'A'+1)*Math.pow(26, cha.length -i-1);
	  }
	     
	     return sum;
	    }
}
