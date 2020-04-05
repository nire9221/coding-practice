//You're given strings J representing the types of stones that are jewels, and S representing the stones you have. 
//https://leetcode.com/problems/jewels-and-stones/

public class P7_JewelsStones {
    public int numJewelsInStones(String J, String S) {
        
        //J.charAt(0)== S.charAt(0), S.charAt(1)... 
        //J.charAt(1)== S.charAt(0), S.charAt(1)... 
        //J.charAt(2)== S.charAt(0), S.charAt(1)... 
        //J.charAt(n)== S.charAt(0), S.charAt(1)...S.charAt(s)
        
        int count = 0;
        
        for (int i = 0; i < S.length(); i++){
            if (J.indexOf(S.charAt(i)) > -1) {
                    count++;
                }
            }
        return count;
        } 
}
