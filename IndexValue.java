// package experiments;

class IndexValue {
	public static void main(String args[]) {
		int arr[] = new int[] {4,3,1,2,0};
		for(int i=0;i<=arr.length;i++)
		{
			int r=arr[arr[i]];
			System.out.print(r*r+" ");
		}
	}

}
