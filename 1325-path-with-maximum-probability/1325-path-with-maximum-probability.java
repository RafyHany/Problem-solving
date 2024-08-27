class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        double[] probs = new double[n];
        probs[start_node] = 1.0 ;
        for(int i = 0 ; i < n - 1 ; ++i){
            boolean update = false ;
            for(int j = 0 ; j < edges.length ; ++j){
                int u = edges[j][0];
                int v = edges[j][1];
                double currProb = succProb[j] ;
                if(currProb * probs[u] > probs[v] ){
                    probs[v] = currProb * probs[u] ;
                    update = true ;
                }
                if(currProb * probs[v] > probs[u] ){
                    probs[u] = currProb * probs[v] ;
                    update = true ;
                }
            }
            if(!update)
                break;
        }
        return probs[end_node];
    }
}