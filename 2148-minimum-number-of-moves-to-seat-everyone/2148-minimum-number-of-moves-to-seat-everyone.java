class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        countSort(seats);
        countSort(students);
        int moves = 0 ;
        for(int i = 0 ; i < students.length ; ++i)
            moves += Math.abs(seats[i] - students[i]);
        
        return moves ;
    
    }
    private void countSort(int[] arr){
        int[] count = new int[101];
        for(int i = 0 ; i < arr.length ; ++i)
            count[arr[i]]++;
        int index = 0 ;
        for(int i = 0 ; i < count.length ; ++i){
            while(count[i]-- > 0)
                arr[index++] = i ;
        }
    }
}