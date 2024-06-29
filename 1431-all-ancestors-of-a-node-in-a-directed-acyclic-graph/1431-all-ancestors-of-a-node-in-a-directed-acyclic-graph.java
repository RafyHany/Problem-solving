class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> ancestors = new ArrayList<>(n) ;
        for(int i = 0 ; i < n ; ++i){
            ancestors.add(i , new ArrayList<>());
        }
        ArrayList<ArrayList<Integer>> graph = buildGraph(n,edges);
        for(int[]edge : edges){
            int from = edge[0] ;
            int to = edge[1];
            dfs(graph,ancestors,from , to) ;
        }
        for(int i = 0 ; i < n ; i++){
            Collections.sort(ancestors.get(i));
        }


        return ancestors ;
    }
    public ArrayList<ArrayList<Integer>>  buildGraph(int n, int[][] edges ) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(n) ;
        for(int i = 0  ; i < n ; ++i){
            graph.add(i,new ArrayList<>());
        }
        for(int i = 0  ; i < edges.length ; ++i){
            int from = edges[i][0] ;
            int to = edges[i][1] ;
            graph.get(from).add(to);
        }
        return graph;
    }
    private void dfs(ArrayList<ArrayList<Integer>> graph  , List<List<Integer>> ancestors , int ancestor,int node ){
        if(ancestors.get(node).contains(ancestor))
            return;
        ancestors.get(node).add(ancestor) ;
        for(int adj : graph.get(node)){
            dfs(graph,ancestors,ancestor,adj);
        }
    }
}