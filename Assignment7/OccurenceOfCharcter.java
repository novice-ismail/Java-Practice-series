package Assignment7;

import java.util.Scanner;

public class OccurenceOfCharcter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter trhe string:");
		String s= sc.nextLine();
		int a[] = new int[s.length()];
		for (int i = 0; i < a.length; i++) {
			char ch = s.charAt(i);
			if((ch>='A'&& ch<='Z') ||(ch>='a' && ch<='z')) {
				a[i]++;
			}
				
			
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]>0) {
				char ch =(char)i;
				System.out.println("Character: "+ch+" "+a[i]);
			}
		}

	}

}
