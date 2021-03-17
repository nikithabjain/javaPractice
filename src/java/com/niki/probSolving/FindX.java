package src.java.com.niki.probSolving;

public class FindX {
	/**
	 * Given an array of n distinct integers and an element x. Search the element x in the array using minimum number of comparisons. Any sort of comparison will contribute 1 to the count of comparisons. For example, the condition used to terminate a loop, will also contribute 1 to the count of comparisons each time it gets executed. Expressions like while (n) {n–;} also contribute to the count of comparisons as value of n is being compared internally so as to decide whether or not to terminate the loop.
	 *
	 * Examples:
	 *
	 * Input : arr[] = {4, 6, 1, 5, 8},
	 *         x = 1
	 * Output : Found
	 *
	 * Input : arr[] = {10, 3, 12, 7, 2, 11, 9},
	 *         x = 15
	 * Output : Not Found
	 */
	/**
	 * The idea is to copy x (element to be searched) to last location so that one last comparison when x is not present in arr[] is saved.
	 *
	 * Algorithm:
	 *
	 * search(arr, n, x)
	 *     if arr[n-1] == x  // 1 comparison
	 *        return "true"
	 *     backup = arr[n-1]
	 *     arr[n-1] = x
	 *
	 *     for i=0, i++ // no termination condition
	 *         if arr[i] == x // execute at most n times
	 *                        // that is at-most n comparisons
	 *             arr[n-1] = backup
	 *             return (i < n-1) // 1 comparison
	 */
	    public static void main(String[] args){
	        int[] arr = {1,4,6,3,5,7,8,9};
	        int x = 10;
	        int len = arr.length;
	        System.out.println("x is found = "+ search(arr,x,len));
	    }
	    private static boolean search(int[] arr,int x, int len){
	        if(arr[len-1]==x) return true;
	        else{
	            int backup = arr[len-1];
	            arr[len-1]=x;

	            for(int i =0;;i++){
	                if(arr[i]==x){
	                    if(i<len-1){
	                        arr[len-1]=backup;
	                        return true;
	                    }else{
	                        return false;
	                    }
	                }
	            }
	        }
	    }
	}

