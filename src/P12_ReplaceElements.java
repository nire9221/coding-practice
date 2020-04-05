//Given an array arr, replace every element in that array with the greatest element among the elements to its right, 
//and replace the last element with -1. After doing so, return the array.
//https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/

public class P12_ReplaceElements {
    public int[] replaceElements(int[] arr) {
        int output[] = new int[arr.length];
        int max = -1;
        for(int i=arr.length-1;i>=0;i--){
            output[i] = max;
            max = Math.max(arr[i],max);
        }
        return output;
    }
}
