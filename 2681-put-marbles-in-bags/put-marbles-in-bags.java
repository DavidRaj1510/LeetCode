class Solution {
    public long putMarbles(int[] weights, int k) {
        if (k == 1) {
            return 0;
        }
        ArrayList<Integer> ps = new ArrayList<>();
        for (int i = 0; i < weights.length - 1; i++) {
            ps.add(weights[i] + weights[i + 1]);
        }
        Collections.sort(ps);
        long min = 0, max = 0;
        for (int i = 0; i < k - 1; i++) {
            min+= ps.get(i);
            max += ps.get(ps.size() - 1 - i);
        }
        return max - min;
    }
}