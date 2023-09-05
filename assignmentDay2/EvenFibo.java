package assignmentDay2;
// 4)first 10 even fibo

public class EvenFibo {

	public static void main(String[] args) {
		int num1=0,num2=1,num3,count=1;
		for(;count<=10;) {
			num3 = num1+num2;
			num1=num2;
			num2=num3;
			if(num3%2==0) {
				System.out.print(" "+num3);
				count++;
			}
		}
		

	}

}
