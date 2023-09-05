package assignmentDay2;

import java.util.Scanner;

// fibonacci numbers with bounds
public class FibonacciNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter the lower bound:");
		 int l = sc.nextInt();
		 System.out.println("Enter the upper bound:");
		 int u = sc.nextInt();
		 
       boolean t1=true;
       int n1=0,n2=1,n3;
       if(l==n1) {
    	   System.out.print(n1+" ");
       }else if(l<=n2) {
    	   System.out.print(n2+" ");
       }
       while(t1) {
    	   n3=n1+n2;
    	   n1=n2;
    	   n2=n3;
    	   if((l<=n3) && (u>n3)) {
    		   System.out.print(n3+" ");
    		   }else if(u<n3) {
    			   t1=false;
    		   }
    	   
       }
       
	}

}
