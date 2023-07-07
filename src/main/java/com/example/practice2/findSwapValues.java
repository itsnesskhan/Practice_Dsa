package com.example.practice2;

import java.util.Arrays;

public class findSwapValues {

	static long findSwapValues(long A[], int n, long  B[], int m)
    {
        long s1= 0;
		 long s2= 0;
		 
	     for(int i=0;i<n;i++) 
	    	 s1+=A[i];
	     System.out.println("Sum of A"+s1);
	     
	     for(int i=0;i<m;i++)
	    	 s2+=B[i];
	     System.out.println("Sum of B"+s2);
	    
	    for(int i=0;i<m;i++){
	        B[i]*=2;
	    }
		 Arrays.sort(B);
		 System.out.println("after multipication"+Arrays.toString(B));
		 
		 for(int i=0;i<n;i++){
		     long need = s2-s1 +2 *A[i];
		     if(Arrays.binarySearch(B, need)>0){
		    	 int binarySearch = Arrays.binarySearch(B, need);
		    	 long elementINA =  (B[binarySearch]-(s2-s1))/2;
		    	 System.out.println("Element in A "+elementINA+" element in B "+B[binarySearch]/2);
		         return 1;
		     }
		 }
	    
		 return -1;
    }
	
	
	public static void main(String[] args) {
		long arr[] = {4, 1, 2, 1, 1, 2};
		long arr2[] = {3,6,3,3};
		long findSwapValues = findSwapValues(arr, arr.length, arr2, arr2.length);
		System.out.println(findSwapValues);
	}
}
