package src.java.com.niki.probSolving;

public class FindCubeRoot {

	/**
	 * Given N, count all ‘a’ and ‘b’ that satisfy the condition a^3 + b^3 = N.
	 * Examples:
	 *
	 * Input : N = 9
	 * Output : 2
	 * 1^3 + 2^3 = 9
	 * 2^3 + 1^3 = 9
	 *
	 * Input : N = 28
	 * Output : 2
	 *  1^3 + 3^3 = 28
	 *  3^3 + 1^3 = 28
	 * Note:- (a, b) and (b, a) are to be considered as two different pairs.
	 * Asked in : Adobe
	 *
	 *
	 */

	/**
	 * Implementation:
	 * Travers numbers from 1 to cube root of N.
	 *   a) Subtract cube of current number from
	 *     N and check if their difference is a
	 *     perfect cube or not.
	 *       i) If perfect cube then increment count.
	 *
	 * 2- Return count.
	 */
	public static void main(String[] args){
		for(int i=1; i<10;i++) {
			System.out.println("number of a and b whose cube is " + i + " == " + countCubes(i));
		}
	}
	private static int countCubes(int N){
		int count = 0;
		for(int i=1; i<= Math.cbrt(N); i++){
			//take the difference cube of i and N
			int diff = N-(i*i*i);
			int cbrtDiff = (int) Math.cbrt(diff);
			//if difference is perfect cube then a and b are perfect cubes whose sum is N so increment count
			if(cbrtDiff*cbrtDiff*cbrtDiff == diff){
				count++;
			}
		}
		return count;
	}
}


