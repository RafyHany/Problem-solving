class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] freq = new int[k];
        for(int x : arr){
            if(x < 0){
                x *= -1 ;
                x %= k ;
                x = k - x ;
            } 
            freq[x % k]++;
        }
        for(int i = 0 ; i < k ; i++){
            while(freq[i] > 0 ){
                if(freq[(k - i) % k] == 0)
                    return false;
                freq[i]-- ;
                freq[(k - i) % k]-- ;
                if(freq[i] < 0)
                    return false ;
            }
        }
        return true;
    }
}