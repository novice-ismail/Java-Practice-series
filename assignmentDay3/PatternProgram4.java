package assignmentDay3;

public class PatternProgram4 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==i) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			if(i==1||i==5)
			{
				for(int l=1;l<=8;l++)
				{
					System.out.print(" *");
				}
			}
			else {
				for(int l=1;l<=8;l++)
				{
					System.out.print("  ");
				}
			}
			System.out.print(" *");
			System.out.println();
		}


	}

}
  