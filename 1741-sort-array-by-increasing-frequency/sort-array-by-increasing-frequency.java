class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : nums)
        {
        hm.put(num,hm.getOrDefault(num,0)+1);
        }
        Integer newArray[] = new Integer[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            newArray[i]=nums[i];
        }
        Arrays.sort(newArray, (a,b)->{
            int freqA=hm.get(a);
            int freqB=hm.get(b);
            if(freqA==freqB) return b-a;
            return freqA-freqB;
        });
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=newArray[i];
        }
        return nums;
    }
}