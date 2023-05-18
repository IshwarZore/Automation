package Sorting;

import java.util.Scanner;

public class insertionSort {
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
				
			
			//insertion sort
			for(int i=1; i<arr.length;i++) {
				int current= arr[i];
				int j= i-1;
				while(j>=0 && arr[j]>current) {
					arr[j+1]=arr[j];
					j--;
				}
				arr[j+1]=current;
				}
			
			printArray(arr);
			
		}

}
