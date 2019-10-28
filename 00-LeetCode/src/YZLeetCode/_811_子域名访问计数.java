package YZLeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

//https://leetcode-cn.com/problems/subdomain-visit-count/
public class _811_子域名访问计数 {
	HashMap<String, Integer> map = new HashMap<>();

	
	
 public List<String> subdomainVisits(String[] cpdomains) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < cpdomains.length; i++) {
			setKeyAndVal(cpdomains[i]);
		}

		for (String key : map.keySet()) {
			String str = map.get(key) + " " + key;
			list.add(str);
		}
		return list;
	}

 private void setKeyAndVal(String str) {
		String[] firstArr = str.split(" ");
		int num = Integer.parseInt(firstArr[0]);
		
		String ss= firstArr[1];
		String[] arr = ss.split("\\.");
		
		int totalLength = 0;
		
		if (map.containsKey(ss)) {
			Integer val = map.get(ss);
			val += num;
			map.put(ss, val);
		} else {
			map.put(ss, num);
		}
		
		for (int i = 0; i < arr.length-1; i++) {
			totalLength += arr[i].length()+1;
			String newStr = ss.substring(totalLength, ss.length());
			if (map.containsKey(newStr)) {
				Integer val = map.get(newStr);
				val += num;
				map.put(newStr, val);
			} else {
				map.put(newStr, num);
			}
		}

	}
}
