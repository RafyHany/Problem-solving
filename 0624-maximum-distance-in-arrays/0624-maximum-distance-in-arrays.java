class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).getLast();
        int maxDistance = 0;

        for (int i = 1; i < arrays.size(); i++) {
            maxDistance = Math.max(maxDistance, Math.abs(arrays.get(i).getLast() - min));
            maxDistance = Math.max(maxDistance, Math.abs(max - arrays.get(i).get(0)));
            min = Math.min(min, arrays.get(i).get(0));
            max = Math.max(max, arrays.get(i).getLast());
        }

        return maxDistance;
    }
}