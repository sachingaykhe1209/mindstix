import java.io.*;
class Solution1
{
	public static int search(int arr[], int x)
	{
		int n = arr.length;
		for (int i = 0; i < n; i++)
		{
			if (arr[i] == x)
				return i;
		}
		return -1;
	}
	public static void main(String args[])
	{
		int arr[] = { 10, 20, 80, 30, 60, 50, 110, 100, 130, 170 };
		int x = 110;
        // int arr[] = {10, 20, 80, 30, 60, 50,110, 100, 130, 170};
        // int x = 175;
		int result = search(arr, x);
		if (result == -1)
			System.out.print("Element "+ x +" is not present in array.");
		else
			System.out.print("Element is present at index "	+ result);
	}
}


// Alternate Solution (Linear Search)
// class Solution1
// {

// 	public static void search(int arr[], int x)
// 	{
// 		int l = 0;
// 		int length = arr.length;
// 		int r = length - 1;
// 		int pos = -1;
// 		for (l = 0; l <= r; l++)
// 		{
// 			if (arr[l] == x)
// 			{
// 				pos = l;
// 				System.out.println(	"Element found in Array at "+ (pos) + " Position with "+ (l + 1) + " Attempt");
// 				break;
// 			}
// 			if (arr[r] == x)
// 			{
// 				pos = r;
// 				System.out.println("Element found in Array at " + (pos) + " Position with " + (length - r) + " Attempt");
// 				break;
// 			}
			
// 			l++;
// 			r--;
// 		}
// 		if (pos == -1)
// 			System.out.println("Not found in Array with "+ l + " Attempt");
// 	}
// 	public static void main(String[] args)
// 	{
//         int arr[] = { 10, 20, 80, 30, 60, 50, 110, 100, 130, 170 };
//         int x = 110;
//         // int arr[] = {10, 20, 80, 30, 60, 50,110, 100, 130, 170};
//         // int x = 175;
// 		search(arr,x);
// 	}
// }
