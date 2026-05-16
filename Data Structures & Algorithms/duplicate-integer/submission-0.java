class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> m= new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> me:m.entrySet()){
            if(me.getValue()>1)
                return true;
        }

        return false;
    }
}