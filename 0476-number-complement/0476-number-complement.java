class Solution {
    public int findComplement(int num) {
        int numberOfBits = (int)Math.ceil((int)(Math.log10(num)/Math.log10(2)))  ;
        long andOperator = (int)Math.pow(2,numberOfBits) - 1 ;
        long res = (~num) & (int)andOperator ;
        return  (int)res ;
    }
}