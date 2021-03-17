package src.java.com.niki.probSolving;

public class LongestIncreasingSubsequence {
	/**
	 * Given an array, the task is to find to LIS (Longest Increasing Subsequence) in a circular way.
	 *
	 * Examples :
	 *
	 * Input : arr[] = {5, 4, 3, 2, 1}
	 * Output : 2
	 * Although there is no LIS in a given array
	 * but in a circular form there can be
	 * {1, 5}, {2, 5}, ......
	 *
	 * Input : arr[]= {5, 6, 7, 1, 2, 3}
	 * Output : 6
	 * {1, 2, 3, 5, 6, 7} will be the LIS in the
	 * circular manner.
	 */
	    public static void main(String[] args){
	        int[] arr = {1, 4, 6, 2, 3} ;
	        System.out.println("Longest Increasing subsequence lenght is: "+lis(arr));
	    }
	    public static int lis(int[] arr){
	        int finalcount = 1;
	        int intercount =1;
	        int len =arr.length;
	        int[] arrayTobeTraversed = null;
	        if(arr[0]>arr[len-1]) {
	            arrayTobeTraversed = new int[2*len];
	            for(int i=0; i<len;i++) arrayTobeTraversed[i] = arr[i];
	            for(int i=len; i<2*len;i++) arrayTobeTraversed[i]=arr[i-len];
	        }else{
	            arrayTobeTraversed=arr;
	        }
	        for(int i=0; i<arrayTobeTraversed.length-1;i++){
	            if(arrayTobeTraversed[i]<arrayTobeTraversed[i+1]){
	                intercount++;
	            }else{
	                if (intercount>finalcount) finalcount=intercount;
	                intercount=1;
	            }
	        }

	        return finalcount;
	    }

}
