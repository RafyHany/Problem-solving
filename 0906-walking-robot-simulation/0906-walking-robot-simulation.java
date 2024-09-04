import java.util.HashSet;
import java.util.Set;

class Solution {
    int direction = 0 ;
    int right = 0 ;
    int top = 1 ;
    private void setDirections(int directions){
        if(directions == -1)
            direction = (direction + 1) % 4 ;
        else
            direction = (direction + 3) % 4 ;
        switch(direction){
            case 0 :
                right = 0 ;
                top = 1 ;
                break;
            case 1 :
                right = 1 ;
                top = 0 ;
                break;
            case 2 :
                right = 0 ;
                top = -1 ;
                break;
            case 3 :
                right = -1 ;
                top = 0 ;
                break;
        }
    }
    private int euclideanDistance(int x , int y){
        return x * x + y * y ;
    }

        public int robotSim(int[] commands, int[][] obstacles) {
            int x = 0 , y = 0 ;
            int maxDistance=0;
            Set<String> obstacleSet=new HashSet<>();
            for(int[] obstacle:obstacles){
                obstacleSet.add(obstacle[0]+","+obstacle[1]);
            }
            for(int cmd:commands){
                if(cmd < 0){
                    setDirections(cmd) ;
                }else{
                    for(int i=0;i<cmd;i++){
                        int nx = x + right;
                        int ny = y + top;
                        if(obstacleSet.contains(nx+","+ny)){
                            break;
                        }
                        x = nx;
                        y = ny;
                        maxDistance=Math.max(maxDistance,euclideanDistance(x , y));
                    }
                }
            }
            return maxDistance;
        }

}


