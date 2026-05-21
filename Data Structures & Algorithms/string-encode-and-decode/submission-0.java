class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String s:strs){
            sb.append(s.length()).append("#").append(s); //5#Hello5#World
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int n=str.length();
        int i=0;
        while(i<n){
            int len=0;
            
            while(str.charAt(i)!='#'){
                int m=Integer.parseInt(Character.toString(str.charAt(i)));
                len=len*10+m;
                i++;
            }
            i++; //to skip #
            
            String temp= str.substring(i, len+i);
            result.add(temp);
            i+=len;
        }

        return result;
    }
}
