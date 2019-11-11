package YZ.Sort;

public class CountingSort extends Sort<Integer>{

	protected void sort() {
		//找出最大值
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i]>max) {
				max= array[i];
			}
		}// O(n)
		
		// 开辟内存空间，存储每个整数出现的次数
		int[] counts = new int[max+1];
		// 统计每个整数出现的次数
		for (int i = 0; i < array.length; i++) {
			counts[array[i]]++;
		}// O(n)
		
		// 根据整数的出现次数，对整数进行排序
		int index = 0;
		for (int i = 0; i < counts.length; i++) {
			while (counts[i]-->0) {
				array[index++] = i;
				
			}
		}// O(n)
		
		
	}

	
	protected void sort2() {
		//找出最大值和最小值
		int max = array[0];
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i]>max) {
				max= array[i];
			}
			if (array[i]<min) {
				min= array[i];
			}
		}// O(n)
		
		// 开辟内存空间，存储次数
		int[] counts = new int[max-min+1];
		// 统计每个整数出现的次数
		for (int i = 0; i < array.length; i++) {
			counts[array[i]-min]++;
		}// O(n)
		
		// 累加次数
		for (int i = 1; i < counts.length; i++) {
			counts[i]+= counts[i-1];
		}
		
		//从后向前遍历元素，将她放在有序数组中的合适位置
		int[] newArray = new int[array.length];
		for (int i = array.length-1; i >=0 ; i--) {
			//获取元素在counts中的索引
			int index = array[i]-min;
			//获取元素在counts中的值
			//counts[index];
			//放在合适位置
			newArray[--counts[index]] = array[i];
		}
		
		// 将有序数组赋值到array
		for (int i = 0; i < newArray.length; i++) {
			array[i] = newArray[i];
		}
	}

}
