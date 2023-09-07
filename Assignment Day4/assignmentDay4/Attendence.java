package assignmentDay4;
// attendence percentage

public class Attendence {

	public static void main(String[] args) {
     
		int []ar = {1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
		int t_days=ar.length;
		int day=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==1) {
				day+=ar[i];
			}
		}
		//System.out.println(day);
		double atPercentage= (double)day/t_days*100;
		
		System.out.println("Attendence percentage:"+atPercentage);
     

	}

}
