//Brute-Force Approach
class Solution3
{
    public static void findNextGreaterElements(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int next = -1;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] > arr[i])
                {
                    next = arr[j];
                    break;
                }
            }
            System.out.print(next + " ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr = { 1, 3, 2, 4 };
        findNextGreaterElements(arr);
    }
}

//Using Stack
// import java.util.Arrays;
// import java.util.Stack;
 
// class Solution3
// {
//     public static int[] findNextGreaterElements(int[] arr)
//     {
//         int[] result = new int[arr.length];
//         Arrays.fill(result, -1);
//         Stack<Integer> s = new Stack<>();
//         for (int i = 0; i < arr.length; i++)
//         { 
//             while (!s.isEmpty() && arr[s.peek()] < arr[i]) {
//                 result[s.pop()] = arr[i];
//             }
//             s.push(i);
//         }
//         return result;
//     }
//     public static void main(String[] args)
//     {
//         int[] arr = { 1, 3, 2, 4 };
//         int[] result = findNextGreaterElements(arr);
//         System.out.println(Arrays.toString(result));
//     }
// }
