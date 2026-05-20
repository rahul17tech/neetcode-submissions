class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freqMap=new HashMap<>();
        for(int i:nums)
            freqMap.put(i,freqMap.getOrDefault(i,0)+1); //frequency added

        List<Integer>[] bucket= new ArrayList[nums.length+1];
        for(int key:freqMap.keySet()){
            int freq= freqMap.get(key);
            if(bucket[freq]==null)
                bucket[freq]=new ArrayList<>();
            bucket[freq].add(key);
        }

        List<Integer> result=new ArrayList<>();

        for(int i=bucket.length-1;i>=0;i--){
            if(result.size()>=k)
                break;
            
            if(bucket[i]!=null)
                result.addAll(bucket[i]);
        }

        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=result.get(i);
        }

        return res;
    }
}
