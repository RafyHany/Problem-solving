class Solution {
    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        ArrayList[] graphFirst = new ArrayList[k + 1 ] ;
        ArrayList[] graphSecond = new ArrayList[k + 1] ;
        buildGraph(graphFirst , rowConditions) ;
        buildGraph(graphSecond , colConditions) ;
        int visited1[] = new int[k + 1] ;
        int visited2[] = new int[k + 1] ;
        for(int i = 1 ; i <= k ; ++i){
            if(visited1[i] == 0)
                if(checkCycle(graphFirst , visited1, i))
                    return new int[0][0] ;
            if(visited2[i] == 0)
                if(checkCycle(graphSecond , visited2 , i))
                    return new int[0][0] ;
        }
        int[] rowOrder = topologicalSort(graphFirst) ;
        int[] colOrder = topologicalSort(graphSecond) ;
        int[][] matrix = new int[k][k] ;
        int[][] indexes = new int[k + 1][2] ;
        for(int i = 0 ; i < k ; ++i){
            indexes[rowOrder[i]][0] = i;
            indexes[colOrder[i]][1] = i;
        }
        for(int i = 1 ; i <= k ; i++){
            int iIndex = indexes[i][0] ;
            int jIndex = indexes[i][1] ;
            matrix[iIndex][jIndex] = i ;
        }
        return matrix ;
    }
    private void buildGraph(ArrayList[] graph , int[][] conditions){
        for(int i = 0 ; i < graph.length ; ++i)
            graph[i] = new ArrayList<>() ;
        for(int[] condition : conditions){
            int to = condition[0] ;
            int from = condition[1] ;
            graph[to].add(from) ;
        }
        return ;
    }
    private boolean checkCycle(ArrayList[] graph , int[] visited , int node){
        // 0 -> not visited , 1 -> visiting , 2 -> visited and in my path
        if(visited[node] == 2)
            return true ;
        if(visited[node] == 1)
            return false ;
        visited[node] = 2 ;
        for(int i = 0 ; i < graph[node].size() ; ++i){
            if(checkCycle(graph , visited , (int)graph[node].get(i)))
                return true ;
        }
        visited[node] = 1 ;
        return false ;
    }
    private int[] topologicalSort(ArrayList[] graph){
        int[] inDegree = new int[graph.length] ;
        for(int i = 1 ; i < graph.length ; ++i){
            for(int j = 0 ; j < graph[i].size() ; ++j)
                inDegree[(int) graph[i].get(j)]++ ;
        }
        // Queue to store vertices with indegree 0
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i < inDegree.length; i++) {
            if (inDegree[i] == 0 ) {
                q.offer(i);
            }
        }

        int[] result = new int[inDegree.length - 1];
        int index = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            result[index++] = node;
            for (int it : (ArrayList<Integer>) graph[node]) {
                inDegree[it]--;
                if (inDegree[it] == 0) {
                    q.offer(it);
                }
            }
        }

        return result;
    }
}