package neebalGurukulAssignmentDay1;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the four digit number:");
		int d = sc.nextInt();
		int n1 =d%10;
		int n2 =(d/10)%10;
		int n3= (d/100)%10;
		int n4 = (d/1000)%10;
		
		int swap = n2*1000+n1*100+n4*10+n3;
		System.out.println("Swap of the number is:"+ swap);
		

	}

}
