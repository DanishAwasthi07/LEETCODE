class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer>set= new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
       List<Integer>li= new ArrayList<>(set);
       Collections.sort(li, Collections.reverseOrder());
       if(li.size()<3) return li.get(0);
       return li.get(2);
    }
}