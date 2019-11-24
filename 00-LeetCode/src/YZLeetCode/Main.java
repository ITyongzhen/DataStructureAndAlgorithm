package YZLeetCode;




import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.imageio.event.IIOReadProgressListener;


public class Main {
	public static void main(String[] args) {
		_524_通过删除字母匹配到字典里最长单词 a = new _524_通过删除字母匹配到字典里最长单词();
		
		List<String> list = new LinkedList<>();
		list.add("ale");
		list.add("apple");
		list.add("monkey");
		list.add("plea");
		
		String string = "abpcplea";
		String st = a.findLongestWord(string, list);
//		String string =	a.findLongestWord("abpcplea", list);
	}
}
