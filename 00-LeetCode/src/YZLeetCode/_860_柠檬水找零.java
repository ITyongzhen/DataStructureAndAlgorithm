package YZLeetCode;

import java.util.prefs.BackingStoreException;

import javax.swing.plaf.basic.BasicCheckBoxUI;

//https://leetcode-cn.com/problems/lemonade-change/
public class _860_柠檬水找零 {
	 public boolean lemonadeChange(int[] bills) {
	        int fiveNum=0;
	        int tenNum = 0;
	        boolean res = true;
	        for (int i = 0; i < bills.length; i++) {
				if (bills[i] == 5) {
					fiveNum++;
				}else if (bills[i] == 10) {
					tenNum++;
					if (fiveNum >=1) {
						fiveNum--;
					}else {
						res = false;
						break;
					}
				}else {
					if (fiveNum >=1 && tenNum>=1) {
						fiveNum--;
						tenNum--;
					}else if (fiveNum >=3) {
						fiveNum -= 3;
					}else {
						res = false;
						break;
					}
				}
			}
	        
	       
	        return res;
	        
	    }
}
