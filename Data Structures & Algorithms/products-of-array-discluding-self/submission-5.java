class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        int prod=1;
        int count=0;
        for(int i:nums){
            if(i==0)
                count++;
            else
                prod*=i;
        }
        
        for(int i=0;i<nums.length;i++){
            if(count>1)
                res[i]=0;
            else if (count==1){
                if(nums[i]==0)
                    res[i]=prod;
            }
            else
                res[i]= prod/nums[i];
        }
        return res;
    }
}  
