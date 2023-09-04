package neebalGurukulAssignmentDay1;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers:");
		 int p = sc.nextInt();
		 int q = sc.nextInt();
		 int r = sc.nextInt();
		 
		 int h = p>q?p:q;
		 int j = h>r?h:r;
		 System.out.println("The result is:"+ j);
		 

	}

}
