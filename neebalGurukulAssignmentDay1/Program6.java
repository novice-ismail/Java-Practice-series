package neebalGurukulAssignmentDay1;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int sum1=0,sum2=0,sum3=0;
		int p1= (n%10);
		int p2 = (n%100)/10;
		int p3 = (n/100);
		 sum1+= p1*p1*p1;
		 sum2+= p2*p2*p2;
		 sum3+= p3*p3*p3;
		 
		 
		 int res = sum1+sum2+sum3;
		 if(n==res) {
			 System.out.println("The number is armstrong number.");
		 }
		 else {
			 System.out.println("The number is not an armstrong number.");
		 }

	}

}
