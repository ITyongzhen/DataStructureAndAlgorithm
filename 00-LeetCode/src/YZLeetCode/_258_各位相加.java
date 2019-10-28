package YZLeetCode;

public class _258_各位相加 {
	 public int addDigits(int num) {
		 int temp = 0;
	        while (num>=10) {
				temp += num%10;
				num = num/10;
			}
	        temp+= num;
	        if (temp>=10) {
				return addDigits(temp);
			}
	        
	        return temp;
	    }
}
