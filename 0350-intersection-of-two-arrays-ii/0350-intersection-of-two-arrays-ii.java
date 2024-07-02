class Solution {
    public int[] intersect(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0 , j = 0 ;
        ArrayList<Integer> res = new ArrayList<>();
        while (i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                res.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) 
                i++ ;
            else 
                j++ ;
        }
        int[] finalRes = new int[res.size()] ;
        for(int k = 0 ; k < res.size() ; k++ )
            finalRes[k] = res.get(k) ;
        return finalRes ;
    }

    //    public int[] intersect(int[] nums1, int[] nums2) {
//        HashMap<Integer,Integer> freq = new HashMap<>();
//        ArrayList<Integer> res = new ArrayList<>();
//        for(int ele : nums1){
//            if(freq.containsKey(ele))
//                freq.put(ele,freq.get(ele) + 1);
//            else
//                freq.put(ele,1) ;
//        }
//        for(int ele : nums2){
//            if(freq.containsKey(ele)){
//                res.add(ele) ;
//                int freqs = freq.get(ele) ;
//                if(freqs == 1)
//                    freq.remove(ele);
//                else
//                    freq.put(ele , freqs - 1) ;
//            }
//
//        }
//        int[] finalRes = new int[res.size()] ;
//        for(int i = 0 ; i < res.size() ; i++ )
//            finalRes[i] = res.get(i) ;
//        return  finalRes;
//    }
}