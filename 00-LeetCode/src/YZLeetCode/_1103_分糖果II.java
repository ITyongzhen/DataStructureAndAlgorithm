package YZLeetCode;

import java.util.ArrayList;

//https://leetcode-cn.com/problems/distribute-candies-to-people/
public class _1103_分糖果II {
	
	public static void main(String[] args) {
		distributeCandies(60, 4);
	}
	
	static public int[] distributeCandies(int candies, int num_people) {
        int lun = 1;
        int[] arr = new int[num_people];
        
        while (candies>0) {
        	for (int i = 0; i < num_people; i++) {
            	if (candies>0) {
            		int temp = i+1+(lun-1)*num_people;
    				if (candies>temp) {
    					arr[i]+=temp;
    					candies -= temp;
    				}else {
    					arr[i]+= candies;
    					candies = 0;
    				}
    			}else {
    				break;
    			}
    		
    		}
        	lun++;
		}
        
        return arr;
    }
}
