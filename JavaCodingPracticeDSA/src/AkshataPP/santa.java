package AkshataPP;

import java.util.Arrays;

public class santa {
   public static int smart_santa(int N, int[] A, int[] B) {
	   boolean[] count = new boolean[N];
	   int c=N;
	   Arrays.fill(count, false);
	   Arrays.sort(B);
	   
	   for(int i : A) {
		   int j=0;
		   while(j< N) {
			   if(i<=B[j] && count[j]==false) {
				   c--;
				   count[j]=true;
				   break;
			   }
			   j++;
		   }
		   
	   }
	   
	   return c; 
   }
}
