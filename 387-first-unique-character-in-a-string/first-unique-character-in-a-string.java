class Solution {
    public int firstUniqChar(String str) {
        Map<Character,Integer> mp=new HashMap<>();
        for(char c:str.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(int i=0;i<str.length();i++){
            if(mp.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}