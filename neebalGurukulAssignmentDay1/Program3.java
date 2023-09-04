package neebalGurukulAssignmentDay1;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the days:");
		int days = sc.nextInt();
		int yrs = days/365;
		int remDays=days-(yrs*365);
		int mnt = remDays/30;
		remDays -= mnt*30;
		int wks = remDays/7;
		remDays-=wks*7;
		
		System.out.println("The result is:"+ yrs+" years"+":"+mnt+" months"+":"+wks+" weeks"+":"+remDays+" days");
		
		
		

	}

}
