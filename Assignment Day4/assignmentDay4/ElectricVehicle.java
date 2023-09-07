package assignmentDay4;
// problem 5
public class ElectricVehicle {

	public static void main(String[] args) {
		int[] ev = {850,945,1145,1155,1230,1245,1330,1340,1425,1445};
		 		int totalMin=0;
		 for(int i=0;i<ev.length;i=i+2) {
			int on_t =ev[i];
			int off_t =ev[i+1];
			
			int onH = on_t/100;
			int onM = on_t%100;
			int offH = off_t/100;
			int offM = off_t%100;
			
			 int run_t = (offH*60+offM)-(onH*60+onM);
			 totalMin = totalMin+run_t;
		}
		 int hr = totalMin/60;
		 int min = totalMin%60;
		 System.out.println(" Total running time of the electric vehicle is:"+hr+"hr"+" "+min+"min");
		 

	}

}
