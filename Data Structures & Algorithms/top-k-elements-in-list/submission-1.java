class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // key : n, value : freq(n) using the getOrDefault() method
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int maxFreq = 0;

        //map :- {1=3, 2=2, 3=1}
        // map.entrySet() :- [(1=3), (2=2), (3=1)]. Each element in this set is a Map.Entry<Integer, Integer>.
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value > maxFreq) {
                maxFreq = value;
            }
        }

        // we need to initialise the list to avoid *nullpointerexception*
        List<Integer>[] bucket = new List[maxFreq + 1];
        for (int i = 0; i <= maxFreq; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            bucket[entry.getValue()].add(entry.getKey());
        }
        int[] result = new int[k];
        int idx = 0;

        for (int i = maxFreq; i >= 0 && idx < k; i--) {
            for (int num : bucket[i]) {
                result[idx++] = num;
                if (idx == k)break;
            }
        }

        return result;
    }
}