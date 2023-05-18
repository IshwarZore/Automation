package Sorting;

import java.util.Scanner;

public class checkIfSorted {
	//Input
			public static int[] inputArray() {
				Scanner sc = new Scanner(System.in);
				int[] arr = new int[5];
				
				for(int i=0; i<arr.length ; i++) {
					arr[i]= sc.nextInt();
				}
				return arr;
			}
			
			public static Boolean check(int arr[],int x) {
				
				if(x==arr.length-1) {
					return true;
				}
				
				if(arr[x]<arr[x+1]) {
					return check(arr,x+1);
				}else {
					return false;
				}
			}

			public static void main(String args[]) {
				
				int arr[]= inputArray();
				if(check(arr,0)) {
					System.out.print("The array is strictly sorted.");
				}else {
					System.out.print("The array is NOT strictly sorted.");
				}
				
			}

}
