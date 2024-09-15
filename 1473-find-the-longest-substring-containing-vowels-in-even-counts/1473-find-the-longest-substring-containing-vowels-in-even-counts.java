class Solution {
    public int findTheLongestSubstring(String s) {
        HashMap<Integer , Integer> firstOccurrence = new HashMap<>();
        firstOccurrence.put(0 , -1 ) ;
        int mask = 0 ;
        int maxLen = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            mask = getMask(mask , s.charAt(i));
            if(firstOccurrence.containsKey(mask))
                maxLen = Math.max(maxLen , i - firstOccurrence.get(mask));
            else
                firstOccurrence.put(mask , i) ;
        }
        return maxLen ;
    }

    private int getMask(int mask , char c ){
        switch (c){
            case 'a':
                mask ^= 1 ;
                break;
            case 'e':
                mask ^= 2;
                break;
            case 'i':
                mask ^= 4;
                break;
            case 'o':
                mask ^= 8;
                break;
            case 'u':
                mask ^= 16;
                break;
        }
        return  mask ;
    }

}