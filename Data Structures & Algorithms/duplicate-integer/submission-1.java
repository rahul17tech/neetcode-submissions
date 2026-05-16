class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> m= new HashMap<>();
        for(int i:nums){
            if(m.containsKey(i)==false){
                m.put(i,1);
            }
            else{
                return true;
            }
        }
        return false;
    }
}