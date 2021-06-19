public class Solution7
{ 
	static final int ASCII_SIZE = 256; 
	static char maxOccurrences(String str) 
	{ 
		int count[] = new int[ASCII_SIZE]; 
 		int len = str.length(); 
		for (int i=0; i<len; i++) {
			count[str.charAt(i)]++; 
		}

		int max = -1; 
		char result = ' '; 
		for (int i = 0; i < len; i++) { 
			if (max < count[str.charAt(i)]) { 
				max = count[str.charAt(i)]; 
				result = str.charAt(i); 
                System.out.println("Letter with max number of occurrence is = "+result);
                System.out.println("Number of occurrences = "+max);
			} 
		} 
		return result; 
	} 

	public static void main(String[] args) 
	{ 
		String str = "india is my country"; 
		System.out.println("Letter with max number of occurrence is "+  maxOccurrences(str)); 
	} 
} 
