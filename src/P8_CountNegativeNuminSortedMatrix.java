//Given a m * n matrix grid which is sorted in non-increasing order both row-wise and column-wise. 
//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

public class P8_CountNegativeNuminSortedMatrix {
    public int countNegatives(int[][] grid) {
        int negativeCount = 0;
        
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[i].length;j++) {
                if(grid[i][j] < 0) {
                    negativeCount += grid[i].length-j;
                    break;
                }
            }
        }
        
        return negativeCount;
    }
}
