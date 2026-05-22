class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pref= new int[nums.length];
        int[] suff=new int[nums.length];
        int[] res=new int[nums.length];

        int pProd=1;
        for(int i=0;i<nums.length;i++){
            pref[i]=pProd;
            pProd*=nums[i];
        }
        
        int sProd=1;
        for(int i=nums.length-1;i>=0;i--){
            suff[i]=sProd;
            sProd*=nums[i];
        }
        System.out.println(Arrays.toString(pref));
        System.out.println(Arrays.toString(suff));
        
        for(int i=0;i<nums.length;i++){
            res[i]=pref[i]*suff[i];
        }

        return res;

    }
}  
