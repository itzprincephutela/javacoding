// You are given an array nums consisting of positive integers.
// You have to take each integer in the array, reverse its digits, and add it to the end of the array. You should apply this operation to the original integers in nums.
// Return the number of distinct integers in the final array.

// Example 1:
// Input: nums = [1,13,10,12,31]
// Output: 6
// Explanation: After including the reverse of each number, the resulting array is [1,13,10,12,31,1,31,1,21,13].
// The reversed integers that were added to the end of the array are underlined. Note that for the integer 10, after reversing it, it becomes 01 which is just 1.
// The number of distinct integers in this array is 6 (The numbers 1, 10, 12, 13, 21, and 31).



import java.util.HashSet;

public class LEETCODE2442 {
    public static void main(String[] args) {
        int[] nums = {2,2,2};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
        System.out.println(set.size());

    }
    public static int reverse(int n){
        int r = 0 ;
        while(n!=0){
            r = r *10+n%10;
            n = n /10;
        }
        return r;
    }
}
