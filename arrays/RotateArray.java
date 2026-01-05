import java.util.Arrays;


/* Problem: 189. Rotate Array (Difficulty - medium)

Description:
  
->  Given an integer array nums, rotate the array to the right by k steps, 
->  where k is non-negative.

Constraints:

->  1 <= nums.length <= 105
->  -231 <= nums[i] <= 231 - 1
->  0 <= k <= 105

source: https://leetcode.com/problems/rotate-array/description/
*/


public class RotateArray
{
    static void reverse(int[] arr, int left, int right)
    {
        while(left < right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    //TO-DO reverse whole, first block, and last block
    static void rotate(int[] arr, int k){
        
        int n = arr.length;
        k = k % n; //normalize k to remain within bounds

        //step 1 - reverse the whole array (from index 0 to n - 1)
        reverse(arr, 0, n - 1);
        //step 2 - reverse first k elements (from 0 to k - 1)
        reverse(arr, 0, k - 1);
        //step 3 - reverse remaining elements (from k to n - 1)
        reverse(arr, k , n - 1);
    }

    public static void main(String args[])
    {
        int[] arr = new int[]{-1,-100,3,99};
        int k = 2;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));

    }
}