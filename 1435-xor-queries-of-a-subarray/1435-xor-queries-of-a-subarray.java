class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] res = new int[queries.length];
        int[] prefixXOR = new int[arr.length + 1];
        for(int i = 0 ; i < arr.length ; ++i)
            prefixXOR[i + 1] = prefixXOR[i] ^ arr[i] ;
        for(int i = 0 ; i < queries.length ; ++i)
            res[i] = prefixXOR[queries[i][0]] ^ prefixXOR[queries[i][1] + 1];
        
        return  res ;
    }
}