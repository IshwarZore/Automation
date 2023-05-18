package Sorting;
import java.util.*;

public class bubbleSort {

	//Print
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	//Input
	public static int[] inputArray() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length ; i++) {
			arr[i]= sc.nextInt();
		}
		return arr;
	}
	
    public static void main(String args[]) {
		
		int arr[]= inputArray();
		
	
		
		//bubble sort
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		printArray(arr);
		
	}

}
