class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==1)
            return List.of(List.of(strs[0]));
        HashMap<String,List<String>> hm=new HashMap<>();
        List<List<String>> res=new ArrayList<>();
        
        for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String ss=new String(c);
            if(hm.containsKey(ss))
                hm.get(ss).add(s);
            else{
                hm.put(ss,new ArrayList<>());
                hm.get(ss).add(s);
            }
            
        }
        for(Map.Entry<String,List<String>> me:hm.entrySet()){
            res.add(me.getValue());
        }
        return res;
    }
}
