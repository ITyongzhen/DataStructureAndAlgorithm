package YZ.Sort;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort extends Sort<Integer>{

	@Override
	protected void sort() {
		// TODO Auto-generated method stub
	    //最大最小值
	    int max = array[0];
	    int min = array[0];
	    int length = array.length/4;

	    for(int i=1; i<array.length; i++) {
	        if(array[i] > max) {
	            max = array[i];
	        } else if(array[i] < min) {
	            min = array[i];
	        }
	    }

	    //最大值和最小值的差
	    int diff = max - min;

	    //桶列表
	    ArrayList<ArrayList<Integer>> bucketList = new ArrayList<>();
	    for(int i = 0; i < length; i++){
	        bucketList.add(new ArrayList<>());
	    }

	    //每个桶的存数区间
	    float section = (float) diff / (float) (length - 1) ;

	    //数据入桶
	    for(int i = 0; i < array.length; i++){
	        //当前数除以区间得出存放桶的位置 减1后得出桶的下标
	        int num = (int) (array[i] / section) - 1;
	        if(num < 0){
	            num = 0;
	        }
	        bucketList.get(num).add(array[i]);
	    }

	    //桶内排序
	    for(int i = 0; i < bucketList.size(); i++){
	        //jdk的排序速度当然信得过
	        Collections.sort(bucketList.get(i));
	    }

	    //写入原数组
	    int index = 0;
	    for(ArrayList<Integer> arrayList : bucketList){
	        for(int value : arrayList){
	        	array[index] = value;
	            index++;
	        }
	    }
	}

}
