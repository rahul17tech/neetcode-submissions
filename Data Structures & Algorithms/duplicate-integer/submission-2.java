class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer,Integer> m= new Hashtable<>();
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