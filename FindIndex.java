package linkedlist;

import java.util.Scanner;
import java.util.Scanner;
public class FindIndex {
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
	public static void print(Node<Integer> head) {
		
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	
	}
	
	public static int findNode(Node<Integer> head , int n) {
		Node<Integer> temp = head;
		int count = 0;
		while(temp != null) {
			
			if(temp.data == n) {
				return count;
			}
			count++;
			temp=temp.next;
		}
		return -1;
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);
		System.out.println();
		System.out.println(findNode(head,20));
	}

}
