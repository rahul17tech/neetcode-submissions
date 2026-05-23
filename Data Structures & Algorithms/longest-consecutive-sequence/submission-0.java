class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums)
            hs.add(i);

        int maxLen=0;

        for(int i:nums){
            if(!hs.contains(i-1)){
                int curr=i;
                int count=1;
                while(hs.contains(curr+1)){
                    curr++;
                    count++;
                }
                maxLen=Math.max(maxLen,count);

            }
        }
        return maxLen;
    }
}
