class Solution {
    public int[] frequencySort(int[] nums) {
        TreeMap<Integer , Integer> map = new TreeMap<>(Collections.reverseOrder()) ;
        for (int num : nums)
            map.put(num , map.getOrDefault(num , 0) + 1) ;
        int[] freq = new int[map.size()] ;
        int index = 0 ;
        for(Map.Entry<Integer,Integer> map1 : map.entrySet())
            freq[index++] = map1.getValue();
        Arrays.sort(freq);
        int[] result = new int[nums.length] ;
        index = 0 ;
        for (int k : freq) {
            for (Map.Entry<Integer, Integer> map1 : map.entrySet()) {
                if (map1.getValue() == k) {
                    for (int j = 0; j < k; ++j)
                        result[index++] = map1.getKey();
                    map.remove(map1.getKey());
                    break;
                }
            }
        }
        return result ;
    }
}