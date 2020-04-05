//Given an array nums of integers, return how many of them contain an even number of digits.
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class P10_findEvenNumbers {
    public int findNumbers(int[] nums) {
        
        int count = 0 ;
        
        for (int i : nums){
            int len = String.valueOf(i).length();
            if (len %2 == 0){
                count++;
            }
        }   return count;
    } 
}
