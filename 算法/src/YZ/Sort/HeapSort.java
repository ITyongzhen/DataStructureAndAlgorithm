package YZ.Sort;

public class HeapSort <T extends Comparable<T>> extends Sort<T>{

	private int heapSize;
	@Override
	protected void sort() {
		// 原地建堆  自下而上的下滤
		heapSize = array.length;
		// heapSize>>1-1 第一个非叶子节点的下标
		for (int i = (heapSize>>1)-1; i >=0; i--) {
			siftDown(i);
		}
		
		while (heapSize>1) {
			// 交换堆顶元素和尾部元素
			swap(0, heapSize-1);
			//堆顶元素最大放到尾部了。下次就不需要考虑这个了。所以size要减1
			heapSize--;
			// 下滤 维护堆的性质
			siftDown(0);
		}
	}
	
	//让index位置的元素下滤
	private void siftDown(int index) {
		// 取出要下滤的坐标的值
		T element = array[index];
		int half = heapSize>>1;
		// 第一个叶子节点的索引 == 非叶子节点的数量
		// index<第一个叶子节点的索引
		// 必须保证index位置是非叶子节点
		while (index<half) {
			// index的节点有2种情况
			// 1.只有左子节点
			// 2.同时有左右子节点
						
			// 默认为左子节点跟它进行比较
			int childIndex = (index<<1)+1;
			T child = array[childIndex];
			// 右子节点
			int rightIndex = childIndex +1;
			// 选出左右子节点最大的那个
			if (rightIndex<heapSize && cmp(array[rightIndex], child)>0) {
				childIndex = rightIndex;
				child = array[childIndex];
			}
			
			if (cmp(element, child)>=0) {
				break;
			}
			// 将子节点存放到index位置
			array[index]= child;
			// 重新设置index
			index = childIndex;
		}
		// 将目标值存放到最终的index位置
		array[index] = element;
		
	}
}
