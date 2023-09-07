package assignmentDay4;

public class Profit {

	public static void main(String[] args) {
		
		 
		        int[] profits = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};
		        
		        int declineYear = -1; // Initialize to -1 (indicating no decline found yet)
		        
		        for (int year = 1; year < profits.length; year++) {
		            if (profits[year] < profits[year - 1]) {
		                declineYear = 2000 + year; // Assuming the years start from 2001
		                break; // Exit the loop as we found the first year of decline
		            }
		        }
		        
		        if (declineYear != -1) {
		            System.out.println("The decline in profits began in the year: " + declineYear);
		        } else {
		            System.out.println("No decline in profits found.");
		        }
		    }
		}


	


