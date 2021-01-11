package linkedlist;

import java.util.Scanner;

public class LengthOfList {
	
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
	public static int lengthOfList(Node<Integer> head){
		int count=0;
		while(head != null) {
			count++;
			head=head.next;
		}
		return count;
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();		 
		 int head1 = lengthOfList(head);
        System.out.println(head1);
	}

}
