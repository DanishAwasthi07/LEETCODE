class Solution {
    public void solve(int col,List<List<String>> ans,List<String> board,int[] leftRow,
        int[] upperDiagonal,int[] lowerDiagonal ,int n){
        if(col==n){
            ans.add(new ArrayList<>(board));
        }
        for(int row=0;row<n;row++){
            if(leftRow[row]==0 && lowerDiagonal[row+col]==0 && upperDiagonal[n-1+col-row]==0){
                char[] currentRow = board.get(row).toCharArray();
                currentRow[col] = 'Q';
                board.set(row, new String(currentRow));
                leftRow[row]=1;
                lowerDiagonal[row+col]=1;
                upperDiagonal[n-1+col-row]=1;
                solve(col+1,ans,board,leftRow,upperDiagonal,lowerDiagonal,n);
                currentRow[col] = '.';
                board.set(row, new String(currentRow));
                leftRow[row]=0;
                lowerDiagonal[row+col]=0;
                upperDiagonal[n-1+col-row]=0;
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans= new ArrayList<>();
        List<String> board= new ArrayList<>();
        for(int i=0;i<n;i++){
             char [] row = new char[n];
             Arrays.fill(row,'.');
             board.add(new String(row));
        }
        int[] leftRow = new int[n];
        int[] upperDiagonal = new int[2 * n - 1];
        int[] lowerDiagonal = new int[2 * n - 1];
        solve(0,ans,board,leftRow,upperDiagonal,lowerDiagonal,n);
        return ans;
    }
}