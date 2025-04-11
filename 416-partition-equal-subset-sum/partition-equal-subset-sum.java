class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int s=0;
        for (int i=0;i<n;i++)
            s+= nums[i];
        if (s % 2 != 0) return false;
        boolean[] dp = new boolean[10001];
        dp[0] = true;
        for (int num : nums) {
            for (int j=10000;j>=num;j--) {
                dp[j] = dp[j]||dp[j-num];
            }
            if(dp[s/2]) return true;
        }
        return dp[s/2];
    }
}