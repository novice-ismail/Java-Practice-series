package assignmentDay2;
// Section 1 Cosine series calculation

import java.util.Scanner;

public class CosFunc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x:");
		int x =sc.nextInt();
		double n= Math.toRadians(x);
		double sum =1;
		double fact =1;
		double num =1;
		for(int i=1;i<=19;i++) {
			fact = fact*i;
			if(i%2==0) {
				num= -num*n*n;
				sum = sum+num/fact;
				
			}
		}
      System.out.println(sum);
	}

}
