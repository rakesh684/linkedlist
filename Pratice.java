package linkedlist;
import java.util.Scanner;
public class Pratice {
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<>(5);
		System.out.println(n1);
		Node<Integer> n2 = new Node<>(10);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		Node<Integer> n5 = new Node<>(50);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
//		n5.next=null;
		return n1;
		
	}
	public static void print(Node<Integer> head) {
          System.out.println(head);
		
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
		}
	}

	public static int length(Node<Integer> head) {
		int count = 0;
		Node<Integer> temp = head;
		while(temp != null) {
			count ++;
			temp = temp.next;
		}
		return count;
	}
	
	public static void printIthNode(Node<Integer>head) {
		int count = 0;
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		Node<Integer> temp = head;
		
		if(i>=0) {
			while(temp != null && count<i) {
				count++;
				temp = temp.next;
				if(count == i) {
					System.out.println(temp.data);
					
				}	
			}
		}
			else {
				return;
			}
		}
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head =createLinkedList();
		print(head);
		System.out.println();
		System.out.println(head);
//		System.out.println();
		System.out.println(length(head));
		printIthNode(head);
       
	}

}
