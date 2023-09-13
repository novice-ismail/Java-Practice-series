package Assignment7;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.nextLine();
		s=s.trim();
		s=" "+s;
		//String a[] = s.split(" ");
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
			
		}
		System.out.println(count);

	}
 
}
