class Solution {
    public static int nthUglyNumber(int n) {
        int[] factors = {2 , 3 , 5 } ;
        int[] indexes = {0 , 0 , 0} ;
        ArrayList<Integer> uglyNumbers = new ArrayList<>() ;
        uglyNumbers.add(1);
        for(int i = 1 ; i < n ; i++){
            int factor2 = uglyNumbers.get(indexes[0]) * 2 ;
            int factor3 = uglyNumbers.get(indexes[1]) * 3 ;
            int factor5 = uglyNumbers.get(indexes[2]) * 5 ;
            
            int num = Math.min(factor2 , Math.min(factor3 , factor5)) ;
            uglyNumbers.add(num) ;
            if(num == factor2)
                indexes[0]++;
            if (num == factor3) 
                indexes[1]++;
            if(num == factor5) 
                indexes[2]++;
        }
        
        
        return uglyNumbers.get(n - 1) ;
    }
}