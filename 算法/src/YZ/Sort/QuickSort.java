package YZ.Sort;

public class QuickSort<T extends Comparable<T>> extends Sort<T>   {

	@Override
	protected void sort() {
		sort(0, array.length);
	}
	/**
	 * 对 [begin, end) 范围的元素进行快速排序
	 * @param begin
	 * @param end
	 */
	private void sort(int begin,int end) {
		if (end-begin<2) {
			return;
		}
		// 确定轴点位置 O(n)
		int mid  = pivotIndex(begin, end);
		// 对子序列进行快速排序
		sort(begin,mid);
		sort(mid+1, end);
	}

	/**
	 * 构造出 [begin, end) 范围的轴点元素
	 * @return 轴点元素的最终位置
	 */
	private int pivotIndex(int begin,int end) {
		//随机选择一个元素和begin位置的元素进行交换
		swap(begin, begin+(int)Math.random()*(end-begin));
		// 备份begin位置的元素
		T pivot = array[begin];
		end--;
		
		while (begin<end) {
			while (begin<end) {
				if (cmp(pivot, array[end])<0) {
					end--;
				}else {
					array[begin++] = array[end];
					break;
				}
			}
			
			while (begin<end) {
				if (cmp(pivot, array[begin])>0) {
					begin++;
				}else {
					array[end--] = array[begin];
					break;
				}
				
			}
			
			
		}
		
		array[begin] = pivot;
		return begin;
	}
}
