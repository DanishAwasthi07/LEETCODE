class Solution {
    public int uniquePaths(int m, int n) {
        int g[][]=new int[m][n];
        return des(g,m,n,0,0);
    }
    static int des(int g[][],int m,int n,int i,int j){
         if(i>=m||j>=n) return 0;
         if(i==m-1 && j==n-1) return 1;
         if(g[i][j]>0) return g[i][j];
         return g[i][j]= des(g,m,n,i+1,j)+des(g,m,n,i,j+1);
    }
}