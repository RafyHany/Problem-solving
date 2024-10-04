class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long sumOfChemistry = 0 ;
        int chemistry = skill[0] + skill[skill.length - 1 ] ;
        
        for(int i = 0 ; i < skill.length / 2; ++i){
            int currentChemistry = (skill[i] + skill[skill.length - 1 - i]) ;
            if(currentChemistry == chemistry)
                sumOfChemistry +=  (skill[i] * skill[skill.length - 1 - i]);
            else{
                sumOfChemistry = -1;
                break;
            }
                
        }
        return sumOfChemistry ;
    }
}