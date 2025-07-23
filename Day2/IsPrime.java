package TestLeafAssignments.Week1;

public class IsPrime {
	 public static void main(String[] args) {
	        
	        int number = 5; 
	        boolean isPrime = true;

	        
	        if (number <= 1) {
	            isPrime = false;
	        } else {
	            
	            for (int i = 2; i < number; i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break; 
	                }
	            }
	        }

	        
	        if (isPrime) {
	            System.out.println("Given number is Prime");
	        } 
	        else {
	            System.out.println("Given number is not Prime");
	        }
	    }
	}