package YZ.Sort;
import java.util.Arrays;

import YZ.Sort.tools.Asserts;
import YZ.Sort.tools.Integers;
public class Main {

	public static void main(String[] args) {

		
	}
	
	
	static void testSort(){
		// TODO Auto-generated method stub
//		Integer[] array = {7, 3, 5, 8, 6, 7, 4, 5,19,30,40,50};
		Integer[] array = Integers.random(20000, 1, 80000);
		testSorts(array, 
//				new BubbleSort(),
//				new BubbleSort1(),
				new BubbleSort2(),
//				new InsertionSort1(),
//				new InsertionSort2(),
				new InsertionSort3(),
				new SelectionSort(),
				new HeapSort(),
				new CountingSort(),
//				new BubbleSort3(),
				new QuickSort(),
				new ShellSort(),
				new RadixSort(),
				new BucketSort(),
				new MergeSort()
				);
	}
	
	static void testSorts(Integer[] array, Sort... sorts) {
		for (Sort sort : sorts) {
			Integer[] newArray = Integers.copy(array);
			sort.sort(newArray);
			Asserts.test(Integers.isAscOrder(newArray));
//			printArray(newArray);
		}
		Arrays.sort(sorts);
		
		for (Sort sort : sorts) {
			System.out.println(sort);
		}
		
		
	}
	
	static void printArray(Integer[] array) {
		for(int a : array) {
			System.out.println(a);
		}
	}
}
