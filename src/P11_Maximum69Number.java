//Given a positive integer num consisting only of digits 6 and 9.
//Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
//https://leetcode.com/problems/maximum-69-number/

public class P11_Maximum69Number {
    public int maximum69Number (int num) {
    int i = 1, j = 0, n = num;
    while(n > 0){
        if(n % 10 == 6){
            j = i;
        }
        n /= 10;
        i *= 10;
    }
    return j == 0 ? num : num + j * 3;
}

// public int maximum69Number (int num) {
//     return Integer.valueOf(String.valueOf(num).replaceFirst("6", "9"));
// }
}
