class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // key : n, value : freq(n) using the getOrDefault() method

        // this is what getOrDefault(n,0) internally is :-
        // if (map.containsKey(n)) {return map.get(n);} 
        // else {return 0;}

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int maxFreq = 0;

        //map :- {1=3, 2=2, 3=1}
        // map.entrySet() :- [(1=3), (2=2), (3=1)]. Each element in this set is a Map.Entry<Integer, Integer>.

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
            }
        }

        // alternate to find maxfreq :- 
        // for (int i : map.values()) {
        //     maxFreq = Math.max(maxFreq, i);
        // }

        // we need to initialise the list to avoid *nullpointerexception*
        // bucket[i] itself is a List<Integer>, but bucket[i] contains integers, not lists
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
                if (idx == k)
                    break;
            }
        }
        return result;
    }
}