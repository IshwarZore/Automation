package bitManipulation;
import java.util.*;

public class decimalToBinary {
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int ans=0;
		int e=1;
		
		while(num>0) {
			ans=((num%2)*e)+ans;
			num=num/2;
			e=e*10;
		}

		
		System.out.println("The binary form is : "+ans);
	}
}

