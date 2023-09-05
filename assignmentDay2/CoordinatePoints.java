package assignmentDay2;

import java.util.Scanner;

// Coordinate points of quadrant

public class CoordinatePoints {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the X-Coordinates:");
		int x = sc.nextInt();
		System.out.println("Enter the Y-Coordinates:");
		int y = sc.nextInt();
         
		if(x==0 && y!=0) {
			System.out.println("Y axis");
		} else if(x!=0 && y==0) {
			System.out.println("X axis");
		}else if(x==0 && y==0) {
			System.out.println("Origin");
		}else if(x>0 && y>0) {
			System.out.println("First Quadrant");
		}else if(x<0 && y>0) {
			System.out.println("Second Quadrant");
		}else if(x<0 && y<0) {
			System.out.println("Third Quadrant");
		}else if(x>0 && y<0) {
			System.out.println("Fourth Quadrant");
		}
		
	}

}
