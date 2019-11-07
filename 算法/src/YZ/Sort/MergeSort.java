package YZ.Sort;

public class MergeSort <T extends Comparable<T>> extends Sort<T> {

	private T[] leftArray;
	@Override
	protected void sort() {
		// TODO Auto-generated method stub
		leftArray = (T[]) new Comparable[array.length>>1];
		sort(0, array.length);
	}

	/**
	 * 对 [begin, end) 范围的数据进行归并排序
	 */
	private void sort(int begin,int end) {
		if (end-begin<2) {
			return;
		}
		int mid = (begin + end)>>1;
		sort(begin, mid);
		sort(mid,end);
		
		merge(begin, mid, end);
		
	}
	/**
	 * 将 [begin, mid) 和 [mid, end) 范围的序列合并成一个有序序列
	 */
	private void merge(int begin, int mid, int end) {
		int li = 0, le = mid-begin; //左边数组（基于leftArray）
		int ri = mid,re=end;//右边数组(基于array)
		int ai = begin; //array的索引
		//备份左边数组
		for (int i = li; i < le; i++) {//拷贝左边数组到leftArray
			leftArray[i] = array[begin+i];
		}
		
		while (li<le) { //左边没有结束
			if (ri<re && cmp(array[ri], leftArray[li])<0) {
				array[ai++] = array[ri++];//拷贝右边数组到array
			}else {
				array[ai++] = leftArray[li++];//拷贝左边数组到array
			}
			
		}//注意，如果cmp比较那里改成<= 就会失去稳定性
	}
}
