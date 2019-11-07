package YZ.Sort;

public class InsertionSort1<T extends Comparable<T>> extends Sort<T> {

	@Override
	protected void sort() {
		// TODO Auto-generated method stub
		for (int begin = 1; begin < array.length; begin++) {
			int cur = begin;
			while (cur>0 && cmp(array[cur],array[cur-1])<0) {
				swap(cur, cur-1);
				cur--;
			}
			
		}
	}

}
