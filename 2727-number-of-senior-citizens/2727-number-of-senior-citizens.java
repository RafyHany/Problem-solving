class Solution {
    public int countSeniors(String[] details) {
        int numberOfSeniors = 0 ;
        
        for(String detail : details) {
            int ageOfSenior = Integer.parseInt(detail.substring(11,13));
            numberOfSeniors = ageOfSenior > 60 ? numberOfSeniors + 1 : numberOfSeniors;
        }
        return numberOfSeniors ;
    }
}