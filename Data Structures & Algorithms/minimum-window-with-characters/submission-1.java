class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> mapS=new HashMap<>();
        HashMap<Character,Integer> mapT=new HashMap<>();

        //storing frequency of t string characters
        for(char c:t.toCharArray())
            mapT.put(c,mapT.getOrDefault(c,0)+1);


        int low=0;
        int minLen=Integer.MAX_VALUE;
        int minStart=0;
        for(int high=0;high<s.length();high++){
            mapS.put(s.charAt(high),mapS.getOrDefault(s.charAt(high),0)+1);

            while(contains(mapS,mapT)){
                if((high-low+1)<minLen){
                    minLen=high-low+1;
                    minStart=low;
                }
                mapS.put(s.charAt(low),mapS.getOrDefault(s.charAt(low),0)-1);
                low++;
            }
        }

        return minLen==Integer.MAX_VALUE? "" : s.substring(minStart,minStart+minLen);
    }

    private boolean contains(HashMap<Character,Integer> mapS,HashMap<Character,Integer> mapT){
        for (Map.Entry<Character, Integer> me : mapT.entrySet()) {
            char ch = me.getKey();

            if (mapS.getOrDefault(ch, 0) < me.getValue()) {
                return false;
            }
        }
        return true;
    }
}
