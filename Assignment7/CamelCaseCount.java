package Assignment7;

import java.util.Scanner;
// Camelcase word count(09)
public class CamelCaseCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.nextLine();
		
		
		//String a[] = s.split(" ");
		int count =1;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch)) {
				count++;
			}
			
			
		}
		System.out.println(count);

	}

}
