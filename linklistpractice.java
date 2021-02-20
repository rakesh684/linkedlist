package linkedlist;
import java.util.ArrayList;
public class linklistpractice {
	public static ArrayList<Integer> removeConsecDuplicate(int arr[]){
		ArrayList<Integer> result = new ArrayList<>();
		result.add(arr[0]);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				result.add(arr[i]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[]= {10,10,20,30,30,40};
		ArrayList<Integer> result = removeConsecDuplicate(arr);
		for(int i:result) {
			System.out.println(i);
		}
		
		
//		ArrayList<Integer> arr = new ArrayList<>();
//		arr.add(10);
//		arr.add(30);
//		arr.add(2,200);
//		
//		for(int i : arr) {
//			System.out.println(i);
//		}
//		for(int i=0;i<arr.size();i++) {
//			System.out.println(arr.get(i));
//		}
//		System.out.println(arr.size());
//		System.out.println(arr.get(2));
	}

}
