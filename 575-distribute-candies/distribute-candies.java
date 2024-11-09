class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set= new HashSet<>();
        for(int i:candyType){
            set.add(i);
        }
        int types=set.size();
        int canHave=candyType.length/2;
        if(canHave>types) return types;
        return canHave;
    }
}