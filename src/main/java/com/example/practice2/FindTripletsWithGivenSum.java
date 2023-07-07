package com.example.practice2;

public class FindTripletsWithGivenSum {
	
	public static void findTriplets(int[] arr, int n,int k) {
		
		
		
		for (int i = 0; i < arr.length; i++) {
			int low = i+1, high = n-1, sum = k-arr[i];
			
			if (i==0 || (i>0 && arr[i]!= arr[i-1])) {
				
				while(low<high) {
					
					if(low>i+1 && arr[low]==arr[low-1]) {
						low++;
						continue;
					}
					
					if(high<n-1 && arr[high]==arr[high-1]) {
						high--;
						continue;
					}
					
					if(arr[low]+arr[high]== sum) {
						System.out.println(arr[low]+" "+arr[high]+" "+arr[i]);
					}
					else if(arr[low]+arr[high]<sum) {
						low++;
					}                                                                                                                                                        
					else {
						high--;
					}
				}
			}
			
		}
		
		
//		for (int i = 0; i < n-1; i++) {
//			int low = i+1, high= n-1, sum = k-arr[i];
//			HashSet<Integer> set = new HashSet<>();
//				
//				if (i==0 || (i>0 && arr[i]!=arr[i-1])) {
//					
//					
//					while (low<high) {
//
//						if(low>i+1  && arr[low] ==arr[low-1]) {
//							low++;
//							continue;
//						}
//						
//						if (high<n-1  && arr[high] == arr[high-1]) {
//							high--;
//							continue;
//						}
//
//						if (arr[low]+arr[high]== sum) {
//							
//							System.out.println(arr[i]+" ,"+arr[low]+","+arr[high]);
//							
//							low++; high--;
//							
//						}
//						else if (arr[low]+arr[high]<sum) {
//							low++;
//						}
//						else {
//							high--;
//						}
//						
//					}
//				}
//				
//		}
	}
	
	public static void main(String[] args) {
		int arr[] = {3,4,5,3,7,7,2};
		 findTriplets(arr, arr.length, 11);
	}
}
