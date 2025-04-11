class Solution {
    public int[] closestPrimes(int left, int right) {
        int f=-1,minDiff=Integer.MAX_VALUE;
        int ans[]={-1,-1};
        for(int i=left;i<=right;i++)
        {
            if(isPrime(i))
            {
                if(f!=-1 && i-f <minDiff)
                {
                    ans[0]=f;
                    ans[1]=i;
                    minDiff=i-f;
                }
                f=i;
            }
        }
        return ans;
    }
    public boolean isPrime(int n)
    {
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
}