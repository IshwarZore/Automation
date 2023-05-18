package Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class countSort {

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
	//int arr[]= inputArray();
	 int arr[] = { 170, 45, 75, 90, 802, 24, 26, 66 };
     int n = arr.length;

     // Function Call
     radixsort(arr, n);
	
	
	printArray(arr);
}

private static void radixsort(int[] arr, int n) {
	int m= Arrays.stream(arr).max().getAsInt();
	
	for(int e=1; m/e>0; e=e*10) {
		countSort(arr, n, e);
	}
	
}

private static void countSort(int[] arr, int n, int e) {
	
	int count[]= new int[10];
	
	Arrays.fill(count,0);
	
	for (int i : arr) {
		count[(i/e)%10]++;
	}
	
	for(int i=1; i<10;i++) {
		count[i]= count[i]+count[i-1];
	}
	
	int[]out = new int[n];
	
	for(int i= n-1; i>=0; i--) {
		out[count[(arr[i]/e)%10]-1]= arr[i];
		count[(arr[i]/e)%10]--;
	}
	for(int i=n-1; i>=0;i--) {
		arr[i]=out[i];
		}
	
}

}
