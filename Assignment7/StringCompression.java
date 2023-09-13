package Assignment7;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String p = sc.nextLine();
		
		String q = "";
		for (int i = 0; i < p.length(); i++) {
			Integer count=1;
			while(i<p.length()-1 && p.charAt(i) == p.charAt(i+1)) {
				count++;
				i++;
			}
			q+=p.charAt(i);
			if(count>1) {
				q+=count.toString();
			}
			
		}
			
			System.out.println(q);
		
		
	
	}
   

}
