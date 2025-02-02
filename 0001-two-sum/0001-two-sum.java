class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer ,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int searchedValue = target - nums[i];
            if(map.containsKey(searchedValue))
                return new int[]{map.get(searchedValue) , i};
            map.put(nums[i] , i);
        }
        return new int[]{-1 , -1};
    }
}