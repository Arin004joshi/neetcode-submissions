class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxFreq = 0;
        for (int num : map.values()) {
            maxFreq = Math.max(maxFreq, num);
        }
        List<Integer>[] Bucket = new List[maxFreq + 1];
        for (int i = 0; i <= maxFreq; i++) {
            Bucket[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Bucket[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];
        int idx = 0;
        for (int i = maxFreq; i >= 0 && idx<k; i--) {
            for (int num : Bucket[i]) {
                res[idx++] = num;
                if (idx == k) {
                    break;
                }
            }
        }
        return res;
    }
}
