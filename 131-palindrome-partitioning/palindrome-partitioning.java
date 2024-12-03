class Solution {
    public void Solve(int idx,List<List<String>> ans, List<String> curr,String s){
        if(idx==s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx+1;i<s.length()+1;i++){
        String sub= s.substring(idx,i);
        if(isPalli(sub)){
        curr.add(sub);
        Solve(i,ans,curr,s);
        curr.remove(curr.size()-1);
        }
    }
    }
    public boolean isPalli(String st){
        int left=0;
        int right=st.length()-1;
        while(left<right){
            if(st.charAt(left)!=st.charAt(right)) return false;
            left++;right--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans= new ArrayList<>();
        List<String> curr = new ArrayList<>();
        Solve(0,ans,curr,s);
        return ans;
    }
}