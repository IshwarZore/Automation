package Sorting;

import java.util.Scanner;

public class selectionSort {

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
		
		
		//Selection sort
		for(int i=0; i<arr.length-1;i++) {
			int smallest=i;
			for(int j=i+1;j<arr.length-1;j++) {
				 if (arr[j]<arr[smallest]) {
					 smallest = j;
				 }  			 	
				}
			int temp = arr[i];
			arr[i]= arr[smallest];
			arr[smallest]=temp;
			
			}
			
		
		printArray(arr);
		
	}

}
