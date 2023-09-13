package Assignment7;

import java.util.Scanner;

//13)reverse words in sentence
public class WordsReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entert the string:");
		String s= sc.nextLine();
		String a[] = s.split(" ");
		String t="";
		for (int i =a.length-1 ; i >=0 ; i--) {
			t+=a[i]+" ";
		}
    System.out.println(t);
	}

}
