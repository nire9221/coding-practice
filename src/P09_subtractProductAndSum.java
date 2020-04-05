//Given an integer number n, return the difference between the product of its digits and the sum of its digits.
//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

public class P09_subtractProductAndSum {
    public int subtractProductAndSum(int n) {

        int sum = 0;
        int mul = 1;
        
        while (n > 0){
            int num = n % 10;
            sum += num;
            mul *= num;
            n /=10;
        }
        return mul-sum;
    }
}
