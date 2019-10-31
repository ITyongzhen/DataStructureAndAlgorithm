package YZLeetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.imageio.event.IIOReadProgressListener;

public class Main {
	public static void main(String[] args) {
		_841_钥匙和房间 abc = new _841_钥匙和房间();
		//[[1,3],[3,0,1],[2],[0]]
	//{{1,3},{3,0,1},{2},{0}};
		List<Integer> list1 = Arrays.asList(1,3);
		List<Integer> list2 = Arrays.asList(3,0,1);
		List<Integer> list3 = Arrays.asList(2);
		List<Integer> list4 = Arrays.asList();
		
		List<List<Integer>> rooms = new ArrayList<List<Integer>>() {{
			add(list1);
			add(list2);
			add(list3);
			add(list4);
		}};
		
		boolean res =abc.canVisitAllRooms(rooms);
	}
}
