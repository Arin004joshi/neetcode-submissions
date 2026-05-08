class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];
        // key : n, value : freq(n) using the getOrDefault() method
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // convert the set of k,v into a list to sort them afterwards
        List<Map.Entry<Integer, Integer>> mapEntry = new ArrayList<>(map.entrySet());

        //In Java’s sorting logic:
        // If result > 0, then b should come before a.
        // If result < 0, then a should come before b.
        // If result = 0, their order doesn’t matter.
        mapEntry.sort((a, b) -> {
            return b.getValue() - a.getValue();
        });

        //mapEntry is a List :-
        //but each element inside that list is a Map.Entry (a key–value pair from your HashMap).
        for (int i = 0; i < k; i++) {
            res[i] = mapEntry.get(i).getKey();
        }
        return res;
    }
}