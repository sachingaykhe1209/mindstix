class Solution5{
static void findNumber(int arr[], int arr_len)
{
    int firstSmallest, firstLargest, secondSmallest, secondLargest;

    if (arr_len < 2) 
    { 
        System.out.println(" Invalid Input "); 
        return; 
    } 

    firstSmallest = secondSmallest = Integer.MAX_VALUE; 
    for (int i = 0; i < arr_len ; i ++) 
    { 
        if (arr[i] < firstSmallest) 
        { 
            secondSmallest = firstSmallest; 
            firstSmallest = arr[i]; 
        } 
        else if (arr[i] < secondSmallest && arr[i] != firstSmallest) 
            secondSmallest = arr[i]; 
    } 

    firstLargest = secondLargest = Integer.MIN_VALUE;
    for (int i = 0; i < arr_len ; i ++){
        if (arr[i] > firstLargest) 
        { 
            secondLargest = firstLargest; 
            firstLargest = arr[i]; 
        } 
        else if (arr[i] > secondLargest && arr[i] != firstLargest) 
        secondLargest = arr[i]; 
    }
    System.out.println("second Smallest element is " + secondSmallest + " and second Largest element is " + secondLargest); 
}
 

public static void main(String[] args)
{
    int arr[] = { 5,10,0,2,3,4 };
    int arr_len = arr.length;
    findNumber(arr, arr_len);
}
}
 