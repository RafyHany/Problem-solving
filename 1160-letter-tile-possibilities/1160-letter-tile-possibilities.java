class Solution {
    public int numTilePossibilities(String tiles) {
        HashSet<String> possibilities = new HashSet<>();
        boolean[] visited = new boolean[tiles.length()];
        getAllPossibilities(visited, possibilities, tiles, "");
        return possibilities.size() - 1 ;
    }
    public void getAllPossibilities(boolean[] visited , HashSet<String>possibilities , String tiles , String currentTile ){
        if(possibilities.add(currentTile)){
            for(int i = 0 ; i < tiles.length() ; i ++){
                if(!visited[i]){
                    visited[i] = true;
                    getAllPossibilities(visited, possibilities, tiles, currentTile + tiles.charAt(i));
                    visited[i] = false;
                }
            }
        }
    }
}