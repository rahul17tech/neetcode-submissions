class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){

            int no=target-nums[i];
            
            if(hm.containsKey(no)){
                if(hm.get(no)>i)
                    return new int[]{i,hm.get(no)};
                else
                    return new int[]{hm.get(no),i};
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return new int[]{};
    }
    
}
