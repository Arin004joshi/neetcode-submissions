class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> {
            if (a[1] != b[1]) {
                return b[1] - a[1];
            } else {
                return b[0]-a[0];
            }
        });
        for (int num : arr) {
            int diff = Math.abs(x - num);
            heap.offer(new int[] {num, diff});
            if (heap.size() > k) {
                heap.poll();
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            res.add(heap.poll()[0]);
        }
        Collections.sort(res);
        return res;
    }
}