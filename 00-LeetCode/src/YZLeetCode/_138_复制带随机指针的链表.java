package YZLeetCode;

import java.util.HashMap;

//https://leetcode-cn.com/problems/copy-list-with-random-pointer/
public class _138_复制带随机指针的链表 {
	 HashMap<Node, Node> visitedHashMap = new HashMap<>();
	 public Node copyRandomList(Node head) {
		 if (head == null) {
			return null;
		}

		 if (visitedHashMap.containsKey(head)) {
			return visitedHashMap.get(head);
		}
		 
		 Node newNode = new Node(head.val,null,null);
		visitedHashMap.put(head, newNode);
		newNode.next = copyRandomList(head.next);
		newNode.random = copyRandomList(head.random);
		
		 
		 return newNode;
	 }
}

class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
