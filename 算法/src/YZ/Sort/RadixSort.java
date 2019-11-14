package YZ.Sort;

public class RadixSort extends Sort<Integer> {

	@Override
	protected void sort() {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i]>max) {
				max = array[i];
			}
		}
		// 个位数: array[i] / 1 % 10 = 3
		// 十位数：array[i] / 10 % 10 = 9
		// 百位数：array[i] / 100 % 10 = 5
		// 千位数：array[i] / 1000 % 10 = ...
		for (int divider = 1; divider <= max; divider*=10) {
			sort(divider);
		}
		
	}
	
	protected void sort(int divider) {
		// TODO Auto-generated method stub

		// 开辟内存空间，存储次数
		int[] counts = new int[10];
		// 统计每个整数出现的次数
		for (int i = 0; i < array.length; i++) {
			counts[array[i]/divider%10]++;
		}// O(n)
		
		// 累加次数
		for (int i = 1; i < counts.length; i++) {
			counts[i]+= counts[i-1];
		}
		
		//从后向前遍历元素，将她放在有序数组中的合适位置
		int[] newArray = new int[array.length];
		for (int i = array.length-1; i >=0 ; i--) {
			//获取元素在counts中的索引
			int index = array[i]/divider%10;
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
