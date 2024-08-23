class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int count =0;
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(matrix[i][j]!=matrix[i-1][j-1]){
                    count=1;
                    break;
                }
                if(count!=0) break;
            }
        }
        if(count==0) return true;
        else return false;
    }
}