package Sorting;

import java.util.Scanner;

public class mergeSort {
	
	// time complexity is n * log n
	
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
		divide(arr,0,x-1);
		printArray(arr);
	}

	//O(log n)
	private static void divide(int[] arr, int si, int ei) {
		
		if(si>=ei) {
			return;
		}
		int mid = si+(ei-si)/2;  // normal average formula (si + ei)/2 uses addition 
		//which may lead to huge memory allocation when the numbers are huge
		divide(arr,si,mid);
		divide(arr,mid+1,ei);
		conquer(arr,si,mid,ei);
		
	}

	//O(n)
	private static void conquer(int[] arr, int si, int mid, int ei) {
		int dummy[]= new int[ei-si+1];
		int x1= si;
		int x2=mid+1;
		int n=0;
		
		while(x1<=mid && x2<=ei) {
			if(arr[x1]<arr[x2]) {
				dummy[n++]=arr[x1++];
			}else {
				dummy[n++]=arr[x2++];
			}
		}
		
		while(x1<=mid) {
			dummy[n++]=arr[x1++];
		}
		while(x2<=ei) {
			dummy[n++]=arr[x2++];
		}
		
		for(int i=0,j=si; i<dummy.length;i++,j++) {
			arr[j]=dummy[i];
		}
		
	}

}
