class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            int lcm=nums[i];
            if(lcm==k) c++;
            for(int j=i+1;j<nums.length;j++)
            {
                lcm=getLCM(lcm,nums[j]);
                if(lcm==k) c++;
                if(lcm>k) break;
            }
        }
        return c;
    }
    public static int getLCM(int a, int b)
    {
        return (a*b/gcd(a,b));
    }
    public static int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}