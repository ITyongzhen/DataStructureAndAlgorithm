package YZLeetCode;

import java.sql.Time;

//https://leetcode-cn.com/problems/reverse-nodes-in-k-group/
public class _25_K个一组翻转链表 {
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode resListNode = reverseKGroup(head, 3);
		System.out.println(resListNode);
	}
	
		static public ListNode reverseKGroup2(ListNode head, int k) {
				 if (head == null || head.next == null || k==0) {
					return head;
				}	
				 
				 ListNode newHead = null;
				 ListNode tail= null;
				 ListNode nextNode = null;
				 int time = 0;
				 while (head != null) {
					 ListNode temp = head.next;
					tail = head;
					 nextNode = head.next;
					head.next = newHead;
					newHead = head;
					head =temp;
				
					
					if (++time==k) {
						break;
					}
				 }
				 
				 if (head != null) {
					 tail.next =  reverseKGroup(nextNode, k);
				}
				 
				 return newHead;
		    }
	 
		static public ListNode reverseKGroup(ListNode head, int k) {
			 if (head == null || head.next == null) {
					return head;
				}
			 ListNode dump= new ListNode(0);
			 dump.next = head;
			 ListNode pre= dump;
			 ListNode[] listNodeArr = new ListNode[k];
			 while (getEnoughLength(head, k)) {
				for (int i = 0; i < listNodeArr.length; i++) {
					listNodeArr[i] = head;
					head = head.next;
				}
				 
				pre.next = listNodeArr[k-1];
				setNext(listNodeArr, k);

				pre = listNodeArr[0];
				head = listNodeArr[0].next;

			}
			 
			 return dump.next;
			 
		 }
		
		static private void setNext(ListNode[] listNodeArr,int k) {
			ListNode nextNode = listNodeArr[k-1].next;
			for (int i = listNodeArr.length-1; i >0 ; i--) {
				listNodeArr[i].next = listNodeArr[i-1];
			}
			listNodeArr[0].next = nextNode;
		}
	 
	static	private boolean getEnoughLength(ListNode node,int k) {
			ListNode temp = node;
			while (temp != null && k>0) {
				temp = temp.next;
				k--;
			}
			return k==0?true:false;
		}
	 
}
