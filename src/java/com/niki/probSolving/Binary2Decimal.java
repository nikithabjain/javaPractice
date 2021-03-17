package src.java.com.niki.probSolving;

public class Binary2Decimal {
	/**
	 * Given a binary number as input, we need to write a program to convert the given binary number into an equivalent decimal number.
	 *
	 * Examples :
	 *
	 * Input : 111
	 * Output : 7
	 *
	 * Input : 1010
	 * Output : 10
	 *
	 * Input: 100001
	 * Output: 33
	 */
	    public static void main(String[] args){
	        int binary = 1010;
	        System.out.println("decimal equivalent of "+binary+" is "+convertToDecimal(binary));
	    }
	    private static int convertToDecimal(int binary){
	        int dec = 0;
	        int base =1;
	        int temp = binary;
	        while (temp>0){
	            int lastDigit = temp%10;
	            temp/=10;
	            dec+=lastDigit*base;
	            base*=2;
	        }

	        return dec;
	    }

	}

