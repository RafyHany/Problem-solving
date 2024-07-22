class Solution {
    
    public String[] sortPeople(String[] names, int[] heights) {
        int size = names.length;
        HashMap<Integer,String> map = new HashMap<>();
        for(int i = 0 ; i < size ; ++i)
            map.put(heights[i] , names[i]) ;
        Arrays.sort(heights);
        reverse(heights);
        String[] result = new String[size] ;
        for(int i = 0 ; i < size ; ++i)
            result[i] = map.get(heights[i]) ;
        for(int i = 0 ; i < size ; ++i)
            System.out.print(heights[i] + " ");
        return result ;
    }
    private void reverse (int[] arr){
        int size = arr.length ;
        for(int i = 0 ; i < size/2 ; ++i){
            int temp = arr[i] ;
            arr[i] = arr[size - i - 1] ;
            arr[size - i - 1] = temp ;
        }
    }
}