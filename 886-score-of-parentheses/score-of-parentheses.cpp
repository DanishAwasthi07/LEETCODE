class Solution {
public:
    int scoreOfParentheses(string s) {
        stack<int>st;
        int c_score=0;
        for(int i=0;i<s.size();i++){
            if(s[i]=='('){
                st.push(c_score);
                c_score=0;
            }
            else{
                int l_score=st.top();
                st.pop();
                c_score=l_score+max(1,2*c_score);
            }
        }
        return c_score;
    }
};
