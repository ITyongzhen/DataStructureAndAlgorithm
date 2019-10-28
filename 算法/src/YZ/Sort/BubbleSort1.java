package YZ.Sort;

public class BubbleSort1<T extends Comparable<T>> extends Sort<T>  {

	@Override
	protected void sort() {
		// TODO Auto-generated method stub
		for (int end = array.length-1; end >0; end--) {
			boolean isSorted = true; //定义布尔值 isSorted来标记是否有交换
			for (int begin = 1; begin <= end; begin++) {
				//ayyay[begin] 小于 ayyay[begin-1] 就交换
				if (cmp(begin, begin-1)<0) {
					swap(begin, begin-1);
					isSorted = false;
				}
			}
			if (isSorted) {
				//来到这里，说明没有交换过。已经是完全有序的了。提前终止排序
				break;
			}
			
		}
	}

}
