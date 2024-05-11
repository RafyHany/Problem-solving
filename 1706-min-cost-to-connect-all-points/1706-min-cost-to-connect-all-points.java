class Solution {
    class Edge{
        int src ;
        int des ;
        int weight ;
        public Edge(int src , int des , int weight){
            this.src = src ;
            this.des = des ;
            this.weight = weight ;
        }
    }
    public void buildGraph(int[][] points , ArrayList<Edge>[] graph ){
        int n = points.length ;
        for(int i = 0 ; i < n ; i++){
            graph[i] = new ArrayList<>() ;
            for(int j = 0 ; j < n ; ++j){
                if(i==j)
                    continue;
                int x1 = points[i][0] ;
                int y1 = points[i][1] ;
                int x2 = points[j][0] ;
                int y2 = points[j][1] ;
                int weight = Math.abs(x1-x2) + Math.abs(y1-y2) ;
                graph[i].add(new Edge(i,j,weight));
            }
        }
    }
    public int minCostConnectPoints(int[][] points) {
        int cost = 0 ;
        int n = points.length ;
        boolean[] vis = new boolean[n] ;
        ArrayList<Edge>[] graph = new ArrayList[n] ;
        buildGraph(points,graph) ;
        PriorityQueue<Edge> p = new PriorityQueue<>((x,y)-> x.weight - y.weight);
        p.offer(new Edge(0,0,0));
        while(!p.isEmpty()){
            Edge e = p.remove();
            int des = e.des ;
            if(!vis[des]){
                vis[des] = true ;
                cost += e.weight ;
                for(int i = 0 ; i < graph[des].size() ; ++i){
                    if(!vis[graph[des].get(i).des])
                        p.offer(graph[des].get(i)) ;
                }
            }

        }
        return cost ;
    }
}