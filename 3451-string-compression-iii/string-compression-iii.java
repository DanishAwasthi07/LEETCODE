class Solution {
    public String compressedString(String word) {
        StringBuilder ans= new StringBuilder();
        int i=0;
        while(i<word.length()){
            char currChar=word.charAt(i);
            int count=0;
            while(count<9 && i<word.length() && word.charAt(i)==currChar){
                count++;
                i++;
            }
            ans.append(count).append(currChar);
        }
        return ans.toString();
    }
}