import java.io.*;
import java.util.Arrays;
class Solution4
{ 
	static int deleteRepeatedElement(int arr[]) 
	{ 
    int n = arr.length;
		if (n == 0 || n == 1) 
			return n; 
		int j = 0;
		for (int i = 0; i < n-1; i++) 
			if (arr[i] != arr[i+1]) 
				arr[j++] = arr[i]; 
	
		arr[j++] = arr[n-1]; 
	
		return j; 
	} 
	
	public static void main (String[] args) 
	{ 
		//int arr[] = {1,2,3,4,4,4,5};
		int arr[] = {1, 3, 4, 5, 7,3,6,7,0,2}; 
		// int arr[] = {2, 5, 6,4,8,9,2,4};
		Arrays.sort(arr);   //Sort the given array
		int n = arr.length; 
		
		n = deleteRepeatedElement(arr); 

		for (int i=0; i<n; i++) 
		System.out.print(arr[i]+" "); 
	} 
} 
