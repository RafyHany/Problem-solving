class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> circle = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++)
            circle.add(i + 1) ;
        int removedIndex = 0 ;
        while (circle.size() > 1){
            removedIndex = (k + removedIndex - 1) % circle.size() ;
            circle.remove(removedIndex) ;
        }
        return circle.getFirst();
    }
}