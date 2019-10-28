package YZLeetCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _341_扁平化嵌套列表迭代器  implements Iterator<Integer>{
	
	List<Integer> resList;
	int index;
	 public _341_扁平化嵌套列表迭代器(List<NestedInteger> nestedList) {
		 resList = new ArrayList<>();
		 index = 0;
		 addInteger(nestedList);
	    }
	 
	 	private void addInteger(List<NestedInteger> nestedList) {
			for (NestedInteger nestedInteger : nestedList) {
				if (nestedInteger.isInteger()) {
					resList.add(nestedInteger.getInteger());
				}else {
					List<NestedInteger> list = nestedInteger.getList();
					addInteger(list);
				}
			}
		}

	    @Override
	    public Integer next() {
	    	if (hasNext()) {
	    		 return resList.get(index++);
			}
	    	return null;
	      
	    }

	    @Override
	    public boolean hasNext() {
	       return index != resList.size()-1; 
	    }
}
