class Solution {
    public int characterReplacement(String s, int k) {
        int low=0;
        int replacements=0;
        int maxWindSize=0;
        int maxFreq=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int high=0;high<s.length();high++){
            hm.put(s.charAt(high),hm.getOrDefault(s.charAt(high),0)+1);
            maxFreq=Math.max(maxFreq,hm.get(s.charAt(high)));
            replacements=(high-low+1)-maxFreq;
            while(replacements>k){
                hm.replace(s.charAt(low),hm.get(s.charAt(low))-1);
                low++;
                replacements--;
            }
            maxWindSize=Math.max(maxWindSize,(high-low+1));
        }
        return maxWindSize;
    }
}
