class Solution {
   public int findContentChildren(int[] g, int[] s) {
        int content = 0 ;
        int i = 0 , j = 0 ;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i < g.length && j < s.length){
            if(s[j] >= g[i]){
                content++;
                j++;
                i++;
            }
            else{
                j++;
            } 
        }

        return content ;
    }
}