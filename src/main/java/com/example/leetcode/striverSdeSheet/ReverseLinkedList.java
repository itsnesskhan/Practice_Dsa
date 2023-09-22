package com.example.leetcode.striverSdeSheet;

import java.util.ArrayList;
import java.util.LinkedList;

class LinkedListNode<T> 
{
	T data;
	LinkedListNode<T> next;
	public LinkedListNode(T data) 
	{
		this.data = data;
	}
	@Override
	public String toString() {
		return "LinkedListNode [data=" + data + ", next=" + next + "]";
	}
	
	
	
}

public class ReverseLinkedList {

	public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
		 LinkedListNode<Integer> currentNode = head;
	        LinkedListNode<Integer> previousNode = null;

	        while (currentNode != null) {
	            LinkedListNode<Integer> nextNode = currentNode.next;
	            currentNode.next = previousNode;
	            previousNode = currentNode;
	            currentNode = nextNode;
	        }

	     return previousNode;
    }
	
	public static void printLinkedList(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
	

	public static LinkedListNode<Integer> findMiddle(LinkedListNode<Integer> head)
    {
		
		LinkedListNode<Integer> fast = head;
		LinkedListNode<Integer> slow = head;
		
		while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
		return slow;
    }
	
	
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		
		if (head == null || head.next == null) {
            return true; 
        }
		LinkedListNode<Integer> middle = findMiddle(head);
		LinkedListNode<Integer> last = reverseLinkedList(middle.next);
		
		LinkedListNode<Integer> cur = head;
		
		while (last!=null) {
			if (!cur.data.equals(last.data)) {
				return false;
			}
			
			last = last.next;
			cur = cur.next;
		}
		return true;
	}
	
	public static void main(String[] args) {
//		LinkedListNode<Integer> head = new LinkedListNode<Integer>(12);
//		head.next = new LinkedListNode<Integer>(6);
//		head.next.next = new LinkedListNode<Integer>(8);
//		head.next.next.next = new LinkedListNode<Integer>(21);
//		head.next.next.next.next = new LinkedListNode<Integer>(9);
		
		LinkedListNode<Integer> head = new LinkedListNode<Integer>(12);
		head.next = new LinkedListNode<Integer>(6);
		head.next.next = new LinkedListNode<Integer>(6);
		head.next.next.next = new LinkedListNode<Integer>(12);
		head.next.next.next.next = new LinkedListNode<Integer>(9);
		
//		LinkedListNode<Integer> head = new LinkedListNode<Integer>(-1);
		
		System.out.println("LinkedList :");
		printLinkedList(head);
		
		head = reverseLinkedList(head);
		System.out.println("Reverse LinkedList :");
		printLinkedList(head);
		
		System.out.println("middle element :"+findMiddle(head));
		System.out.println(isPalindrome(head));
		
		
		
	}
}
