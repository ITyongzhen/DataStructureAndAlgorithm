package YZ.Sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ShellSort <T extends Comparable<T>> extends Sort<T> {

	@Override
	protected void sort() {
		// TODO Auto-generated method stub
		List<Integer> stepSequence = sedgewickStepSequence();
		for (Integer step : stepSequence) {
			sort2(step);
		}
	}
	/**
	 * 分成step列进行排序
	 */
	private void sort(int step) {
		// col : 第几列，column的简称
		for (int col = 0; col < step; col++) { // 对第col列进行排序
			// col、col+step、col+2*step、col+3*step
			for (int begin = col + step; begin < array.length; begin += step) {
				int cur = begin;
				while (cur > col && cmp(cur, cur - step) < 0) {
					swap(cur, cur - step);
					cur -= step;
				}
			}
		}
	}

	private void sort2(int step) {
		// col : 第几列，column的简称
	 for (int col = 0; col < step; col++) { // 对第col列进行排序
		for (int begin = step+col; begin < array.length; begin+=step) {
			int cur = begin;
			T res =array[cur];
			while (cur>col && cmp(res,array[cur-step])<0) {
				array[cur] = array[cur-step];
				cur-=step;
			}
			array[cur] = res;
		 }
		}
	}

	/*
	获取步长序列
	*/
	private List<Integer> shellStepSequence() {
		List<Integer> stepSequence = new ArrayList<>();
		int step = array.length;
		while ((step >>= 1) > 0) {
			stepSequence.add(step);
		}
		return stepSequence;
	}

	/*
	获取最优步长
	*/
	private List<Integer> sedgewickStepSequence() {
		List<Integer> stepSequence = new LinkedList<>();
		int k = 0, step = 0;
		while (true) {
			if (k % 2 == 0) {
				int pow = (int) Math.pow(2, k >> 1);
				step = 1 + 9 * (pow * pow - pow);
			} else {
				int pow1 = (int) Math.pow(2, (k - 1) >> 1);
				int pow2 = (int) Math.pow(2, (k + 1) >> 1);
				step = 1 + 8 * pow1 * pow2 - 6 * pow2;
			}
			if (step >= array.length) break;
			stepSequence.add(0, step);
			k++;
		}
		return stepSequence;
	}
}
