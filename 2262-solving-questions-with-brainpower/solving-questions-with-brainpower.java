class Solution {
    int n,q[][];
    Long[] f;
    public long mostPoints(int[][] q) {
        n = q.length;
        f = new Long[n];
        this.q = q;
        return dfs(0);
    }
    private long dfs(int i) {
        if (i >= n) return 0;
        if (f[i] != null) return f[i];
        int p = q[i][0], b = q[i][1];
        return f[i] = Math.max(p + dfs(i + b + 1), dfs(i + 1));
    }
}