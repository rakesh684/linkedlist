package linkedlist;
//import java.util.LinkedList;
import java.util.Scanner;
public class InsertNewNode {
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
//
	public static void print(Node<Integer> head) {
	
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	
	}
	public static Node<Integer> insert(Node<Integer> head , int ele,int pos){
         Node<Integer> nodeToBeInserted = new Node<Integer>(ele);
		if(pos == 0) {
			nodeToBeInserted.next = head;
			
//			head = nodeToBeInserted;
			return nodeToBeInserted;
		}
         int count=0;
		Node<Integer> prev = head;
		while(count < pos-1 && prev!=null) {
			
			prev = prev.next;
			count++;
		}
		if(prev != null) {
			 
			 nodeToBeInserted.next=prev.next;
			 prev.next= nodeToBeInserted;
		   
		     
		}
		return head;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
//		print(head);
      head = insert(head,30,0);
        print(head);
        
	}

}
