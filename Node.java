package linkedlist;

//public class Node {
//	
//	int data;
////	class of next node will same as the previous so we have created
////	class of next node as Node where next is variable
//	Node next;
//	Node(int data){
//		this.data=data;
////		next=null; this doesnot required as default value of any reference is null
//	}
//	
//written code with genericpublic class Node {
public class Node<T>{
	T data;
	
	Node<T> next;
	Node(T data){
		this.data=data;
		
	}



}
