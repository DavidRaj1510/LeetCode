class Solution {
    public long numberOfPowerfulInt(long start, long end, int limit, String s) {
        String left = Long.toString(start - 1);
        String right= Long.toString(end);
        return calculate(right,s,limit)-calculate(left, s, limit);
    }
    private long calculate(String x, String s, int limit){
        if(x.length() < s.length()) return 0;
        if(x.length() == s.length()) return x.compareTo(s) >= 0 ? 1:0;
        String suffix = x.substring(x.length() - s.length());
        long c = 0;
        int len = x.length() - s.length();
        for(int i = 0; i<len; i++){
            int digit = x.charAt(i) - '0';
            if(limit < digit){
                c += (long) Math.pow(limit + 1,len-i);
                return c;
            }
            c += (long) (digit)*(long) Math.pow(limit+1,len-1-i);
        }
        if(suffix.compareTo(s) >= 0){
            c++;
        }
        return c;
    }
}