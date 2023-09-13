package Assignment7;
import java.util.*;

public class ReplaceCharcter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.nextLine();
		System.out.println("Enter the charcter to be replace:");
		char q = sc.nextLine().charAt(0);
		System.out.println("Enter the charcter to be replaced with:");
		char r = sc.nextLine().charAt(0);
		String res="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==q)
				res+=r;
			else
				res+=s.charAt(i);
		}
		System.out.println("New String:"+res);

	}

}
