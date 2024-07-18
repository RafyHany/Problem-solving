class Solution {
   public double averageWaitingTime(int[][] customers) {
        double waitingTime = 0.0 ;
        double time = 1 ;
        for(int i = 0 ; i < customers.length ; i++){
            if(customers[i][0] >= time ){
                waitingTime += customers[i][1] ;
                time =customers[i][0] + customers[i][1] ;
            }else{
                waitingTime += time - customers[i][0] ;
                waitingTime += customers[i][1] ;           
                time += customers[i][1] ;
            }
            

        }


        return waitingTime /  customers.length ;
    }
}