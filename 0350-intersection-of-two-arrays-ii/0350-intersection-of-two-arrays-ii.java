class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int ele : nums1){
            if(freq.containsKey(ele))
                freq.put(ele,freq.get(ele) + 1);
            else
                freq.put(ele,1) ;
        }
        for(int ele : nums2){
            if(freq.containsKey(ele)){
                res.add(ele) ;
                int freqs = freq.get(ele) ;
                if(freqs == 1)
                    freq.remove(ele);
                else
                    freq.put(ele , freqs - 1) ;
            }

        }
        int[] finalRes = new int[res.size()] ;
        for(int i = 0 ; i < res.size() ; i++ )
            finalRes[i] = res.get(i) ;
        return  finalRes;
    }
}