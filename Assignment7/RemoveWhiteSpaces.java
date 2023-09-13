package Assignment7;

//Remoing whiteSpaces from given sentence

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		String s = sc.nextLine();
		String s1 = "";
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch!=' ')
				s1+=ch;
					
		}
	System.out.println(s1);
		

	}

}
