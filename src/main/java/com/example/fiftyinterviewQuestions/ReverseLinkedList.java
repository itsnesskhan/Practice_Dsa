package com.example.fiftyinterviewQuestions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
class LinkedListNode<T>{
	
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		super();
		this.data = data;
	}
	
	
}


public class ReverseLinkedList {
	
	public static <T> void  printList(LinkedListNode<T> head) {
		while (head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	private static <T> LinkedListNode<T> reverse(LinkedListNode<T> head) {
		LinkedListNode<T> current = head;
		LinkedListNode<T> previous = null;
		LinkedListNode<T> next = null;
		
		while (current!= null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
		return previous;
	}
	
	private static <T> LinkedListNode<T> findMiddle(LinkedListNode<T> head) {
		
		LinkedListNode<T> slow = head;
		LinkedListNode<T> fast = head;
		
		while (fast != null && fast.next !=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}
	
	private static <T> boolean isPalindrome(LinkedListNode<T> head) {
		
		if (head==null) {
			return true;
		}
		
		LinkedListNode<T> middle = findMiddle(head);
		LinkedListNode<T> last = reverse(middle.next);
		
		
		
		LinkedListNode<T> current = head;
		
		while(last!=null) {
			if (!current.data.equals(last.data)) {
				return false;
			}
			
			current = current.next;
		    last    = last.next;
		}
		
		return true;
	}

	public static void main(String[] args) {
		LinkedListNode<Integer> head =  new LinkedListNode<>(23);
		head.next =  new LinkedListNode<>(13);
		head.next.next =  new LinkedListNode<>(3);
		head.next.next.next =  new LinkedListNode<>(9);
		head.next.next.next.next =  new LinkedListNode<>(11);
		
		printList(head);
		System.out.println();
		System.out.println("**************************************");
		LinkedListNode<Integer> rev = reverse(head);
		System.out.println();
		printList(rev);
		System.out.println();
		System.out.println("*******************************");
		LinkedListNode<Integer> middle = findMiddle(rev);
		System.out.println();
		System.out.println("middle element : "+middle.data);
		
		System.out.println("******************************");
		
		boolean palindrome = isPalindrome(rev);
		System.out.println("Is Palindrome : "+palindrome);
	}

	

	

	

	
}
