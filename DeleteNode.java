package linkedlist;
import java.util.Scanner;
public class DeleteNode {
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
	public static Node<Integer> delete(Node<Integer> head, int pos) {
		Node<Integer> prev = head;
//		Node<Integer> next= prev.next;
		
		if(prev==null) {
			return head;
		}
		
		if(pos==0) {
		head=prev.next.next;
		  return head;
		}
		
		for(int i = 0; prev !=null && i<pos-1;i++) {
			prev=prev.next;
		}
		
		
		
		Node<Integer> next=prev.next.next;
		prev.next=next;
		
		
		
		
		
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		print(head);
     delete(head,0);
     System.out.println();
     print(head);
      
        
	}


}
