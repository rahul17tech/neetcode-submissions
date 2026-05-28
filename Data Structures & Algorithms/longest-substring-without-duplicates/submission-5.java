class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s.length()==1)
            return s.length();

        HashSet<Character> hs=new HashSet<>();

        int res_len=0;
        int low=0;
        int high=0;
        while(high<s.length()){
            if(hs.contains(s.charAt(high))){
                while(low<high && hs.contains(s.charAt(high))){
                    hs.remove(s.charAt(low));
                    low++;
                }
            }
            hs.add(s.charAt(high));
            res_len=Math.max(res_len,(high-low+1));
            high++;

        }
        return res_len;
    }
}
