package YZ.Sort;
import YZ.Sort.*;
public class BubbleSort<T extends Comparable<T>> extends Sort<T>  {

	@Override
	protected void sort() {
		for (int end = array.length-1; end>0; end--) {
			for (int begin = 1; begin <= end; begin++) {
				
				if (cmp(begin, begin-1)<0) {
					//ayyay[begin] 小于 ayyay[begin-1] 就交换
					swap(begin, begin-1);
				}
			}
		}
	}

}
