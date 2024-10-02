class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int [] temp = Arrays.copyOf(arr , arr.length);
        Arrays.sort(temp);
        int rankCounter = 1 ;
        HashMap<Integer , Integer> rank = new HashMap<>();
        for(int i = 0 ; i < arr.length ; ++i){
            if(!rank.containsKey(temp[i]))
                rank.put(temp[i],rankCounter++);
        }
        for(int i = 0 ; i < arr.length ; ++i)
            arr[i] = rank.get(arr[i]);

        return arr ;
    }
}