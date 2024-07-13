class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        Robot[] robots = new Robot[positions.length] ;
        for(int i = 0 ; i < robots.length ; ++i)
            robots[i] = new Robot(positions[i],healths[i],directions.charAt(i) , i) ;

        Arrays.sort(robots , (a,b) -> a.position - b.position) ;
        Stack<Robot> survived = new Stack<>() ;
        for(int i = 0 ; i < robots.length ; ++i ){
            if(robots[i].direction == 'L'){
                boolean add = true;
                while(!survived.isEmpty() && survived.peek().direction == 'R' && add ){
                    if(robots[i].health > survived.peek().health){
                        robots[i].health-- ;
                        survived.pop();
                    } else if (robots[i].health < survived.peek().health) {
                        survived.peek().health-- ;
                        add = false ;
                    }else {
                        survived.pop();
                        add = false ;
                    }
                }
                if(add)
                    survived.push(robots[i]) ;
            }else
                survived.push(robots[i]) ;
        }

        List<Robot> res = new ArrayList<>() ;
        while(!survived.empty())
            res.add(survived.pop()) ;
        Collections.sort(res , (a,b) -> a.index - b.index) ;
        
        List<Integer> finalRes = new ArrayList<>() ;
        for(int i = 0 ; i < res.size() ; ++i)
            finalRes.add(res.get(i).health) ;



        return finalRes ;
    }
    class Robot implements Comparator<Robot>{
        int position ;
        int health ;
        char direction ;
        int index ;

        public Robot(int position, int health, char direction , int index) {
            this.position = position;
            this.health = health;
            this.direction = direction;
            this.index = index ;
        }


        @Override
        public int compare(Robot o1, Robot o2) {

            return o1.position - o2.position;
        }
    }
}