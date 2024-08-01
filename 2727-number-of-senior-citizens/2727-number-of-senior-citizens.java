class Solution {
    public int countSeniors(String[] details) {
        int numberOfSeniors = 0 ;
        StringBuilder age ;
        for(String detail : details) {
            age = new StringBuilder();
            age.append(detail, 11, 13);
            int ageOfSenior = Integer.parseInt(age.toString());
            numberOfSeniors = ageOfSenior > 60 ? numberOfSeniors + 1 : numberOfSeniors;
        }
        return numberOfSeniors ;
    }
}