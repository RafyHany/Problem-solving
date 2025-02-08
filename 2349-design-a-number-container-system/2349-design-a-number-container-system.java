class NumberContainers {
    private final HashMap<Integer , Integer> indexWithNumber ;
    private final HashMap<Integer , PriorityQueue<Integer>> indicesOfNumber ;
    private final HashMap<Integer , HashSet<Integer>> numberContainIndex ;
    
    public NumberContainers() {
        indexWithNumber = new HashMap<>() ;
        indicesOfNumber = new HashMap<>() ;
        numberContainIndex = new HashMap<>() ;
    }

    public void change(int index, int number) {
        if(indexWithNumber.containsKey(index)){
            int oldNumber = indexWithNumber.get(index);
            numberContainIndex.get(oldNumber).remove(index);
        }
        if(!indicesOfNumber.containsKey(number)){
            indicesOfNumber.put(number , new PriorityQueue<>());
            numberContainIndex.put(number , new HashSet<>());
        }
        
        indicesOfNumber.get(number).add(index) ;
        numberContainIndex.get(number).add(index) ;
        indexWithNumber.put(index , number) ;
    }

    public int find(int number) {
        int minIndex = -1 ;
        if(indicesOfNumber.containsKey(number)){
            PriorityQueue pq = indicesOfNumber.get(number);
            HashSet<Integer> setOfIndices = numberContainIndex.get(number) ; 
            
            minIndex = (int)pq.peek() ;
            while(!setOfIndices.isEmpty() && !setOfIndices.contains(minIndex)){
                pq.poll();
                minIndex = (int)pq.peek() ;
            }
            System.out.println();
            if(setOfIndices.isEmpty()){
                indicesOfNumber.remove(number);
                numberContainIndex.remove(number);
                minIndex = -1 ;
            }
        }
        return minIndex;
    }
}


/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */