class Solution2 {
	int search(int arr[], int x)
	{
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;
			if (arr[m] == x)
				return m;
			if (arr[m] < x)
				l = m + 1;
			else
				r = m - 1;
		}
		return -1;
	}
	public static void main(String args[])
	{
		Solution2 ob = new Solution2();
		int arr[] = { 20, 30, 40, 50, 60,70, 80 };
		int x = 70;
		int result = ob.search(arr, x);
		if (result == -1)
			System.out.println("Element "+ x +" is not present in array.");
		else
			System.out.println("Element "+ x +" is found at "+ "index " + result);
	}
}
