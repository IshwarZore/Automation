package Sorting;

import java.util.Scanner;

public class quickSort {
	
	// time complexity worst is n^2 and average is n*log n
	//worst time complexity happens when either every pivot element is the largest (already in ascending order)
	//or when every pivot element is smallest (already in descending order)
	//BUT STILL Quick sort is preferred over merge sort because 1. NO EXTRA ARRAY TO BE MADE 2. Worst case is very rare
	
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
		
		public static void main (String args[]) {
			int arr[]= inputArray();
			int x = arr.length;
			quick(arr,0,x-1);
			printArray(arr);
		}

		private static void quick(int[] arr, int low, int high) {
			
			if (low<high) {
				int p= partition(arr,low,high);
				quick(arr,low,p-1);
				quick(arr,p+1,high);
			}
			
			}

		private static int partition(int[] arr, int low, int high) {
			
			int pivot = arr[high];
			int i=low-1;
			for(int j=low;j<high;j++) {
				if(pivot>arr[j]) {
					i++;
					//swap
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			} 
			i++;
			//swap
			int temp = arr[i];
			arr[i]=pivot;
			arr[high]= temp;
			
			
			
			return i;
		}
			
}



