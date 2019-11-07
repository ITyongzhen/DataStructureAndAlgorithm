package YZ.Sort;import java.util.zip.Checksum;

public class InsertionSort2<T extends Comparable<T>> extends Sort<T>  {

	@Override
	protected void sort() {
		for (int begin = 1; begin < array.length; begin++) {
			int cur = begin;
			T res =array[cur];
			while (cur>0 && cmp(res,array[cur-1])<0) {
				array[cur] = array[cur-1];
				cur--;
			}
			array[cur] = res;
		}
		
	}

}
