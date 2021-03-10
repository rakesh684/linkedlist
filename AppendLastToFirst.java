package linkedlist;

import java.util.Scanner;

public class AppendLastToFirst {
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data=s.nextInt();
		
		Node<Integer> head = null,tail=null;
		while(data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			if(head == null) {
				head=currentNode;
				tail=currentNode;
			}
			else {
				tail.next=currentNode;
				tail=currentNode;
			}
			
			data=s.nextInt();
		}
		return head;
		
	}
	
	public static int countNode(Node<Integer> head) {
		if(head == null) {
			return 0;
		}
		return 1+countNode(head.next);
	}
	
	public static Node<Integer> appendLastToFirst(Node<Integer> head , int n){
		int NodeLength = countNode(head);
		if(NodeLength !=n && n<NodeLength) {
		int count = NodeLength-n;	
		
		Node<Integer> prev=null;
		Node<Integer> temp = head;
		while(count>0) {
			prev=temp;
			temp=temp.next;
			count--;
		}
			prev.next=null;
			Node<Integer> tempHead=head;
			head=temp;
			while(temp.next != null) {
				temp=temp.next;
				
			}
			temp.next=tempHead;
			
		}
		return head;
	}
	public static void print(Node<Integer> head) {
		
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	
	}
	

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);
		System.out.println();
		 appendLastToFirst(head,3);
		 print(head);
	}

}
