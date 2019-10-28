package YZLeetCode;

import java.util.HashMap;
import java.util.Iterator;

//https://leetcode-cn.com/problems/unique-email-addresses/
public class _929_独特的电子邮件地址 {
	
	public static void main(String[] args) {
		String[] arr = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		int res = numUniqueEmails(arr);
	}
	
	static public int numUniqueEmails(String[] emails) {
		int res = 0;
		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i < emails.length; i++) {
			String string = getRealEmail(emails[i]);
			if (!map.containsKey(string)) {
				res++;
				map.put(string, string);
			}
		}
		return res;
	}

	static private String getRealEmail(String str) {
		char[] arr = str.toCharArray();
		StringBuffer stringBuf = new StringBuffer();
		boolean end = false;
		boolean afterPlus = false;
		for (int i = 0; i < arr.length; i++) {

			if (end) {
				stringBuf.append(arr[i]);
			} else if (arr[i] == '@') {
				end = true;
				stringBuf.append(arr[i]);
				continue;
			}else if (arr[i] == '.') {

			} else if (arr[i] == '+') {
				afterPlus = true;
			} else {

				if (!afterPlus) {
					stringBuf.append(arr[i]);
				}

			}
		}

		return stringBuf.toString();
	}
}
