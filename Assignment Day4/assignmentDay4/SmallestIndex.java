package assignmentDay4;

import java.util.Scanner;

//Smallest element index
public class SmallestIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<a.length;i++)
			a[i]= sc.nextInt();
		int i, m=0;
		for( i=1;i<a.length;i++) {
			if(a[i]<a[m]) {
				m =i;
			}
			
		}
		System.out.println("The index of smallest array element:"+m);

	}
	

}
