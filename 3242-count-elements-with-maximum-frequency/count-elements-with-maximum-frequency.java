class Solution {
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);
        LinkedHashMap<Integer,Integer> mp= new LinkedHashMap<>();
        for(int x:nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        int maxf=0;int count=0;
        for(Map.Entry<Integer,Integer> e : mp.entrySet()){
            if(e.getValue()>maxf) maxf=e.getValue();
        }
         for(Map.Entry<Integer,Integer> e : mp.entrySet()){
            if(e.getValue()==maxf){
                count=count+e.getValue();
            }
        }
        return count;
    }
} 