package neebalGurukulAssignmentDay1;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the passenger count:");
		int n = sc.nextInt();
		int buses = n/50;
		int passenger = buses*50;
		System.out.println("Number of passenger travelling:"+passenger);
		
		

	}

}
