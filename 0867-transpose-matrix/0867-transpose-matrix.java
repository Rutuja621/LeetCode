class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;

        int [][]ans=new int[cols][rows];

        for(int c=0;c<cols;c++){
            for(int r=0;r<rows;r++){
                ans[c][r]=matrix[r][c];
            }
        }
        return ans;
    }
}