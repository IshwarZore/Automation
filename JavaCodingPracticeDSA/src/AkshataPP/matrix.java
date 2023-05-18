package AkshataPP;

public class matrix {
	public static int flip (int [][] A, int [][] B) {
		
		int n = A.length;
		int m = A[0].length;
		int row=0;
		int col=0;
		int count=0;
		
		if(n<2 || m<2) {
			return -1;
		}
		
		
		
		while(row<n) {
			if(A[row][col]!=B[row][col]) {
			 if(row+1==n || col+1==m) {
				 return -1;
			 }
			 int tr=row;int tc= col; int x=-5;
			 
				 if(A[tr][tc]!=B[tr][tc]) {
					
					 x++;
				 }
				 if(A[tr+1][tc+1]!=B[tr+1][tc+1]) {
					 
					 x++;
				 }
				 if(A[tr][tc+1]!=B[tr][tc+1]) {
					 
					 x++;
				 }
				 if(A[tr+1][tc]!=B[tr+1][tc]) {
					
					 x++;
				 }
				 if(x!=-1) {
					 return -1;
				 }else {
					 A[tr][tc]=B[tr][tc];
					 A[tr+1][tc+1]=B[tr+1][tc+1];
					 A[tr][tc+1]=B[tr][tc+1];
					 A[tr+1][tc]=B[tr+1][tc];
				 }
				
				 if(col+2>=m) {
					 col=0;
					 row=row+1;
				 }else {
					 col=col+2;
				 }
				count++;
			}else if(col+1>=m) {
				col=0;
				 row=row+1;
			}else {
				col=col+1;
			}
			
		}
		
		if(count>0) {
			return count;
		}
		return -1;
		
		
	}
}
