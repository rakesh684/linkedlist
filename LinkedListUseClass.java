package linkedlist;

import java.util.Scanner;

public class LinkedListUseClass {
//	public static Node<Integer> createLinkedList(){
//		Node<Integer> n1 = new Node<>(10);
//		Node<Integer> n2 = new Node<>(20);
//		Node<Integer> n3 = new Node<>(30);
//		Node<Integer> n4 = new Node<>(40);
//		n1.next=n2;
//		n2.next=n3;
//		n3.next=n4;
//		return n1;
//	}
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data= s.nextInt();
//		here we need head of linked list
		Node<Integer> head = null,tail=null;//here only reference is created as 
//		we are not sured the input is not -1
		
//		since till -1 is not inserted as input we have to keep taking input
		while(data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			if(head == null || tail==null) {
				//make this node as head node
				head = currentNode;
				tail=currentNode;
			}
			else {
//				Node<Integer> tail = head;
//				while(tail.next != null) {
//					tail = tail.next;
//				}
				//Now tail will reffer to last node
				//connect current node after last node
				tail.next = currentNode;
				tail=currentNode;
			}
			data = s.nextInt();
			
		}
		return head;
		
		
	}
	
	
	public static void print(Node<Integer> head) {
		System.out.println(head);
		
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
			
		}
		
//		System.out.println(head.data);
//		System.out.println(head.next.next.data);
	}

	public static void main(String[] args) {
		
		Node<Integer> head = takeInput();//createLinkedList();
		print(head);
		
		// TODO Auto-generated method stub
////       Node n; this create only reference note node
////		cerating node with type as
//		Node<Integer> n1 = new Node<>(10);
//		System.out.println(n1.data);//this will print data of node
//		System.out.println(n1.next);//this will print value of next node
	}

}
