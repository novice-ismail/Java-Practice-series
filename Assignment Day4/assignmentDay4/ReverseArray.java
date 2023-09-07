package assignmentDay4;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the  array elements:");
		for(int i=0;i<a.length;i++)
			a[i]= sc.nextInt();
		for(int i=0,j=a.length-1;i<j;i++,j--) {
			int t= a[i];
			a[i]=a[j];
			a[j]=t;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
			

	}

}
