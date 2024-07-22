class Solution {
    
    public String[] sortPeople(String[] names, int[] heights) {
        int size = names.length;
        HashMap<Integer,String> map = new HashMap<>();
        for(int i = 0 ; i < size ; ++i)
            map.put(heights[i] , names[i]) ;
        Arrays.sort(heights);
        int index = 0 ;
        String[] result = new String[size] ;
        for(int i = size - 1 ; i >= 0 ; i--)
            result[index++] = map.get(heights[i]) ;
        
        return result ;
    }
}