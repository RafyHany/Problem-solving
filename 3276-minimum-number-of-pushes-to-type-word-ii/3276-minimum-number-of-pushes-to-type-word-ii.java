class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26] ;
        for(int i = 0 ; i < word.length() ; ++i)
            freq[(int)word.charAt(i) - 97] ++ ;
        List<MapCharacterWithFreq> sortedFreq = new ArrayList<>();
        for(int i = 0 ; i < freq.length ;++i)
            sortedFreq.add(new MapCharacterWithFreq((char)(i+97) , freq[i])) ;
        sortedFreq.sort((a, b) -> b.freq - a.freq);
        int numberOfCharacterPerKey = 0 ;
        int res = 0 ;
        for(MapCharacterWithFreq key : sortedFreq){
            res += ((numberOfCharacterPerKey++/8)+1) * key.freq;
        }
        return  res ;
    }
    class MapCharacterWithFreq {
        char c ;
        int freq ;
        MapCharacterWithFreq(char c , int freq){
            this.c = c ;
            this.freq = freq ;
        }

    }
}