class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;


        boolean []zeroRows=new boolean[m];
        boolean []zeroColns=new boolean[n];

        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(matrix[r][c]==0){
                    zeroRows[r]=true;
                    zeroColns[c]=true;

                }
            }

        } 

        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(zeroRows[r] || zeroColns[c]){
                    matrix[r][c]=0;
                }

            }
        }
    }
}