class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s.length()==1)
            return s.length();
        
        int low=0;
        int high=0;
        int res_len=Integer.MIN_VALUE;
        HashMap<Character,Integer> hm=new HashMap<>();

        while(high<s.length()){
            if(hm.containsKey(s.charAt(high)) && hm.get(s.charAt(high))>=low){
                low=hm.get(s.charAt(high))+1;
            }
            hm.put(s.charAt(high),high);
            res_len=Math.max(res_len,(high-low+1));
            high++;
        }
        return res_len;
    }
}
