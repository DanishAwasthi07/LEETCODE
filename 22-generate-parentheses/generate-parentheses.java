class Solution {
    public void genP(int open,int close,String s,int n,List<String> res){
        if(open==close && open+close==n*2){
            res.add(s);
            return;
        }
        if(open<n){
            genP(open+1,close,s+"(",n,res);
        }
        if(close<open){
            genP(open,close+1,s+")",n,res);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        genP(0,0,"",n,res);
        return res;
    }
}