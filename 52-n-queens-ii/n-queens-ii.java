class Solution {
    public void Count(int col,int[]left,int[]lower,int[]upper,int[] count,int n){
         if(col==n){
            count[0]++;
            return;
         }
         for(int row=0;row<n;row++){
            if(left[row]==0 && lower[n-1+col-row]==0 && upper[row+col]==0){
                left[row]=1;
                lower[n-1+col-row]=1;
                upper[row+col]=1;
                Count(col+1,left,lower,upper,count,n);
                left[row]=0;
                lower[n-1+col-row]=0;
                upper[row+col]=0;
            }
         }
    }
    public int totalNQueens(int n) {
        int[]left=new int[n];
        int[]lower=new int[2*n-1];
        int[]upper=new int[2*n-1];
        int[]count= new int[1];
        Count(0,left,upper,lower,count,n);
        return count[0];
    }
}