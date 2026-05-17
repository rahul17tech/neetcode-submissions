class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;

        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        
        HashMap<Character,Integer> hm= new HashMap<>();

        for(char c:c1){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(char c:c2){
            hm.put(c,hm.getOrDefault(c,0)-1);
        }
        for(Map.Entry<Character,Integer> me:hm.entrySet()){
            if(me.getValue()!= 0)
                return false;
        }

        return true;
    }
}
