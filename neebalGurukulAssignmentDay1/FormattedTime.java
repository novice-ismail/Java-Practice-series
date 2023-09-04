package neebalGurukulAssignmentDay1;

import java.util.Scanner;

public class FormattedTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the time to be formatted:");
		long ms = sc.nextLong();
		// calculate total seconds by dividing 1000(1sec=1000ms)
		long sec = (ms/1000)%60;
		long mn = (ms/60000)%60;
		long hr = (ms/3600000);
		
		  System.out.println("The formatted time format is:"+ hr+":"+mn+":"+sec);

	}

}
