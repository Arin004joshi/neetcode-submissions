class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        List<Integer> list = new ArrayList<>();
        for (int num : spells) {
            int low = 0;
            int high = potions.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if ((long) num * potions[mid] >= success) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            list.add(potions.length - low);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}