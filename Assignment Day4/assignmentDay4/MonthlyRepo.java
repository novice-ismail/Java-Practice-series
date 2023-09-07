package assignmentDay4;

public class MonthlyRepo {

	public static void main(String[] args) {
		String mnt[] = {"January","Febrary","March","April","May","June",
				"July","August","September","October","November","December"};
		int mntSales[]= {125000,93000,80000,75000,84000,110000,105000,120000,90000,115000,123000,150000};
		int qtrSales[]= new int[4];
		
		System.out.println("Monthly Sales:");
		for(int i=0;i<mntSales.length;i++) {
			System.out.println(mntSales[i]);
		}
		System.out.println();
			
		int totalSales =0;
		int quarter=0;
		int i;
		for( i=0;i<mntSales.length;i++) {
			quarter=i/3;
			qtrSales[quarter]+=mntSales[i];
			
			totalSales +=mntSales[i];
			
		}
		System.out.println("Total sales:"+totalSales);
		
		System.out.println();
		
		System.out.println("Quarterly sales:");
		for( i=0;i<quarter+1;i++) {
			
			System.out.println("Quarter:"+" "+(i+1)+" "+"QuarterlySales:"+qtrSales[i]);
		}
		
		
		
		
			
		

	}

}
